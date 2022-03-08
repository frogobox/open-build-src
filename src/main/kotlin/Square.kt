import Version.Util.okHttp
import Version.Util.okHttpLogging
import Version.Util.retrofitVersion

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

        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val converterGson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
        const val converterJackson = "com.squareup.retrofit2:converter-jackson:$retrofitVersion"
        const val converterMoshi = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"
        const val converterProtobuf = "com.squareup.retrofit2:converter-protobuf:$retrofitVersion"
        const val converterWire = "com.squareup.retrofit2:converter-wire:$retrofitVersion"
        const val converterSimpleXml = "com.squareup.retrofit2:converter-simplexml:$retrofitVersion"
        const val converterJAXB = "com.squareup.retrofit2:converter-jaxb:$retrofitVersion"
        const val Scalars = "com.squareup.retrofit2:converter-scalars:$retrofitVersion"

        const val adapterRxJava = "com.squareup.retrofit2:adapter-rxjava:$retrofitVersion"
        const val adapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"
        const val adapterRxJava3 = "com.squareup.retrofit2:adapter-rxjava3:$retrofitVersion"

    }

}