import Version.Util.okHttp
import Version.Util.okHttpLogging

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

    const val okhttp = "com.squareup.okhttp3:okhttp:$okHttp"
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:$okHttpLogging"

    object Retrofit2 {

        const val retrofit = "com.squareup.retrofit2:retrofit:${Version.Util.retrofit}"
        const val converterGson = "com.squareup.retrofit2:converter-gson:${Version.Util.retrofit}"
        const val converterJackson = "com.squareup.retrofit2:converter-jackson:${Version.Util.retrofit}"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:${Version.Util.retrofit}"
        const val converterProtobuf = "com.squareup.retrofit2:converter-protobuf:${Version.Util.retrofit}"
        const val converterWire = "com.squareup.retrofit2:converter-wire:${Version.Util.retrofit}"
        const val converterSimpleXml = "com.squareup.retrofit2:converter-simplexml:${Version.Util.retrofit}"
        const val converterJAXB = "com.squareup.retrofit2:converter-jaxb:${Version.Util.retrofit}"
        const val converterScalars = "com.squareup.retrofit2:converter-scalars:${Version.Util.retrofit}"

        const val adapterRxJava = "com.squareup.retrofit2:adapter-rxjava:${Version.Util.retrofit}"
        const val adapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:${Version.Util.retrofit}"
        const val adapterRxJava3 = "com.squareup.retrofit2:adapter-rxjava3:${Version.Util.retrofit}"

    }

}