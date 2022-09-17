/**
 * Created by faisalamir on 29/03/22
 * open-build-src
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 FrogoBox Inc.      
 * All rights reserved
 *
 */

object GitHub {

    const val glide = "com.github.bumptech.glide:glide:${Version.Util.glide}"
    fun glide(version: String): String = "com.github.bumptech.glide:glide:$version"

    const val glideCompiler = "com.github.bumptech.glide:compiler:${Version.Util.glide}"
    fun glideCompiler(version: String): String = "com.github.bumptech.glide:compiler:$version"

    const val chucker = "com.github.chuckerteam.chucker:library:${Version.Util.chucker}"
    fun chucker(version: String): String = "com.github.chuckerteam.chucker:library:$version"

    const val piracyChecker = "com.github.javiersantos:PiracyChecker:${Version.Util.piracyChecker}"
    fun piracyChecker(version: String): String = "com.github.javiersantos:PiracyChecker:$version"

    const val customActivityOnCrash = "cat.ereza:customactivityoncrash:${Version.Util.customActivityOnCrash}"
    fun customActivityOnCrash(version: String): String = "cat.ereza:customactivityoncrash:$version"

}