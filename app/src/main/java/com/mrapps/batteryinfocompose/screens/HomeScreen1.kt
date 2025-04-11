package com.mrapps.batteryinfocompose.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mrapps.batteryinfocompose.R
import com.mrapps.batteryinfocompose.components.HomeButton
import com.mrapps.batteryinfocompose.ui.theme.colorPrimary
import com.mrapps.batteryinfocompose.components.CustomOutlinedButton
import com.mrapps.batteryinfocompose.components.ElevatedCards
import com.mrapps.batteryinfocompose.ui.theme.textColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen1() {
    val maxIn = 0f
    val maxOut = 0f
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ElevatedCards(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp),
            widthFill = true,
            heightFill = false,
            content = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 100.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Max in = $maxIn",
                            modifier = Modifier.padding(start = 10.dp),
                            textAlign = TextAlign.Center,
                            color = textColor,
                            fontSize = 12.sp
                        )

                        CustomOutlinedButton(
                            text = "Reset",
                            onClick = { /* Handle click */ },
                            paddingTop = 0.dp,
                            paddingStart = 5.dp,
                            paddingEnd = 5.dp,
                            paddingBottom = 0.dp,
                            borderColor = colorPrimary,
                            textColor = colorPrimary,
                            textSize = 12.sp,
                            borderWidth = 0.5.dp,
                            cornerRadius = 5.dp,
                        )


                    }


                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Max out = $maxOut",
                            modifier = Modifier.padding(end = 10.dp),
                            textAlign = TextAlign.Center,
                            color = textColor,
                            fontSize = 12.sp
                        )

                        CustomOutlinedButton(
                            text = "Reset",
                            onClick = { /* Handle click */ },
                            paddingTop = 0.dp,
                            paddingStart = 5.dp,
                            paddingEnd = 5.dp,
                            paddingBottom = 0.dp,
                            borderColor = colorPrimary,
                            textColor = colorPrimary,
                            textSize = 12.sp,
                            borderWidth = 0.5.dp,
                            cornerRadius = 5.dp,
                        )


                    }
                }
            })

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            HomeButton(
                modifier = Modifier.weight(1f),
                cardColors = CardDefaults.outlinedCardColors().copy(
                    containerColor = Color.White,
                ),
                image = R.drawable.ic_voltage,
                title = "Watt",
                text = "12.0",
                onItemClicked = {

                })

            HomeButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 5.dp, end = 5.dp),
                cardColors = CardDefaults.outlinedCardColors().copy(
                    containerColor = Color.White,
                ),
                image = R.drawable.ic_temperature,
                title = "Temperature",
                text = "40.5°C",
                onItemClicked = {

                })

            HomeButton(
                modifier = Modifier.weight(1f),
                cardColors = CardDefaults.outlinedCardColors().copy(
                    containerColor = Color.White,
                ),
                image = R.drawable.ic_thunder,
                title = "Charging",
                text = "45.0W",
                onItemClicked = {

                })


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            HomeButton(
                modifier = Modifier.weight(1f),
                cardColors = CardDefaults.outlinedCardColors().copy(
                    containerColor = Color.White,
                ),
                image = R.drawable.ic_health,
                title = "Health",
                text = "Good",
                onItemClicked = {

                })

            HomeButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 5.dp, end = 5.dp),
                cardColors = CardDefaults.outlinedCardColors().copy(
                    containerColor = Color.White,
                ),
                image = R.drawable.ic_tech,
                title = "Technology",
                text = "Li-ion",
                onItemClicked = {

                })

            HomeButton(
                modifier = Modifier.weight(1f),
                cardColors = CardDefaults.outlinedCardColors().copy(
                    containerColor = Color.White,
                ),
                image = R.drawable.ic_plug,
                title = "Power",
                text = "Battery",
                onItemClicked = {

                })


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            HomeButton(
                modifier = Modifier.weight(1f),
                cardColors = CardDefaults.outlinedCardColors().copy(
                    containerColor = Color.White,
                ),
                image = R.drawable.ic_android,
                title = "Version",
                text = "android",
                onItemClicked = {

                })

            HomeButton(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 5.dp, end = 5.dp),
                cardColors = CardDefaults.outlinedCardColors().copy(
                    containerColor = Color.White,
                ),
                image = R.drawable.ic_manufact,
                title = "Manufacturer",
                text = "Samsung",
                onItemClicked = {

                })

            HomeButton(
                modifier = Modifier.weight(1f),
                cardColors = CardDefaults.outlinedCardColors().copy(
                    containerColor = Color.White,
                ),
                image = R.drawable.ic_model,
                title = "Model",
                text = "Model",
                onItemClicked = {

                })


        }

    }


}

@Preview
@Composable
fun PreviewHome1Screen() {
    HomeScreen1()

}