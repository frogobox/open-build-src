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

object Version {

    object Gradle {
        const val minSdk = 21
        const val compileSdk = 33
        const val targetSdk = compileSdk
    }

    object Ad {
        const val unityAds = "4.7.1" // https://developers.google.com/admob/android/mediation/unity#step_3_import_the_unity_ads_sdk_and_adapter
        const val startIo = "4.11.0" // https://support.start.io/hc/en-us/articles/360014774799-Integration-via-Maven
    }

    object Androidx {
        const val appCompat = "1.6.1" // https://developer.android.com/jetpack/androidx/releases/appcompat
        const val constraintLayout = "2.1.4" // https://developer.android.com/jetpack/androidx/releases/constraintlayout
        const val constraintLayoutCompose = "1.0.1" // https://developer.android.com/jetpack/androidx/releases/constraintlayout
        const val collection = "1.2.0" // https://developer.android.com/jetpack/androidx/releases/collection
        const val savedState = "1.2.1" // https://developer.android.com/jetpack/androidx/releases/savedstate
        const val viewPager = "1.0.0" // https://developer.android.com/jetpack/androidx/releases/viewpager
        const val viewPager2 = "1.0.0" // https://developer.android.com/jetpack/androidx/releases/viewpager2
        const val preference = "1.2.0" // https://developer.android.com/jetpack/androidx/releases/preference
        const val core = "1.10.1" // https://developer.android.com/jetpack/androidx/releases/core
        const val liveCycle = "2.6.1" // https://developer.android.com/jetpack/androidx/releases/lifecycle
        const val liveCycleArch = "2.2.0" // https://developer.android.com/jetpack/androidx/releases/lifecycle
        const val room = "2.5.1" // https://developer.android.com/jetpack/androidx/releases/room
        const val work = "2.8.1" // https://developer.android.com/jetpack/androidx/releases/work
        const val activityKtx = "1.7.2" // https://developer.android.com/jetpack/androidx/releases/activity
        const val fragmentKtx = "1.5.7" // https://developer.android.com/jetpack/androidx/releases/fragment
        const val navigationKtx = "2.5.3" // https://developer.android.com/jetpack/androidx/releases/navigation
        const val recyclerView = "1.3.0" // https://developer.android.com/jetpack/androidx/releases/recyclerview
        const val recyclerViewSelection = "1.1.0" // https://developer.android.com/jetpack/androidx/releases/recyclerview
        const val camerax = "1.2.3" // https://developer.android.com/jetpack/androidx/releases/camera#kts
        const val biometric = "1.1.0" // https://developer.android.com/jetpack/androidx/releases/biometric
        const val annotation = "1.6.0" // https://developer.android.com/jetpack/androidx/releases/annotation
        const val annotationExperimental = "1.3.0" // https://developer.android.com/jetpack/androidx/releases/annotation
        const val swipeRefreshLayout = "1.1.0" // https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout
        const val emoji2 = "1.3.0" // https://developer.android.com/jetpack/androidx/releases/emoji2

        // Compose Version
        const val composeActivity = "1.7.2" // https://androidx.tech/artifacts/activity/activity-compose/
        const val composeCompiler = "1.4.6" // https://developer.android.com/jetpack/androidx/releases/compose
        const val compose = "1.4.3" // https://developer.android.com/jetpack/androidx/releases/compose
        const val composeMaterial = "1.4.3" // https://developer.android.com/jetpack/androidx/releases/compose
        const val composeFoundation = "1.4.3" // https://developer.android.com/jetpack/androidx/releases/compose
        const val composeMaterial3 = "1.1.0" // https://developer.android.com/jetpack/androidx/releases/compose
        const val composeNavigation = "2.5.3" // https://androidx.tech/artifacts/navigation/navigation-compose/
        const val composeHiltNavigation = "1.0.0" // https://developer.android.com/jetpack/androidx/releases/hilt
        const val composeMultiPlatform = "1.4.0" // https://github.com/JetBrains/compose-jb

        // TestImplementation
        const val junit4 = "4.13.2" // https://junit.org/junit4/

        // androidTestImplementation
        const val runner = "1.3.0"
        const val junit = "1.1.3"
        const val espressoCore = "3.4.0"
    }

    object Google {
        const val accompanist = "0.30.0" // https://github.com/google/accompanist
        const val material = "1.9.0" // https://github.com/material-components/material-components-android/releases
        const val gson = "2.10.1" // https://github.com/google/gson
        const val admob = "22.1.0" // https://developers.google.com/admob/android/sdk
        const val userMessagingPlatform = "2.0.0" // https://developers.google.com/admob/ump/android/quick-start#install_with_gradle
        const val hilt = "2.46.1" // https://dagger.dev/hilt/gradle-setup
        const val adMediationUnityAd = "4.7.1.0" // https://developers.google.com/admob/android/mediation/unity#step_3_import_the_unity_ads_sdk_and_adapter
    }

    object JetBrains {
        // https://developer.android.com/jetpack/androidx/releases/compose-kotlin - Compability For Compose Version
        const val kotlin = "1.8.20" // https://kotlinlang.org/docs/releases.html#release-details
        const val coroutines = "1.7.1" // https://github.com/Kotlin/kotlinx.coroutines
    }

    object Util {
        const val okHttp = "4.10.0" // https://square.github.io/okhttp/ - https://search.maven.org/search?q=g:com.squareup.okhttp3
        const val retrofit = "2.9.0" // https://github.com/square/retrofit

        const val rxAndroid3 = "3.0.2" // https://github.com/ReactiveX/RxAndroid
        const val rxKotlin3 = "3.0.1" // https://github.com/ReactiveX/RxKotlin
        const val rxJava3 = "3.1.6" // https://github.com/ReactiveX/RxJava

        const val glide = "4.15.1" // https://github.com/bumptech/glide
        const val chucker = "3.5.2" // https://github.com/ChuckerTeam/chucker
        const val coil = "2.4.0" // https://coil-kt.github.io/coil/compose/

        const val koin = "3.4.0" // https://github.com/InsertKoinIO/koin
        const val koin_android = "3.4.0" // https://github.com/InsertKoinIO/koin
        const val koin_android_compose = "3.4.4" // https://github.com/InsertKoinIO/koin
        const val koin_ktor = "3.4.0" // https://github.com/InsertKoinIO/koin

        const val ktor = "2.2.4" // https://ktor.io/
        const val piracyChecker = "1.2.8" // https://github.com/javiersantos/PiracyChecker
        const val customActivityOnCrash = "2.4.0" // https://github.com/Ereza/CustomActivityOnCrash

        const val fastAdapter = "5.7.0" // https://github.com/mikepenz/FastAdapter

        const val balloon = "1.5.3" // https://github.com/skydoves/Balloon
    }

}