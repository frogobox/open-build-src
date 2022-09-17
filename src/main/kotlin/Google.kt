import Version.Google.hilt

/**
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
    fun accompanist(version: String): String = "com.google.accompanist:accompanist-navigation-animation:$version}"

    const val material = "com.google.android.material:material:${Version.Google.material}"
    fun material(version: String): String = "com.google.android.material:material:$version"

    const val gson = "com.google.code.gson:gson:${Version.Google.gson}"
    fun gson(version: String): String = "com.google.code.gson:gson:$version"

    const val admob = "com.google.android.gms:play-services-ads-lite:${Version.Google.admob}"
    fun admob(version: String): String = "com.google.android.gms:play-services-ads-lite:$version"

    const val userMessagingPlatform = "com.google.android.ump:user-messaging-platform:${Version.Google.userMessagingPlatform}"
    fun userMessagingPlatform(version: String): String = "com.google.android.ump:user-messaging-platform:$version"

    const val adMediationUnityAd = "com.google.ads.mediation:unity:${Version.Google.adMediationUnityAd}"
    fun adMediationUnityAd(version: String): String = "com.google.ads.mediation:unity:$version"

    object Hilt {

        const val android = "com.google.dagger:hilt-android:$hilt"
        fun android(version: String): String = "com.google.dagger:hilt-android:$version"

        // Annotation processor
        const val compiler = "com.google.dagger:hilt-compiler:$hilt"
        fun compiler(version: String): String = "com.google.dagger:hilt-compiler:$version"

        // androidTestImpementation
        const val hiltAndroidTesting = "com.google.dagger:hilt-android-testing:$hilt"
        fun hiltAndroidTesting(version: String): String = "com.google.dagger:hilt-android-testing:$version"

    }

}