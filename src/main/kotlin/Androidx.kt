/*
 * Created by faisalamir on 07/03/22
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

object Androidx {

    const val activityKtx = "androidx.activity:activity-ktx:${Version.AndroidX.activityKtx}"

    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Version.AndroidX.fragmentKtx}"

    const val appCompat = "androidx.appcompat:appcompat:${Version.AndroidX.appCompat}"
    
    const val appCompatResources = "androidx.appcompat:appcompat-resources:${Version.AndroidX.appCompat}"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.AndroidX.constraintLayout}"

    const val collection = "androidx.collection:collection-ktx:${Version.AndroidX.collection}"

    const val savedState = "androidx.savedstate:savedstate-ktx:${Version.AndroidX.savedState}"

    const val viewPager = "androidx.viewpager:viewpager:${Version.AndroidX.viewPager}"

    const val viewPager2 = "androidx.viewpager2:viewpager2:${Version.AndroidX.viewPager2}"

    const val recyclerview = "androidx.recyclerview:recyclerview:${Version.AndroidX.recyclerView}"

    // For control over item selection of both touch and mouse driven selection
    const val recyclerviewSelection = "androidx.recyclerview:recyclerview-selection:${Version.AndroidX.recyclerViewSelection}"

    // Java language implementation
    const val preference = "androidx.preference:preference:${Version.AndroidX.preference}"

    // Kotlin
    const val preferenceKtx = "androidx.preference:preference-ktx:${Version.AndroidX.preference}"

    const val navigationRuntimeKtx = "androidx.navigation:navigation-runtime-ktx:${Version.AndroidX.navigationKtx}"

    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Version.AndroidX.navigationKtx}"

    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Version.AndroidX.navigationKtx}"

    // -----------------------------------------------------------------------------------------------------------------

    // androidTestImplementation
    const val runner = "androidx.test:runner:${Version.AndroidX.runner}"
    
    const val junitAndroidTest = "androidx.test.ext:junit:${Version.AndroidX.junit}"
    
    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.AndroidX.espressoCore}"

    const val junit4 = "junit:junit:${Version.AndroidX.junit4}"

    // -----------------------------------------------------------------------------------------------------------------
    
    object Core {

        // Java language implementation
        const val java = "androidx.core:core:${Version.AndroidX.core}"

        // Kotlin
        const val ktx = "androidx.core:core-ktx:${Version.AndroidX.core}"

        // To use RoleManagerCompat
        const val role = "androidx.core:core-role:1.0.0"

        // To use the Animator APIs
        const val animation = "androidx.core:core-animation:1.0.0-alpha02"

        // To test the Animator APIs
        const val animationAndroidTest = "androidx.core:core-animation-testing:1.0.0-alpha02"

        // Optional - to use ShortcutManagerCompat to donate shortcuts to be used by Google
        const val googleShortCuts = "androidx.core:core-google-shortcuts:1.0.0"

        // Optional - to support backwards compatibility of RemoteViews
        const val remoteViews = "androidx.core:core-remoteviews:1.0.0-alpha03"

        // Optional - APIs for SplashScreen, including compatiblity helpers on devices prior Android 12
        const val splashScreen = "androidx.core:core-splashscreen:1.0.0-beta01"

    }

    object Lifecycle {

        // ViewModel
        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel:${Version.AndroidX.liveCycle}"
        const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.AndroidX.liveCycle}"

        // LiveData
        const val livedata = "androidx.lifecycle:lifecycle-livedata:${Version.AndroidX.liveCycle}"
        const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.AndroidX.liveCycle}"

        // Lifecycles only (without ViewModel or LiveData)
        const val runtime = "androidx.lifecycle:lifecycle-runtime:${Version.AndroidX.liveCycle}"
        const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.AndroidX.liveCycle}"

        // Saved state module for ViewModel
        const val viewmodelSavedstate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Version.AndroidX.liveCycle}"

        // Annotation processor
        const val compiler = "androidx.lifecycle:lifecycle-compiler:${Version.AndroidX.liveCycle}"

        // alternately - if using Java8, use the following instead of lifecycle-compiler
        const val compilerJava8 = "androidx.lifecycle:lifecycle-common-java8:${Version.AndroidX.liveCycle}"

        // optional - helpers for implementing LifecycleOwner in a Service
        const val service = "androidx.lifecycle:lifecycle-service:${Version.AndroidX.liveCycle}"

        // optional - ProcessLifecycleOwner provides a lifecycle for the whole application process
        const val process = "androidx.lifecycle:lifecycle-process:${Version.AndroidX.liveCycle}"

        // optional - ReactiveStreams support for LiveData
        const val reactivestreams = "androidx.lifecycle:lifecycle-reactivestreams:${Version.AndroidX.liveCycle}"
        const val reactivestreamsKtx = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Version.AndroidX.liveCycle}"

        // optional - Test helpers for LiveData
        const val coreTesting = "androidx.arch.core:core-testing:${Version.AndroidX.liveCycleArch}"

    }

    object Room {

        const val runtime = "androidx.room:room-runtime:${Version.AndroidX.room}"

        // optional - Kotlin Extensions and Coroutines support for Room
        const val ktx = "androidx.room:room-ktx:${Version.AndroidX.room}"

        // optional - RxJava2 support for Room
        const val rxJava2 = "androidx.room:room-rxjava2:${Version.AndroidX.room}"

        // optional - RxJava2 support for Room
        const val rxJava3 = "androidx.room:room-rxjava3:${Version.AndroidX.room}"

        // optional - Guava support for Room, including Optional and ListenableFuture
        const val guava = "androidx.room:room-guava:${Version.AndroidX.room}"

        // optional - Paging 3 Integration
        const val paging = "androidx.room:room-paging:2.5.0-alpha01"

        // optional - Test helpers
        const val roomTest = "androidx.room:room-testing:${Version.AndroidX.room}"

        // Annotation processor
        const val compiler = "androidx.room:room-compiler:${Version.AndroidX.room}"

    }

    object Work {

        // (Java only)
        const val runtime = "androidx.work:work-runtime:${Version.AndroidX.work}"

        // Kotlin + coroutines
        const val runtimeKtx = "androidx.work:work-runtime-ktx:${Version.AndroidX.work}"

        // optional - RxJava2 support
        const val rxJava2 = "androidx.work:work-rxjava2:${Version.AndroidX.work}"

        // optional - GCMNetworkManager support
        const val gcm = "androidx.work:work-gcm:${Version.AndroidX.work}"

        // optional - Test helpers androidTestImplementation
        const val workAndroidTest = "androidx.work:work-testing:${Version.AndroidX.work}"

        // optional - Multiprocess support
        const val multiprocess = "androidx.work:work-multiprocess:${Version.AndroidX.work}"

    }

}