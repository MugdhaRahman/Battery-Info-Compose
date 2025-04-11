package com.mrapps.batteryinfocompose.ui.theme.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ElevatedCards(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {},
    elevation: Dp = 6.dp,
    widthFill: Boolean = false, // Use `fillMaxWidth` or `wrapContentWidth`
    heightFill: Boolean = false, // Use `fillMaxHeight` or `wrapContentHeight`
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = elevation),
        modifier = modifier.then(
            if (widthFill) Modifier.fillMaxWidth() else Modifier.wrapContentWidth()
        ).then(
            if (heightFill) Modifier.fillMaxHeight() else Modifier.wrapContentHeight()
        )
    ) {
        Column(
            modifier = Modifier
                .then(
                    if (widthFill) Modifier.fillMaxWidth() else Modifier.wrapContentWidth()
                )
                .then(
                    if (heightFill) Modifier.fillMaxHeight() else Modifier.wrapContentHeight()
                )
                .padding(0.dp)
        ) {
            content() // Custom content to be inserted
        }
    }
}
