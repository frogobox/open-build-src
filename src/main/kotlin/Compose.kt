import Version.Compose.activityComposeVersion
import Version.Compose.composeVersion
import Version.Compose.hiltNavigationComposeVersion
import Version.Compose.navigationVersion

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

    const val activity = "androidx.activity:activity-compose:$activityComposeVersion"

    const val ui = "androidx.compose.ui:ui:$composeVersion"
    const val material = "androidx.compose.material:material:$composeVersion"
    const val tooling = "androidx.compose.ui:ui-tooling:$composeVersion"

    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"

    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:$composeVersion"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$composeVersion"

}