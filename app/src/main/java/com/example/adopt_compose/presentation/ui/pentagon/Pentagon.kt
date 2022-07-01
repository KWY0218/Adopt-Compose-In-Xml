package com.example.adopt_compose.presentation.ui.pentagon

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.adopt_compose.R

@Composable
fun GetPentagon() {
    val color = colorResource(id = R.color.back_gray)
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val centerX = this.size.center.x
        val centerY = this.size.center.y
        val path = Path().apply {
            moveTo(
                x = centerX - 70.dp.toPx(),
                y = centerY - 20.dp.toPx()
            )

            lineTo(
                x = centerX - 70.dp.toPx(),
                y = centerY + 60.dp.toPx(),
            )
            cubicTo(
                centerX - 70.dp.toPx(),
                centerY + 70.dp.toPx(),
                centerX - 60.dp.toPx(),
                centerY + 70.dp.toPx(),
                centerX - 50.dp.toPx(),
                centerY + 70.dp.toPx(),
            )

            lineTo(
                x = centerX + 50.dp.toPx(),
                y = centerY + 70.dp.toPx()
            )

            cubicTo(
                centerX + 60.dp.toPx(),
                centerY + 70.dp.toPx(),
                centerX + 70.dp.toPx(),
                centerY + 70.dp.toPx(),
                centerX + 70.dp.toPx(),
                centerY + 60.dp.toPx(),
            )

            lineTo(
                x = centerX + 70.dp.toPx(),
                y = centerY - 20.dp.toPx()
            )

            cubicTo(
                centerX + 70.dp.toPx(),
                centerY - 30.dp.toPx(),
                centerX + 70.dp.toPx(),
                centerY - 30.dp.toPx(),
                centerX + 50.dp.toPx(),
                centerY - 40.dp.toPx(),
            )

            lineTo(
                x = centerX + 20.dp.toPx(),
                y = centerY - 70.dp.toPx()
            )

            cubicTo(
                x1 = centerX,
                centerY - 85.dp.toPx(),
                x2 = centerX,
                centerY - 85.dp.toPx(),
                centerX - 20.dp.toPx(),
                centerY - 70.dp.toPx(),
            )

            lineTo(
                x = centerX - 60.dp.toPx(),
                y = centerY - 40.dp.toPx()
            )

            cubicTo(
                centerX - 70.dp.toPx(),
                centerY - 30.dp.toPx(),
                centerX - 70.dp.toPx(),
                centerY - 30.dp.toPx(),
                centerX - 70.dp.toPx(),
                centerY - 20.dp.toPx(),
            )
            close()
        }
        drawPath(path = path, color = color)
    }
}

@Preview(showBackground = true)
@Composable
fun PentagonPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        GetPentagon()
    }
}
