package com.sdop.kmmsample.shared.cache

import com.squareup.sqldelight.db.SqlDriver
import com.sdop.kmmsample.shared.cache.AppDatabase

internal class Database(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = AppDatabase(databaseDriverFactory.createDriver())
//    private val dbQuery = databaseDriverFactory.appDatabaseQueries
}