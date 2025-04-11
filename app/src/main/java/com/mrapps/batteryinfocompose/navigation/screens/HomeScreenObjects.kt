package com.mrapps.batteryinfocompose.navigation.screens

import kotlinx.serialization.Serializable

sealed class HomeScreenObjects {
    @Serializable
    object Home1 : HomeScreenObjects()
    @Serializable
    object Home2 : HomeScreenObjects()
}
