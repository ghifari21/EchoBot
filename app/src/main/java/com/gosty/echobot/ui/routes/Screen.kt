package com.gosty.echobot.ui.routes

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.gosty.echobot.R

sealed class Screen(
    val route: String,
    @StringRes val resourceId: Int? = null,
    val activeIcon: ImageVector? = null,
    val inactiveIcon: ImageVector? = null
) {
    data object Home : Screen(
        route = "home",
        resourceId = R.string.home,
        activeIcon = Icons.Filled.Home,
        inactiveIcon = Icons.Outlined.Home
    )
}