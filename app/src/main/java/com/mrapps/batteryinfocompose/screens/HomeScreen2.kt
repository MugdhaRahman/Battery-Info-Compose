package com.mrapps.batteryinfocompose.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen2() {

    Column {
        Text("Home Screen 2")
    }



}

@Preview
@Composable
fun PreviewHome2Screen() {
    HomeScreen2()

}