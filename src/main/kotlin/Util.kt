import Version.Util.coilVersion
import Version.Util.glideVersion
import Version.Util.chuckerVersion

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

object Util {

    const val jitpackUrl = "https://jitpack.io"

    const val glide = "com.github.bumptech.glide:glide:$glideVersion"
    fun glide(version: String): String = "com.github.bumptech.glide:glide:$version"

    const val glideCompiler = "com.github.bumptech.glide:compiler:$glideVersion"
    fun glideCompiler(version: String): String = "com.github.bumptech.glide:compiler:$version"
    
    const cal chucker = "com.github.chuckerteam.chucker:library:$chuckerVersion"
    fun chucker(version: String): String = "com.github.chuckerteam.chucker:library:$version"

    const val coil = "io.coil-kt:coil:$coilVersion"
    fun coil(version: String): String = "io.coil-kt:coil:$version"

    const val coilCompose = "io.coil-kt:coil-compose:$coilVersion"
    fun coilCompose(version: String): String = "io.coil-kt:coil-compose:$version"

    // -----------------------------------------------------------------------------------------------------------------

    // Not separated version
    const val hdodenhofCircleImageView = "de.hdodenhof:circleimageview:3.1.0"
    fun hdodenhofCircleImageView(version: String): String = "de.hdodenhof:circleimageview:$version"

}
