package com.mrapps.batteryinfocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mrapps.batteryinfocompose.screens.MainScreen
import com.mrapps.batteryinfocompose.ui.theme.BatteryInfoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BatteryInfoComposeTheme {

                MainScreen()

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BatteryInfoComposeTheme {
        MainScreen()
    }
}