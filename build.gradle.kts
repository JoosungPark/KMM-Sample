buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }

    val kotlinVersion = "1.4.10"
    val gradleVersion = "4.1.1"
    val sqlDelightVersion: String by project

    dependencies {
        classpath("com.android.tools.build:gradle:$gradleVersion")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
        classpath("com.squareup.sqldelight:gradle-plugin:$sqlDelightVersion")
    }
}

group = "com.sdop.kmmsample"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
