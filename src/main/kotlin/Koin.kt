/**
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
    const val core = "io.insert-koin:koin-core:${Version.Util.koin}"
    fun core(version: String): String = "io.insert-koin:koin-core:$version"

    // Koin main features for Android (Scope,ViewModel ...)
    const val android = "io.insert-koin:koin-android:${Version.Util.koin_android}"
    fun android(version: String): String = "io.insert-koin:koin-android:$version"

    // Koin Java Compatibility
    const val androidCompat = "io.insert-koin:koin-android-compat:${Version.Util.koin_android}"
    fun androidCompat(version: String): String = "io.insert-koin:koin-android-compat:$version"

    // Koin for Jetpack WorkManager
    const val androidxWorkManager = "io.insert-koin:koin-androidx-workmanager:${Version.Util.koin_android}"
    fun androidxWorkManager(version: String): String = "io.insert-koin:koin-androidx-workmanager:$version"

    // Koin for Navigation Graph
    const val androidxNavigationGraph = "io.insert-koin:koin-androidx-navigation:${Version.Util.koin_android}"
    fun androidxNavigationGraph(version: String): String = "io.insert-koin:koin-androidx-navigation:$version"

    // Koin for Jetpack Compose
    const val androidxCompose = "io.insert-koin:koin-androidx-compose:${Version.Util.koin_android_compose}"
    fun androidxCompose(version: String): String = "io.insert-koin:koin-androidx-compose:$version"

    // Koin for Ktor
    const val ktor = "io.insert-koin:koin-ktor:${Version.Util.koin_ktor}"
    fun ktor(version: String): String = "io.insert-koin:koin-ktor:$version"

    // Testing
    const val test = "io.insert-koin:koin-test:${Version.Util.koin}"
    fun test(version: String): String = "io.insert-koin:koin-test:$version"

}