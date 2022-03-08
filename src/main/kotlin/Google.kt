import Version.Google.hilt

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

    const val accompanist = "com.google.accompanist:accompanist-navigation-animation:${Version.Google.accompanist}"

    const val material = "com.google.android.material:material:${Version.Google.material}"

    const val gson = "com.google.code.gson:gson:${Version.Google.gson}"

    const val admob = "com.google.android.gms:play-services-ads-lite:${Version.Google.admob}"

    const val userMessagingPlatform = "com.google.android.ump:user-messaging-platform:${Version.Google.userMessagingPlatform}"

    object Hilt {

        const val android = "com.google.dagger:hilt-android:$hilt"

        // Annotation processor
        const val compiler = "com.google.dagger:hilt-compiler:$hilt"

        // androidTestImpementation
        const val hiltAndroidTesting = "com.google.dagger:hilt-android-testing:$hilt"

    }

}