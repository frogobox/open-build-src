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
    const val core = "io.insert-koin:koin-core:$koinVersion" // Koin core features
    const val android = "io.insert-koin:koin-android:$koinVersion" // Koin main features for Android (Scope,ViewModel ...)
    const val androidCompat = "io.insert-koin:koin-android-compat:$koinVersion" // Koin Java Compatibility
    const val androidxWorkManager = "io.insert-koin:koin-androidx-workmanager:$koinVersion" // Koin for Jetpack WorkManager
    const val androidxCompose = "io.insert-koin:koin-androidx-compose:$koinVersion" // Koin for Jetpack Compose
}