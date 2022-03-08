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

object Google {

    const val animationsVersion = "0.16.0"
    const val animations = "com.google.accompanist:accompanist-navigation-animation:$animationsVersion"

    const val materialVersion = "1.5.0"
    const val material = "com.google.android.material:material:$materialVersion"

    const val gsonVersion = "2.9.0"
    const val gson = "com.google.code.gson:gson:$gsonVersion"

    const val admobVersion = "20.6.0"
    const val admob = "com.google.android.gms:play-services-ads-lite:$admobVersion"

    const val userMessagingPlatformVersion = "2.0.0"
    const val userMessagingPlatform = "com.google.android.ump:user-messaging-platform:$userMessagingPlatformVersion"

    object Hilt {
        const val version = "2.37"
        const val android = "com.google.dagger:hilt-android:$version"

        // Annotation processor
        const val compiler = "com.google.dagger:hilt-compiler:$version"

        // androidTestImpementation
        const val hiltAndroidTesting = "com.google.dagger:hilt-android-testing:$version"

    }

}