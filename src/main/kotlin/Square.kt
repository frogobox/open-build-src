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

object Square {

    object OkHttp {

        const val okhttp = "com.squareup.okhttp3:okhttp:${Version.Util.okHttp}"
        fun okhttp(version: String): String = "com.squareup.okhttp3:okhttp:$version"

        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.Util.okHttp}"
        fun okhttpLogging(version: String): String = "com.squareup.okhttp3:logging-interceptor:$version"

        const val coroutine = "com.squareup.okhttp3:okhttp-coroutines:${Version.Util.okHttp}"
        fun okhttpCoroutine(version: String): String = "com.squareup.okhttp3:okhttp-coroutines:$version"

    }

    object Retrofit2 {

        const val retrofit = "com.squareup.retrofit2:retrofit:${Version.Util.retrofit}"
        fun retrofit(version: String): String = "com.squareup.retrofit2:retrofit:$version"

        const val converterGson = "com.squareup.retrofit2:converter-gson:${Version.Util.retrofit}"
        fun converterGson(version: String): String = "com.squareup.retrofit2:converter-gson:$version"

        const val converterJackson = "com.squareup.retrofit2:converter-jackson:${Version.Util.retrofit}"
        fun converterJackson(version: String): String = "com.squareup.retrofit2:converter-jackson:$version"

        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:${Version.Util.retrofit}"
        fun converterMoshi(version: String): String = "com.squareup.retrofit2:converter-moshi:$version"

        const val converterProtobuf = "com.squareup.retrofit2:converter-protobuf:${Version.Util.retrofit}"
        fun converterProtobuf(version: String): String = "com.squareup.retrofit2:converter-protobuf:$version"

        const val converterWire = "com.squareup.retrofit2:converter-wire:${Version.Util.retrofit}"
        fun converterWire(version: String): String = "com.squareup.retrofit2:converter-wire:$version"

        const val converterSimpleXml = "com.squareup.retrofit2:converter-simplexml:${Version.Util.retrofit}"
        fun converterSimpleXml(version: String): String = "com.squareup.retrofit2:converter-simplexml:$version"

        const val converterJAXB = "com.squareup.retrofit2:converter-jaxb:${Version.Util.retrofit}"
        fun converterJAXB(version: String): String = "com.squareup.retrofit2:converter-jaxb:$version"

        const val converterScalars = "com.squareup.retrofit2:converter-scalars:${Version.Util.retrofit}"
        fun converterScalars(version: String): String = "com.squareup.retrofit2:converter-scalars:$version"

        const val adapterRxJava = "com.squareup.retrofit2:adapter-rxjava:${Version.Util.retrofit}"
        fun adapterRxJava(version: String): String = "com.squareup.retrofit2:adapter-rxjava:$version"

        const val adapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:${Version.Util.retrofit}"
        fun adapterRxJava2(version: String): String = "com.squareup.retrofit2:adapter-rxjava2:$version"

        const val adapterRxJava3 = "com.squareup.retrofit2:adapter-rxjava3:${Version.Util.retrofit}"
        fun adapterRxJava3(version: String): String = "com.squareup.retrofit2:adapter-rxjava3:$version"

    }

}