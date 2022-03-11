import Version.Util.koinVersion

/*
 * Created by faisalamir on 08/03/22
 * frogo-build-src
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 FrogoBox Inc.      
 * All rights reserved
 *
 */

object Koin {

    // Koin core features
    const val core = "io.insert-koin:koin-core:$koinVersion"
    fun core(version: String): String = "io.insert-koin:koin-core:$version"

    // Koin main features for Android (Scope,ViewModel ...)
    const val android = "io.insert-koin:koin-android:$koinVersion"
    fun android(version: String): String = "io.insert-koin:koin-android:$version"

    // Koin Java Compatibility
    const val androidCompat = "io.insert-koin:koin-android-compat:$koinVersion"
    fun androidCompat(version: String): String = "io.insert-koin:koin-android-compat:$version"

    // Koin for Jetpack WorkManager
    const val androidxWorkManager = "io.insert-koin:koin-androidx-workmanager:$koinVersion"
    fun androidxWorkManager(version: String): String = "io.insert-koin:koin-androidx-workmanager:$version"

    // Koin for Jetpack Compose
    const val androidxCompose = "io.insert-koin:koin-androidx-compose:$koinVersion"
    fun androidxCompose(version: String): String = "io.insert-koin:koin-androidx-compose:$version"

    // Koin for Ktor
    const val ktor = "io.insert-koin:koin-ktor:$koinVersion"
    fun ktor(version: String): String = "io.insert-koin:koin-ktor:$version"

    // Testing
    const val test = "io.insert-koin:koin-test:$koinVersion"
    fun test(version: String): String = "io.insert-koin:koin-test:$version"

}