import Version.JetBrains.coroutines

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

object JetBrains {

    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines"
    fun coroutinesCore(version: String): String = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"

    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines"
    fun coroutinesAndroid(version: String): String = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"

}