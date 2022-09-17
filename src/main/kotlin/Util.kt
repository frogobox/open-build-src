/**
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

    // -----------------------------------------------------------------------------------------------------------------

    // Url Maven Repo

    const val jitpackUrl = "https://jitpack.io"
    const val startIoUrl = "https://startappdev.bintray.com/maven"

    // -----------------------------------------------------------------------------------------------------------------

    const val coil = "io.coil-kt:coil:${Version.Util.coil}"
    fun coil(version: String): String = "io.coil-kt:coil:$version"

    const val coilCompose = "io.coil-kt:coil-compose:${Version.Util.coil}"
    fun coilCompose(version: String): String = "io.coil-kt:coil-compose:$version"

    // -----------------------------------------------------------------------------------------------------------------

    // Not separated version
    const val hdodenhofCircleImageView = "de.hdodenhof:circleimageview:3.1.0"
    fun hdodenhofCircleImageView(version: String): String = "de.hdodenhof:circleimageview:$version"

}