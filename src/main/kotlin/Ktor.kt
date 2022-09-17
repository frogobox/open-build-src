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

object Ktor {

    const val clientCore = "io.ktor:ktor-client-core:${Version.Util.ktor}"
    fun clientCore(version: String): String = "io.ktor:ktor-client-core:$version"

    const val clientSerialization = "io.ktor:ktor-client-serialization:${Version.Util.ktor}"
    fun clientSerialization(version: String): String = "io.ktor:ktor-client-serialization:$version"

    const val clientAndroid = "io.ktor:ktor-client-android:${Version.Util.ktor}"
    fun clientAndroid(version: String): String = "io.ktor:ktor-client-android:$version"

    const val clientMock = "io.ktor:ktor-client-mock:${Version.Util.ktor}"
    fun clientMock(version: String): String = "io.ktor:ktor-client-mock:$version"

}