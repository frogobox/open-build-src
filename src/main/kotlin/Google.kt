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

    const val autoService = "com.google.auto.service:auto-service:${Version.Google.autoService}"
    fun autoService(version: String): String = "com.google.auto.service:auto-service:$version"

    const val autoServiceAnnotation = "com.google.auto.service:auto-service-annotations:${Version.Google.autoService}"
    fun autoServiceAnnotation(version: String) = "com.google.auto.service:auto-service-annotations:$version"

    const val assetDelivery = "com.google.android.play:asset-delivery:${Version.Google.assetDelivery}"
    fun assetDelivery(version: String) = "com.google.android.play:asset-delivery:$version"

    const val assetDeliveryKtx = "com.google.android.play:asset-delivery-ktx:${Version.Google.assetDelivery}"
    fun assetDeliveryKtx(version: String) = "com.google.android.play:asset-delivery-ktx:$version"

    const val featureDelivery = "com.google.android.play:feature-delivery:${Version.Google.featureDelivery}"
    fun featureDelivery(version: String) = "com.google.android.play:feature-delivery:$version"

    const val featureDeliveryKtx = "com.google.android.play:feature-delivery-ktx:${Version.Google.featureDelivery}"
    fun featureDeliveryKtx(version: String) = "com.google.android.play:feature-delivery-ktx:$version"

    const val playReview = "com.google.android.play:review:${Version.Google.review}"
    fun playReview(version: String) = "com.google.android.play:review:$version"

    const val playReviewKtx = "com.google.android.play:review-ktx:${Version.Google.review}"
    fun playReviewKtx(version: String) = "com.google.android.play:review-ktx:$version"

    const val appUpdate = "com.google.android.play:app-update:${Version.Google.appUpdate}"
    fun appUpdate(version: String) = "com.google.android.play:app-update:$version"

    const val appUpdateKtx = "com.google.android.play:app-update-ktx:${Version.Google.appUpdate}"
    fun appUpdateKtx(version: String) = "com.google.android.play:app-update-ktx:$version"

    const val flexbox = "com.google.android.flexbox:flexbox:${Version.Google.flexbox}"
    fun flexbox(version: String) = "com.google.android.flexbox:flexbox:$version"

    object Hilt {

        const val android = "com.google.dagger:hilt-android:${Version.Google.hilt}"
        fun android(version: String): String = "com.google.dagger:hilt-android:$version"

        // Annotation processor
        const val compiler = "com.google.dagger:hilt-compiler:${Version.Google.hilt}"
        fun compiler(version: String): String = "com.google.dagger:hilt-compiler:$version"

        // androidTestImpementation
        const val hiltAndroidTesting = "com.google.dagger:hilt-android-testing:${Version.Google.hilt}"
        fun hiltAndroidTesting(version: String): String = "com.google.dagger:hilt-android-testing:$version"

    }

}