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

    object FastAdapter {

        const val core = "com.mikepenz:fastadapter:${Version.Util.fastAdapter}"
        fun core(version: String): String = "com.mikepenz:fastadapter:$version"

        const val expandable = "com.mikepenz:fastadapter-extensions-expandable:${Version.Util.fastAdapter}"
        fun expandable(version: String): String = "com.mikepenz:fastadapter-extensions-expandable:$version"

        const val binding = "com.mikepenz:fastadapter-extensions-binding:${Version.Util.fastAdapter}" // view binding helpers
        fun binding(version: String): String = "com.mikepenz:fastadapter-extensions-binding:$version"

        const val diff = "com.mikepenz:fastadapter-extensions-diff:${Version.Util.fastAdapter}" // diff util helpers
        fun diff(version: String): String = "com.mikepenz:fastadapter-extensions-diff:$version"

        const val drag = "com.mikepenz:fastadapter-extensions-drag:${Version.Util.fastAdapter}" // drag support
        fun drag(version: String): String = "com.mikepenz:fastadapter-extensions-drag:$version"

        const val paged = "com.mikepenz:fastadapter-extensions-paged:${Version.Util.fastAdapter}" // paging support
        fun paged(version: String): String = "com.mikepenz:fastadapter-extensions-paged:$version"

        const val scroll = "com.mikepenz:fastadapter-extensions-scroll:${Version.Util.fastAdapter}" // scroll helpers
        fun scroll(version: String): String = "com.mikepenz:fastadapter-extensions-scroll:$version"

        const val swipe = "com.mikepenz:fastadapter-extensions-swipe:${Version.Util.fastAdapter}" // swipe support
        fun swipe(version: String): String = "com.mikepenz:fastadapter-extensions-swipe:$version"

        const val ui = "com.mikepenz:fastadapter-extensions-ui:${Version.Util.fastAdapter}" // pre-defined ui components
        fun ui(version: String): String = "com.mikepenz:fastadapter-extensions-ui:$version"

        const val utils = "com.mikepenz:fastadapter-extensions-utils:${Version.Util.fastAdapter}" // needs the `expandable`, `drag` and `scroll` extension.
        fun utils(version: String): String = "com.mikepenz:fastadapter-extensions-utils:$version"

    }

    object Acra {

        const val core = "ch.acra:acra-core:${Version.Util.acra}"
        fun core(version: String): String = "ch.acra:acra-core:$version"

        const val mail = "ch.acra:acra-mail:${Version.Util.acra}"
        fun mail(version: String): String = "ch.acra:acra-mail:$version"

        const val http = "ch.acra:acra-http:${Version.Util.acra}"
        fun http(version: String): String = "ch.acra:acra-http:$version"

        const val dialog = "ch.acra:acra-dialog:${Version.Util.acra}"
        fun dialog(version: String): String = "ch.acra:acra-dialog:$version"

        const val notification = "ch.acra:acra-notification:${Version.Util.acra}"
        fun notification(version: String): String = "ch.acra:acra-notification:$version"

        const val toast = "ch.acra:acra-toast:${Version.Util.acra}"
        fun toast(version: String): String = "ch.acra:acra-toast:$version"

        const val limiter = "ch.acra:acra-limiter:${Version.Util.acra}"
        fun limiter(version: String): String = "ch.acra:acra-limiter:$version"

        const val scheduler = "ch.acra:acra-advanced-scheduler:${Version.Util.acra}"
        fun scheduler(version: String): String = "ch.acra:acra-advanced-scheduler:$version"


    }

}