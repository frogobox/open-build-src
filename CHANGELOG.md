## v1.0.2
- Adding Func for custom version
- Sample >> implementation(Androidx.appCompat) can call like this implementation(Androidx.appCompat("1.4.1"))

## v1.0.1
```kotlin
object Version {

    object AndroidX {
        const val appCompat = "1.4.1" // https://developer.android.com/jetpack/androidx/releases/appcompat?hl=id
        const val constraintLayout = "2.1.3" // https://developer.android.com/jetpack/androidx/releases/constraintlayout?hl=id
        const val collection = "1.2.0" // https://developer.android.com/jetpack/androidx/releases/collection?hl=id
        const val savedState = "1.1.0" // https://developer.android.com/jetpack/androidx/releases/savedstate?hl=id
        const val viewPager = "1.1.0-alpha01" // https://developer.android.com/jetpack/androidx/releases/viewpager
        const val viewPager2 = "1.0.0" // https://developer.android.com/jetpack/androidx/releases/viewpager2?hl=id
        const val preference = "1.2.0" // https://developer.android.com/jetpack/androidx/releases/preference?hl=id
        const val core = "1.7.0" // https://developer.android.com/jetpack/androidx/releases/core?hl=id
        const val liveCycle = "2.5.0-alpha03" // https://developer.android.com/jetpack/androidx/releases/lifecycle?hl=id
        const val liveCycleArch = "2.1.0" // https://developer.android.com/jetpack/androidx/releases/lifecycle?hl=id
        const val room = "2.4.2" // https://developer.android.com/jetpack/androidx/releases/room?hl=id
        const val work = "2.7.1" // https://developer.android.com/jetpack/androidx/releases/work?hl=id
        const val activityKtx = "1.4.0" // https://developer.android.com/jetpack/androidx/releases/activity
        const val fragmentKtx = "1.4.1" // https://developer.android.com/jetpack/androidx/releases/fragment
        const val navigationKtx = "2.4.1" // https://developer.android.com/jetpack/androidx/releases/navigation
        const val recyclerView = "1.3.0-alpha01" // https://developer.android.com/jetpack/androidx/releases/recyclerview
        const val recyclerViewSelection = "1.2.0-alpha01" // https://developer.android.com/jetpack/androidx/releases/recyclerview

        // TestImplementation
        const val junit4 = "4.13.2"

        // androidTestImplementation
        const val runner = "1.3.0"
        const val junit = "1.1.3"
        const val espressoCore = "3.4.0"
    }

    object Google {
        const val accompanist = "0.23.1" // https://github.com/google/accompanist
        const val material = "1.6.0-alpha03" // https://github.com/material-components/material-components-android/releases
        const val gson = "2.9.0" // https://github.com/google/gson
        const val admob = "20.6.0" // https://developers.google.com/admob/android/sdk
        const val userMessagingPlatform = "2.0.0" // https://developers.google.com/admob/ump/android/quick-start#install_with_gradle
        const val hilt = "2.41" // https://dagger.dev/hilt/gradle-setup
    }

    object JetBrains {
        const val kotlin = "1.6.10" // https://kotlinlang.org/docs/releases.html#release-details
        const val coroutines = "1.5.1" // https://github.com/Kotlin/kotlinx.coroutines
    }

    object Compose {
        const val activityCompose = "1.4.0" // https://androidx.tech/artifacts/activity/activity-compose/
        const val compose = "1.2.0-alpha04" // https://developer.android.com/jetpack/androidx/releases/compose
        const val navigation = "2.4.1" // https://androidx.tech/artifacts/navigation/navigation-compose/
        const val hiltNavigationCompose = "1.0.0" // https://developer.android.com/jetpack/androidx/releases/hilt?hl=id
        const val composeMultiPlatform = "1.1.0" // https://github.com/JetBrains/compose-jb
    }

    object Util {
        const val okHttp = "5.0.0-alpha.2"
        const val okHttpLogging = "4.9.3"

        const val retrofit = "2.9.0" // https://github.com/square/retrofit

        const val rxAndroid3 = "3.0.0" // https://github.com/ReactiveX/RxAndroid
        const val rxKotlin3 = "3.0.1" // https://github.com/ReactiveX/RxKotlin
        const val rxJava3 = "3.1.3" // https://github.com/ReactiveX/RxJava

        const val glideVersion = "4.13.0" // https://github.com/bumptech/glide

        const val coilVersion = "2.0.0-rc01" // https://coil-kt.github.io/coil/compose/

        const val koinVersion = "3.2.0-beta-1" // https://github.com/InsertKoinIO/koin

        const val ktorVersion = "2.0.0-beta-1" // https://ktor.io/
    }

}
```

## v1.0.0
New Release