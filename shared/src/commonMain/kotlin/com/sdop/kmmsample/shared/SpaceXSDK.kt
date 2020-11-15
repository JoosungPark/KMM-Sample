package com.sdop.kmmsample.shared

import com.sdop.kmmsample.shared.cache.Database
import com.sdop.kmmsample.shared.cache.DatabaseDriverFactory
import com.sdop.kmmsample.shared.entity.RocketLaunch
import com.sdop.kmmsample.shared.network.SpaceXApi

class SpaceXSDK(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = Database(databaseDriverFactory)
    private val api = SpaceXApi()

    @Throws(Exception::class)
    suspend fun getLaunches(forceReload: Boolean): List<RocketLaunch> {
        val cachedLaunches = database.getAllLaunches()
        return if (cachedLaunches.isNotEmpty() && !forceReload) {
            cachedLaunches
        } else {
            api.getAllLaunches().also {
                database.clearDatabase()
                database.createLaunches(it)
            }
        }
    }
}