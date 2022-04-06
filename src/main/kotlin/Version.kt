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

object Version {

    object Gradle {
        const val minSdk = 21
        const val compileSdk = 32
        const val targetSdk = compileSdk
    }

    object Ad {
        const val unityAds = "4.1.0" // https://developers.google.com/admob/android/mediation/unity#step_3_import_the_unity_ads_sdk_and_adapter
    }

    object Androidx {
        const val appCompat = "1.4.1" // https://developer.android.com/jetpack/androidx/releases/appcompat?hl=id
        const val constraintLayout = "2.1.3" // https://developer.android.com/jetpack/androidx/releases/constraintlayout?hl=id
        const val collection = "1.2.0" // https://developer.android.com/jetpack/androidx/releases/collection?hl=id
        const val savedState = "1.1.0" // https://developer.android.com/jetpack/androidx/releases/savedstate?hl=id
        const val viewPager = "1.1.0-alpha01" // https://developer.android.com/jetpack/androidx/releases/viewpager
        const val viewPager2 = "1.0.0" // https://developer.android.com/jetpack/androidx/releases/viewpager2?hl=id
        const val preference = "1.2.0" // https://developer.android.com/jetpack/androidx/releases/preference?hl=id
        const val core = "1.7.0" // https://developer.android.com/jetpack/androidx/releases/core?hl=id
        const val liveCycle = "2.5.0-alpha04" // https://developer.android.com/jetpack/androidx/releases/lifecycle?hl=id
        const val liveCycleArch = "2.1.0" // https://developer.android.com/jetpack/androidx/releases/lifecycle?hl=id
        const val room = "2.4.2" // https://developer.android.com/jetpack/androidx/releases/room?hl=id
        const val work = "2.7.1" // https://developer.android.com/jetpack/androidx/releases/work?hl=id
        const val activityKtx = "1.4.0" // https://developer.android.com/jetpack/androidx/releases/activity
        const val fragmentKtx = "1.4.1" // https://developer.android.com/jetpack/androidx/releases/fragment
        const val navigationKtx = "2.4.1" // https://developer.android.com/jetpack/androidx/releases/navigation
        const val recyclerView = "1.3.0-alpha02" // https://developer.android.com/jetpack/androidx/releases/recyclerview
        const val recyclerViewSelection = "1.2.0-alpha01" // https://developer.android.com/jetpack/androidx/releases/recyclerview
        const val camerax = "1.1.0-beta03" // https://developer.android.com/jetpack/androidx/releases/camera#kts
        const val biometric = "1.2.0-alpha04" // https://developer.android.com/jetpack/androidx/releases/biometric
        const val annotation = "1.3.0" // https://developer.android.com/jetpack/androidx/releases/annotation
        const val annotationExperimental = "1.2.0" // https://developer.android.com/jetpack/androidx/releases/annotation

        // Compose Version
        const val composeActivity = "1.4.0" // https://androidx.tech/artifacts/activity/activity-compose/
        const val compose = "1.2.0-alpha07" // https://developer.android.com/jetpack/androidx/releases/compose
        const val composeMaterial3 = "1.2.0-alpha08" // https://developer.android.com/jetpack/androidx/releases/compose
        const val composeNavigation = "2.4.2" // https://androidx.tech/artifacts/navigation/navigation-compose/
        const val composeHiltNavigation = "1.0.0" // https://developer.android.com/jetpack/androidx/releases/hilt?hl=id
        const val composeMultiPlatform = "1.1.1" // https://github.com/JetBrains/compose-jb

        // TestImplementation
        const val junit4 = "4.13.2" // https://junit.org/junit4/

        // androidTestImplementation
        const val runner = "1.3.0"
        const val junit = "1.1.3"
        const val espressoCore = "3.4.0"
    }

    object Google {
        const val accompanist = "0.23.1" // https://github.com/google/accompanist
        const val material = "1.6.0-beta01" // https://github.com/material-components/material-components-android/releases
        const val gson = "2.9.0" // https://github.com/google/gson
        const val admob = "20.6.0" // https://developers.google.com/admob/android/sdk
        const val userMessagingPlatform = "2.0.0" // https://developers.google.com/admob/ump/android/quick-start#install_with_gradle
        const val hilt = "2.41" // https://dagger.dev/hilt/gradle-setup
        const val adMediationUnityAd = "4.1.0.0" // https://developers.google.com/admob/android/mediation/unity#step_3_import_the_unity_ads_sdk_and_adapter
    }

    object JetBrains {
        const val kotlin = "1.6.10" // https://kotlinlang.org/docs/releases.html#release-details
        const val coroutines = "1.6.0" // https://github.com/Kotlin/kotlinx.coroutines
    }

    object Util {
        const val okHttp = "5.0.0-alpha.6" // https://square.github.io/okhttp/ - https://search.maven.org/search?q=g:com.squareup.okhttp3
        const val retrofit = "2.9.0" // https://github.com/square/retrofit

        const val rxAndroid3 = "3.0.0" // https://github.com/ReactiveX/RxAndroid
        const val rxKotlin3 = "3.0.1" // https://github.com/ReactiveX/RxKotlin
        const val rxJava3 = "3.1.4" // https://github.com/ReactiveX/RxJava

        const val glide = "4.13.1" // https://github.com/bumptech/glide

        const val chucker = "3.5.2" // https://github.com/ChuckerTeam/chucker

        const val coil = "2.0.0-rc02" // https://coil-kt.github.io/coil/compose/

        const val koin = "3.2.0-beta-1" // https://github.com/InsertKoinIO/koin

        const val ktor = "2.0.0-beta-1" // https://ktor.io/
    }

}