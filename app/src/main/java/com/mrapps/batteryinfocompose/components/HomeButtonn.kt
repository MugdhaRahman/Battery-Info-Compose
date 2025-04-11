package com.mrapps.batteryinfocompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mrapps.batteryinfocompose.R
import com.mrapps.batteryinfocompose.ui.theme.textColor

@Composable
fun HomeButton(
    modifier: Modifier = Modifier,
    cardColors: CardColors = CardDefaults.outlinedCardColors(),
    image: Int = R.drawable.ic_voltage,
    title: String = "Voltage",
    text: String = "12.0",
    onItemClicked: () -> Unit = { },
) {


    OutlinedCard(
        modifier = modifier.clickable {
            onItemClicked()
        },
        elevation = CardDefaults.outlinedCardElevation(
            defaultElevation = 4.dp,
            pressedElevation = 8.dp,
            focusedElevation = 8.dp,
            hoveredElevation = 8.dp
        ),
        colors = cardColors
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = title,
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
            )

            Spacer(modifier = Modifier.padding(8.dp))

            Text(
                text = title, textAlign = TextAlign.Center, color = textColor, fontSize = 12.sp
            )

            Spacer(modifier = Modifier.padding(4.dp))

            Text(
                text = text,
                textAlign = TextAlign.Center,
                color = textColor,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }


    }


}


@Preview
@Composable
fun HomeButtonPreview() {
    HomeButton()
}