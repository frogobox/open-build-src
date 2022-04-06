![](https://raw.githubusercontent.com/amirisback/amirisback/master/docs/image/deprecated.png?raw=true)

## Don't using this stupid project, try migrate to [refreshVersion](https://github.com/jmfayard/refreshVersions/) for automatic upadte

## open-build-src
[![](https://jitpack.io/v/frogobox/open-build-src.svg?style=flat-square)](https://jitpack.io/#frogobox/open-build-src)

- Library for constant data buildSrc
- Library for calling constant variable for build.gradle.kts
- Develop using IntelliJ IDEA
- The requirement must already be using buildSrc
- License [Click Here](https://raw.githubusercontent.com/frogobox/open-build-src/master/LICENSE)
- Privacy Policy [Click Here](https://raw.githubusercontent.com/frogobox/open-build-src/master/PRIVACY-POLICY.md)

Repository for testing build from jitpack.io
- Red : Failed
- Green : Success / Pass

## Version Release
This Is Latest Release

    $version_release = 1.1.0

What's New??

    * Available for buildSrc Kotlin DSL *
    * Adding Func for custom version *
    * implementation(Androidx.appCompat) can call like this implementation(Androidx.appCompat("1.4.1")) *
    
```kotlin
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
        const val liveCycle = "2.5.0-alpha43" // https://developer.android.com/jetpack/androidx/releases/lifecycle?hl=id
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
```


## Download this project

### Step 1. Add the JitPack repository to your build file (build.gradle.kts : BuildSrc)

```kotlin
repositories {
    ...
    maven("https://jitpack.io")
}
```

### Step 2. Add the dependency (build.gradle.kts : BuildSrc)

```kotlin
dependencies {
    // library open-build-src
    implementation("com.github.frogobox:open-build-src:1.0.9")
}
```

### Step 3. Usage (Add on your dependencies build.gradle.kts : app)

#### Androidx Library
- Version Planted

```kotlin
implementation(Androidx.appCompat)
implementation(Androidx.appCompatResources)
implementation(Androidx.activityKtx)
implementation(Androidx.fragmentKtx)
implementation(Androidx.constraintLayout)
implementation(Androidx.collection)
implementation(Androidx.savedState)
implementation(Androidx.viewPager)
implementation(Androidx.viewPager2)
implementation(Androidx.recyclerview)
implementation(Androidx.recyclerviewSelection)
implementation(Androidx.preference)
implementation(Androidx.preferenceKtx)
implementation(Androidx.navigationRuntimeKtx)
implementation(Androidx.navigationFragmentKtx)
implementation(Androidx.navigationUiKtx)
```

- Custom Version
```kotlin
implementation(Androidx.appCompat("version"))
implementation(Androidx.appCompatResources("version"))
implementation(Androidx.activityKtx("version"))
implementation(Androidx.fragmentKtx("version"))
implementation(Androidx.constraintLayout("version"))
implementation(Androidx.collection("version"))
implementation(Androidx.savedState("version"))
implementation(Androidx.viewPager("version"))
implementation(Androidx.viewPager2("version"))
implementation(Androidx.recyclerview("version"))
implementation(Androidx.recyclerviewSelection("version"))
implementation(Androidx.preference("version"))
implementation(Androidx.preferenceKtx("version"))
implementation(Androidx.navigationRuntimeKtx("version"))
implementation(Androidx.navigationFragmentKtx("version"))
implementation(Androidx.navigationUiKtx("version"))

```

#### Androidx Core Library
```kotlin
implementation(Androidx.Core.java)
implementation(Androidx.Core.ktx)
implementation(Androidx.Core.role)
implementation(Androidx.Core.animation)
implementation(Androidx.Core.animationAndroidTest)
implementation(Androidx.Core.googleShortCuts)
implementation(Androidx.Core.remoteViews)
implementation(Androidx.Core.splashScreen)
```

#### Androidx Compose Library
```kotlin
implementation(Androidx.Compose.activity)
implementation(Androidx.Compose.ui)
implementation(Androidx.Compose.material)
implementation(Androidx.Compose.uiTooling)
implementation(Androidx.Compose.navigation)
implementation(Androidx.Compose.hiltNavigation)
implementation(Androidx.Compose.uiTestJunit4)
implementation(Androidx.Compose.uiTestManifest)
```

#### Androidx Lifecycle Library
```kotlin
implementation(Androidx.Lifecycle.viewmodel)
implementation(Androidx.Lifecycle.viewmodelKtx)
implementation(Androidx.Lifecycle.livedata)
implementation(Androidx.Lifecycle.livedataKtx)
implementation(Androidx.Lifecycle.runtime)
implementation(Androidx.Lifecycle.runtimeKtx)
implementation(Androidx.Lifecycle.viewmodelSavedstate)
implementation(Androidx.Lifecycle.compiler)
implementation(Androidx.Lifecycle.compilerJava8)
implementation(Androidx.Lifecycle.service)
implementation(Androidx.Lifecycle.process)
implementation(Androidx.Lifecycle.reactivestreams)
implementation(Androidx.Lifecycle.reactivestreamsKtx)
implementation(Androidx.Lifecycle.coreTesting)
```

#### Androidx Room Library
```kotlin
implementation(Androidx.Room.runtime)
implementation(Androidx.Room.ktx)
implementation(Androidx.Room.rxJava2)
implementation(Androidx.Room.rxJava3)
implementation(Androidx.Room.guava)
implementation(Androidx.Room.paging)
implementation(Androidx.Room.roomTest)
implementation(Androidx.Room.compiler)
```

#### Androidx Work Library
```kotlin
implementation(Androidx.Work.runtime)
implementation(Androidx.Work.runtimeKtx)
implementation(Androidx.Work.rxJava2)
implementation(Androidx.Work.gcm)
implementation(Androidx.Work.workAndroidTest)
implementation(Androidx.Work.multiprocess)
```

#### Google Library
```kotlin
implementation(Google.accompanist)
implementation(Google.material)
implementation(Google.gson)
implementation(Google.admob)
implementation(Google.userMessagingPlatform)
implementation(Google.adMediationUnityAd)
```

#### Hilt
```kotlin
implementation(Google.Hilt.android)
implementation(Google.Hilt.compiler)
implementation(Google.Hilt.hiltAndroidTesting)
```

#### JetBrains Library
```kotlin
implementation(JetBrains.coroutinesCore)
implementation(JetBrains.coroutinesAndroid)
```

#### Koin Library
```kotlin
implementation(Koin.core)
implementation(Koin.android)
implementation(Koin.androidCompat)
implementation(Koin.androidxWorkManager)
implementation(Koin.androidxCompose)
implementation(Koin.ktor)

testImplementation(Koin.test)
```

#### Ktor
```kotlin
implementation(Ktor.clientCore)
implementation(Ktor.clientSerialization)
implementation(Ktor.clientAndroid)
implementation(Ktor.clientMock)
```

#### Square Library
```kotlin
implementation(Square.OkHttp.okhttp)
implementation(Square.OkHttp.loggingInterceptor)
implementation(Square.OkHttp.coroutine)

implementation(Square.Retrofit2.retrofit)
implementation(Square.Retrofit2.converterGson)
implementation(Square.Retrofit2.converterJackson)
implementation(Square.Retrofit2.converterMoshi)
implementation(Square.Retrofit2.converterProtobuf)
implementation(Square.Retrofit2.converterWire)
implementation(Square.Retrofit2.converterSimpleXml)
implementation(Square.Retrofit2.converterJAXB)
implementation(Square.Retrofit2.converterScalars)
implementation(Square.Retrofit2.adapterRxJava)
implementation(Square.Retrofit2.adapterRxJava2)
implementation(Square.Retrofit2.adapterRxJava3)
```

#### ReactiveX Library
```kotlin
implementation(Reactivex.rxJava3)
implementation(Reactivex.rxAndroid3)
implementation(Reactivex.rxKotlin3)
```

#### Ad Library
```kotlin
implementation(Ad.unityAds)
```

#### Github Library
```kotlin
implementation(GitHub.glide)
implementation(GitHub.chucker)

kapt(GitHub.glideCompiler)
```

#### Util Library
```kotlin
maven(Util.jitpackUrl)

implementation(Util.coil)
```

### Screenshoot (Step 2. Add the dependency (build.gradle.kts : BuildSrc)
- For full source code you can [click here](https://github.com/frogobox/frogo-kick-start-android/blob/master/buildSrc/build.gradle.kts)
![](docs/image/ss_step_2.png?raw=true)


### Screenshoot (Step 3. Usage (Add on your dependencies build.gradle.kts : app))
- For full source code you can [click here](https://github.com/frogobox/frogo-kick-start-android/blob/master/app/build.gradle.kts)
![](docs/image/ss_step_3.png?raw=true)

## Colaborator
Very open to anyone, I'll write your name under this, please contribute by sending an email to me

- Mail To faisalamircs@gmail.com
- Subject : Github _ [Github-Username-Account] _ [Language] _ [Repository-Name]
- Example : Github_amirisback_kotlin_admob-helper-implementation

Name Of Contribute
- Muhammad Faisal Amir
- Waiting List
- Waiting List

Waiting for your contribute

## Attention !!!
- Please enjoy and don't forget fork and give a star
- Don't Forget Follow My Github Account