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

    const val activityKtx = "androidx.activity:activity-ktx:${Version.Androidx.activityKtx}"
    fun activityKtx(version: String): String = "androidx.activity:activity-ktx:$version"

    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Version.Androidx.fragmentKtx}"
    fun fragmentKtx(version: String): String = "androidx.fragment:fragment-ktx:$version"

    const val appCompat = "androidx.appcompat:appcompat:${Version.Androidx.appCompat}"
    fun appCompat(version: String): String = "androidx.appcompat:appcompat:$version"

    const val appCompatResources = "androidx.appcompat:appcompat-resources:${Version.Androidx.appCompat}"
    fun appCompatResources(version: String): String = "androidx.appcompat:appcompat-resources:$version"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.Androidx.constraintLayout}"
    fun constraintLayout(version: String): String = "androidx.constraintlayout:constraintlayout:$version"

    const val collection = "androidx.collection:collection-ktx:${Version.Androidx.collection}"
    fun collection(version: String): String = "androidx.collection:collection-ktx:$version"

    const val savedState = "androidx.savedstate:savedstate-ktx:${Version.Androidx.savedState}"
    fun savedState(version: String): String = "androidx.savedstate:savedstate-ktx:$version"

    const val viewPager = "androidx.viewpager:viewpager:${Version.Androidx.viewPager}"
    fun viewPager(version: String): String = "androidx.viewpager:viewpager:$version"

    const val viewPager2 = "androidx.viewpager2:viewpager2:${Version.Androidx.viewPager2}"
    fun viewPager2(version: String): String = "androidx.viewpager2:viewpager2:$version"

    const val recyclerview = "androidx.recyclerview:recyclerview:${Version.Androidx.recyclerView}"
    fun recyclerview(version: String): String = "androidx.recyclerview:recyclerview:$version"

    // For control over item selection of both touch and mouse driven selection
    const val recyclerviewSelection = "androidx.recyclerview:recyclerview-selection:${Version.Androidx.recyclerViewSelection}"
    fun recyclerviewSelection(version: String): String = "androidx.recyclerview:recyclerview-selection:$version"

    // Java language implementation
    const val preference = "androidx.preference:preference:${Version.Androidx.preference}"
    fun preference(version: String): String = "androidx.preference:preference:$version"

    // Kotlin
    const val preferenceKtx = "androidx.preference:preference-ktx:${Version.Androidx.preference}"
    fun preferenceKtx(version: String): String = "androidx.preference:preference-ktx:$version"

    const val navigationRuntimeKtx = "androidx.navigation:navigation-runtime-ktx:${Version.Androidx.navigationKtx}"
    fun navigationRuntimeKtx(version: String): String = "androidx.navigation:navigation-runtime-ktx:$version"

    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Version.Androidx.navigationKtx}"
    fun navigationFragmentKtx(version: String): String = "androidx.navigation:navigation-fragment-ktx:$version"

    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Version.Androidx.navigationKtx}"
    fun navigationUiKtx(version: String): String = "androidx.navigation:navigation-ui-ktx:$version"

    // -----------------------------------------------------------------------------------------------------------------

    // androidTestImplementation
    const val runner = "androidx.test:runner:${Version.Androidx.runner}"
    fun runner(version: String): String = "androidx.test:runner:$version"

    const val junitAndroidTest = "androidx.test.ext:junit:${Version.Androidx.junit}"
    fun junitAndroidTest(version: String): String = "androidx.test.ext:junit:$version"

    const val espressoCore = "androidx.test.espresso:espresso-core:${Version.Androidx.espressoCore}"
    fun espressoCore(version: String): String = "androidx.test.espresso:espresso-core:$version"

    const val junit4 = "junit:junit:${Version.Androidx.junit4}"
    fun junit4(version: String): String = "junit:junit:$version"

    // -----------------------------------------------------------------------------------------------------------------

    object Core {

        // Java language implementation
        const val java = "androidx.core:core:${Version.Androidx.core}"
        fun java(version: String): String = "androidx.core:core:$version"

        // Kotlin
        const val ktx = "androidx.core:core-ktx:${Version.Androidx.core}"
        fun ktx(version: String): String = "androidx.core:core-ktx:$version"

        // To use RoleManagerCompat
        const val role = "androidx.core:core-role:1.0.0"
        fun role(version: String): String = "androidx.core:core-role:$version"

        // To use the Animator APIs
        const val animation = "androidx.core:core-animation:1.0.0-alpha02"
        fun animation(version: String): String = "androidx.core:core-animation:$version"

        // To test the Animator APIs
        const val animationAndroidTest = "androidx.core:core-animation-testing:1.0.0-alpha02"
        fun animationAndroidTest(version: String): String = "androidx.core:core-animation-testing:$version"

        // Optional - to use ShortcutManagerCompat to donate shortcuts to be used by Google
        const val googleShortCuts = "androidx.core:core-google-shortcuts:1.0.0"
        fun googleShortCuts(version: String): String = "androidx.core:core-google-shortcuts:$version"

        // Optional - to support backwards compatibility of RemoteViews
        const val remoteViews = "androidx.core:core-remoteviews:1.0.0-alpha03"
        fun remoteViews(version: String): String = "androidx.core:core-remoteviews:$version"

        // Optional - APIs for SplashScreen, including compatiblity helpers on devices prior Android 12
        const val splashScreen = "androidx.core:core-splashscreen:1.0.0-beta01"
        fun splashScreen(version: String): String = "androidx.core:core-splashscreen:$version"

    }

    object Compose {
        
        const val activity = "androidx.activity:activity-compose:${Version.Androidx.composeActivity}"
        fun activity(version: String): String = "androidx.activity:activity-compose:$version"

        const val material = "androidx.compose.material:material:${Version.Androidx.compose}"
        fun material(version: String): String = "androidx.compose.material:material:$version"

        const val ui = "androidx.compose.ui:ui:${Version.Androidx.compose}"
        fun ui(version: String): String = "androidx.compose.ui:ui:$version"

        const val uiTooling = "androidx.compose.ui:ui-tooling:${Version.Androidx.compose}"
        fun uiTooling(version: String): String = "androidx.compose.ui:ui-tooling:$version"

        const val navigation = "androidx.navigation:navigation-compose:${Version.Androidx.composeNavigation}"
        fun navigation(version: String): String = "androidx.navigation:navigation-compose:$version"

        const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:${Version.Androidx.composeHiltNavigation}"
        fun hiltNavigation(version: String): String = "androidx.hilt:hilt-navigation-compose:$version"

        const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Version.Androidx.compose}"
        fun uiTestJunit4(version: String): String = "androidx.compose.ui:ui-test-junit4:$version"

        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:${Version.Androidx.compose}"
        fun uiTestManifest(version: String): String = "androidx.compose.ui:ui-test-manifest:$version"
        
    }

    object Lifecycle {

        // ViewModel
        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel:${Version.Androidx.liveCycle}"
        fun viewmodel(version: String): String = "androidx.lifecycle:lifecycle-viewmodel:$version"
        const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.Androidx.liveCycle}"
        fun viewmodelKtx(version: String): String = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"

        // LiveData
        const val livedata = "androidx.lifecycle:lifecycle-livedata:${Version.Androidx.liveCycle}"
        fun livedata(version: String): String = "androidx.lifecycle:lifecycle-livedata:$version"
        const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.Androidx.liveCycle}"
        fun livedataKtx(version: String): String = "androidx.lifecycle:lifecycle-livedata-ktx:$version"

        // Lifecycles only (without ViewModel or LiveData)
        const val runtime = "androidx.lifecycle:lifecycle-runtime:${Version.Androidx.liveCycle}"
        fun runtime(version: String): String = "androidx.lifecycle:lifecycle-runtime:$version"
        const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.Androidx.liveCycle}"
        fun runtimeKtx(version: String): String = "androidx.lifecycle:lifecycle-runtime-ktx:$version"

        // Saved state module for ViewModel
        const val viewmodelSavedstate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Version.Androidx.liveCycle}"
        fun viewmodelSavedstate(version: String): String = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$version"

        // Annotation processor
        const val compiler = "androidx.lifecycle:lifecycle-compiler:${Version.Androidx.liveCycle}"
        fun compiler(version: String): String = "androidx.lifecycle:lifecycle-compiler:$version"

        // alternately - if using Java8, use the following instead of lifecycle-compiler
        const val compilerJava8 = "androidx.lifecycle:lifecycle-common-java8:${Version.Androidx.liveCycle}"
        fun compilerJava8(version: String): String = "androidx.lifecycle:lifecycle-common-java8:$version"

        // optional - helpers for implementing LifecycleOwner in a Service
        const val service = "androidx.lifecycle:lifecycle-service:${Version.Androidx.liveCycle}"
        fun service(version: String): String = "androidx.lifecycle:lifecycle-service:$version"

        // optional - ProcessLifecycleOwner provides a lifecycle for the whole application process
        const val process = "androidx.lifecycle:lifecycle-process:${Version.Androidx.liveCycle}"
        fun process(version: String): String = "androidx.lifecycle:lifecycle-process:$version"

        // optional - ReactiveStreams support for LiveData
        const val reactivestreams = "androidx.lifecycle:lifecycle-reactivestreams:${Version.Androidx.liveCycle}"
        fun reactivestreams(version: String): String = "androidx.lifecycle:lifecycle-reactivestreams:$version"
        const val reactivestreamsKtx = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Version.Androidx.liveCycle}"
        fun reactivestreamsKtx(version: String): String = "androidx.lifecycle:lifecycle-reactivestreams-ktx:$version"

        // optional - Test helpers for LiveData
        const val coreTesting = "androidx.arch.core:core-testing:${Version.Androidx.liveCycleArch}"
        fun coreTesting(version: String): String = "androidx.arch.core:core-testing:$version"

    }

    object Room {

        const val runtime = "androidx.room:room-runtime:${Version.Androidx.room}"
        fun runtime(version: String): String = "androidx.room:room-runtime:$version"

        // optional - Kotlin Extensions and Coroutines support for Room
        const val ktx = "androidx.room:room-ktx:${Version.Androidx.room}"
        fun ktx(version: String): String = "androidx.room:room-ktx:$version"

        // optional - RxJava2 support for Room
        const val rxJava2 = "androidx.room:room-rxjava2:${Version.Androidx.room}"
        fun rxJava2(version: String): String = "androidx.room:room-rxjava2:$version"

        // optional - RxJava2 support for Room
        const val rxJava3 = "androidx.room:room-rxjava3:${Version.Androidx.room}"
        fun rxJava3(version: String): String = "androidx.room:room-rxjava3:$version"

        // optional - Guava support for Room, including Optional and ListenableFuture
        const val guava = "androidx.room:room-guava:${Version.Androidx.room}"
        fun guava(version: String): String = "androidx.room:room-guava:$version"

        // optional - Paging 3 Integration
        const val paging = "androidx.room:room-paging:2.5.0-alpha01"
        fun paging(version: String): String = "androidx.room:room-paging:$version"

        // optional - Test helpers
        const val roomTest = "androidx.room:room-testing:${Version.Androidx.room}"
        fun roomTest(version: String): String = "androidx.room:room-testing:$version"

        // Annotation processor
        const val compiler = "androidx.room:room-compiler:${Version.Androidx.room}"
        fun compiler(version: String): String = "androidx.room:room-compiler:$version"

    }

    object Work {

        // (Java only)
        const val runtime = "androidx.work:work-runtime:${Version.Androidx.work}"
        fun runtime(version: String): String = "androidx.work:work-runtime:$version"

        // Kotlin + coroutines
        const val runtimeKtx = "androidx.work:work-runtime-ktx:${Version.Androidx.work}"
        fun runtimeKtx(version: String): String = "androidx.work:work-runtime-ktx:$version"

        // optional - RxJava2 support
        const val rxJava2 = "androidx.work:work-rxjava2:${Version.Androidx.work}"
        fun rxJava2(version: String): String = "androidx.work:work-rxjava2:$version"

        // optional - GCMNetworkManager support
        const val gcm = "androidx.work:work-gcm:${Version.Androidx.work}"
        fun gcm(version: String): String = "androidx.work:work-gcm:$version"

        // optional - Test helpers androidTestImplementation
        const val workAndroidTest = "androidx.work:work-testing:${Version.Androidx.work}"
        fun workAndroidTest(version: String): String = "androidx.work:work-testing:$version"

        // optional - Multiprocess support
        const val multiprocess = "androidx.work:work-multiprocess:${Version.Androidx.work}"
        fun multiprocess(version: String): String = "androidx.work:work-multiprocess:$version"

    }

}
