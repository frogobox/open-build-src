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

object Reactivex {

    const val rxKotlin3 = "io.reactivex.rxjava3:rxkotlin:${Version.Util.rxKotlin3}"
    fun rxKotlin3(version: String): String = "io.reactivex.rxjava3:rxkotlin:$version"

    const val rxJava3 = "io.reactivex.rxjava3:rxjava:${Version.Util.rxJava3}"
    fun rxJava3(version: String): String = "io.reactivex.rxjava3:rxjava:$version"

    const val rxAndroid3 = "io.reactivex.rxjava3:rxandroid:${Version.Util.rxAndroid3}"
    fun rxAndroid3(version: String): String = "io.reactivex.rxjava3:rxandroid:$version"

}