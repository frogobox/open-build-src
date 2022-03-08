import Version.Compose.activityCompose
import Version.Compose.compose
import Version.Compose.hiltNavigationCompose

/*
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

object Compose {

    const val activity = "androidx.activity:activity-compose:$activityCompose"

    const val ui = "androidx.compose.ui:ui:$compose"
    const val material = "androidx.compose.material:material:$compose"
    const val tooling = "androidx.compose.ui:ui-tooling:$compose"

    const val navigation = "androidx.navigation:navigation-compose:${Version.Compose.navigation}"

    const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:$hiltNavigationCompose"

    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:$compose"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$compose"

}