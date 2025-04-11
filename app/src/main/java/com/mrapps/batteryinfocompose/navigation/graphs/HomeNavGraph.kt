package com.mrapps.batteryinfocompose.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.mrapps.batteryinfocompose.navigation.screens.HomeScreenObjects
import com.mrapps.batteryinfocompose.screens.HomeScreen1
import com.mrapps.batteryinfocompose.screens.HomeScreen2

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController,
        startDestination = HomeScreenObjects.Home1,
    ) {
        composable<HomeScreenObjects.Home1>() {
            HomeScreen1()
        }

        composable<HomeScreenObjects.Home2>() {
            HomeScreen2()
        }


    }


}