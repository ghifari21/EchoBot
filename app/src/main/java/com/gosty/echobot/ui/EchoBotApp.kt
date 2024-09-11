package com.gosty.echobot.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.gosty.echobot.ui.components.BottomNavBar
import com.gosty.echobot.ui.routes.EchoBotNavHost

@Composable
fun EchoBotApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomNavBar(navController = navController)
        }
    ) { paddingValues ->
        EchoBotNavHost(
            navController = navController,
            modifier = modifier.padding(paddingValues)
        )
    }
}