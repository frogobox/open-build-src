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

    const val appCompatVersion = "1.4.1"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    const val appCompatResources = "androidx.appcompat:appcompat-resources:$appCompatVersion"

    const val constraintlayoutVersion = "2.1.3"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintlayoutVersion"

    const val collectionVersion = "1.2.0"
    const val collection = "androidx.collection:collection-ktx:$collectionVersion"

    const val savedStateVersion = "1.1.0"
    const val savedState = "androidx.savedstate:savedstate-ktx:$savedStateVersion"

    const val viewPager2Version = "1.0.0"
    const val viewPager2 = "androidx.viewpager2:viewpager2:$viewPager2Version"

    const val preferenceVersion = "1.2.0"
    const val preference = "androidx.preference:preference:$preferenceVersion" // Java language implementation
    const val preferenceKtx = "androidx.preference:preference-ktx:$preferenceVersion" // Kotlin

    // -----------------------------------------------------------------------------------------------------------------

    // androidTestImplementation

    const val runnerVersion = "1.3.0"
    const val runner = "androidx.test:runner:$runnerVersion"

    const val junitVersion = "1.1.3"
    const val junit = "androidx.test.ext:junit:$junitVersion"

    const val espressoCoreVersion = "3.4.0"
    const val espressoCore = "androidx.test.espresso:espresso-core:$espressoCoreVersion"

    object Core {
        const val version = "1.7.0"

        // Java language implementation
        const val java = "androidx.core:core:$version"
        // Kotlin
        const val ktx = "androidx.core:core-ktx:$version"

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

    object LifeCycle {
        const val version = "2.5.0-alpha03"
        const val archVersion = "2.1.0"

        // ViewModel
        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel:$version"

        // LiveData
        const val livedata = "androidx.lifecycle:lifecycle-livedata:$version"

        // Lifecycles only (without ViewModel or LiveData)
        const val runtime = "androidx.lifecycle:lifecycle-runtime:$version"

        // Saved state module for ViewModel
        const val viewmodelSavedstate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$version"

        // Annotation processor
        const val compiler = "androidx.lifecycle:lifecycle-compiler:$version"

        // alternately - if using Java8, use the following instead of lifecycle-compiler
        const val compilerJava8 = "androidx.lifecycle:lifecycle-common-java8:$version"

        // optional - helpers for implementing LifecycleOwner in a Service
        const val service = "androidx.lifecycle:lifecycle-service:$version"

        // optional - ProcessLifecycleOwner provides a lifecycle for the whole application process
        const val process = "androidx.lifecycle:lifecycle-process:$version"

        // optional - ReactiveStreams support for LiveData
        const val reactivestreams = "androidx.lifecycle:lifecycle-reactivestreams:$version"

        // optional - Test helpers for LiveData
        const val coreTesting = "androidx.arch.core:core-testing:$archVersion"

    }

    object Room {
        const val version = "2.4.1"

        const val runtime = "androidx.room:room-runtime:$version"

        // optional - Kotlin Extensions and Coroutines support for Room
        const val ktx = "androidx.room:room-ktx:$version"

        // optional - RxJava2 support for Room
        const val rxJava2 = "androidx.room:room-rxjava2:$version"

        // optional - RxJava2 support for Room
        const val rxJava3 = "androidx.room:room-rxjava3:$version"

        // optional - Guava support for Room, including Optional and ListenableFuture
        const val guava = "androidx.room:room-guava:$version"

        // optional - Paging 3 Integration
        const val paging = "androidx.room:room-paging:2.5.0-alpha01"

        // optional - Test helpers
        const val roomTest = "androidx.room:room-testing:$version"

        // Annotation processor
        const val compiler = "androidx.room:room-compiler:$version"
    }

    object Work {

        const val version = "2.7.1"

        // (Java only)
        const val runtime = "androidx.work:work-runtime:$version"

        // Kotlin + coroutines
        const val runtimeKtx = "androidx.work:work-runtime-ktx:$version"

        // optional - RxJava2 support
        const val rxJava2 = "androidx.work:work-rxjava2:$version"

        // optional - GCMNetworkManager support
        const val gcm = "androidx.work:work-gcm:$version"

        // optional - Test helpers androidTestImplementation
        const val workAndroidTest = "androidx.work:work-testing:$version"

        // optional - Multiprocess support
        const val multiprocess = "androidx.work:work-multiprocess:$version"

    }

}