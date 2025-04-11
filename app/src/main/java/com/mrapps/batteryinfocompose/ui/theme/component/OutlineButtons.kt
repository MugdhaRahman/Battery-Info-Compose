package com.mrapps.batteryinfocompose.ui.theme.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomOutlinedButton(
    text: String,
    onClick: () -> Unit,
    paddingTop: Dp = 0.dp,
    paddingStart: Dp = 0.dp,
    paddingEnd: Dp = 0.dp,
    paddingBottom: Dp = 0.dp,
    borderColor: Color = Color.Black,
    textColor: Color = Color.Black,
    textSize: TextUnit = 0.sp,
    borderWidth: Dp = 0.dp,
    cornerRadius: Dp = 0.dp,
    modifier: Modifier = Modifier
) {
    OutlinedButton(
        onClick = { onClick() },
        modifier = modifier,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = textColor,
            containerColor = Color.Transparent
        ),
        shape = RoundedCornerShape(cornerRadius),
        contentPadding = PaddingValues(
            top = paddingTop,
            start = paddingStart,
            end = paddingEnd,
            bottom = paddingBottom
        ),
        border = BorderStroke(borderWidth, borderColor)
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = textSize
        )
    }
}