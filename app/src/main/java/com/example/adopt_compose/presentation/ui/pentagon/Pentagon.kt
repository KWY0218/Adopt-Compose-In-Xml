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
    val siteList = arrayOf(
        arrayOf(
            Pair(first = -70, second = 60),
            Pair(first = -70, second = 70),
            Pair(first = -60, second = 70),
            Pair(first = -50, second = 70)
        ),
        arrayOf(
            Pair(first = 50, second = 70),
            Pair(first = 60, second = 70),
            Pair(first = 70, second = 70),
            Pair(first = 70, second = 60)
        ),
        arrayOf(
            Pair(first = 70, second = -20),
            Pair(first = 70, second = -30),
            Pair(first = 60, second = -40)
        ),
        arrayOf(
            Pair(first = 20, second = -70),
            Pair(first = 0, second = -85),
            Pair(first = -20, second = -70)
        ),
        arrayOf(
            Pair(first = -60, second = -40),
            Pair(first = -70, second = -30),
            Pair(first = -70, second = -20)
        )
    )

    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val centerX = this.size.center.x
        val centerY = this.size.center.y
        val path = Path().apply {
            reset()
            moveTo(
                x = centerX + siteList[4][2].first.dp.toPx(),
                y = centerY + siteList[4][2].second.dp.toPx()
            )
            lineTo(
                x = centerX + siteList[0][0].first.dp.toPx(),
                y = centerY + siteList[0][0].second.dp.toPx(),
            )
            cubicTo(
                centerX + siteList[0][1].first.dp.toPx(),
                centerX + siteList[0][1].second.dp.toPx(),
                centerX + siteList[0][2].first.dp.toPx(),
                centerX + siteList[0][2].second.dp.toPx(),
                centerX + siteList[0][3].first.dp.toPx(),
                centerX + siteList[0][3].second.dp.toPx()
            )
//
//            lineTo(
//                x = centerX + siteList[1][0].first.dp.toPx(),
//                y = centerY + siteList[1][0].second.dp.toPx(),
//            )
//
//            cubicTo(
//                centerX + siteList[1][1].first.dp.toPx(),
//                centerX + siteList[1][1].second.dp.toPx(),
//                centerX + siteList[1][2].first.dp.toPx(),
//                centerX + siteList[1][2].second.dp.toPx(),
//                centerX + siteList[1][3].first.dp.toPx(),
//                centerX + siteList[1][3].second.dp.toPx()
//            )
//
//            lineTo(
//                x = centerX + siteList[2][0].first.dp.toPx(),
//                y = centerY + siteList[2][0].second.dp.toPx(),
//            )
//
//            cubicTo(
//                centerX + siteList[2][1].first.dp.toPx(),
//                centerX + siteList[2][1].second.dp.toPx(),
//                centerX + siteList[2][1].first.dp.toPx(),
//                centerX + siteList[2][1].second.dp.toPx(),
//                centerX + siteList[2][2].first.dp.toPx(),
//                centerX + siteList[2][2].second.dp.toPx()
//            )
//
//            lineTo(
//                x = centerX + siteList[3][0].first.dp.toPx(),
//                y = centerY + siteList[3][0].second.dp.toPx(),
//            )
//
//            cubicTo(
//                centerX + siteList[3][1].first.dp.toPx(),
//                centerX + siteList[3][1].second.dp.toPx(),
//                centerX + siteList[3][1].first.dp.toPx(),
//                centerX + siteList[3][1].second.dp.toPx(),
//                centerX + siteList[3][2].first.dp.toPx(),
//                centerX + siteList[3][2].second.dp.toPx()
//            )
//
//            lineTo(
//                x = centerX + siteList[4][0].first.dp.toPx(),
//                y = centerY + siteList[4][0].second.dp.toPx(),
//            )
//
//            cubicTo(
//                centerX + siteList[4][1].first.dp.toPx(),
//                centerX + siteList[4][1].second.dp.toPx(),
//                centerX + siteList[4][1].first.dp.toPx(),
//                centerX + siteList[4][1].second.dp.toPx(),
//                centerX + siteList[4][2].first.dp.toPx(),
//                centerX + siteList[4][2].second.dp.toPx()
//            )
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
