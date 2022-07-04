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
    val siteList = arrayListOf(
        arrayOf(Pair(-70, 60), Pair(-70, 70), Pair(-60, 70), Pair(-50, 70)),
        arrayOf(Pair(50, 70), Pair(60, 70), Pair(70, 70), Pair(70, 60)),
        arrayOf(Pair(70, -20), Pair(70, -30), Pair(60, -40)),
        arrayOf(Pair(20, -70), Pair(0, -85), Pair(-20, -70)),
        arrayOf(Pair(-60, -40), Pair(-70, -30), Pair(-70, -20))
    )
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val centerX = this.size.center.x
        val centerY = this.size.center.y
        val path = Path().apply {
            moveTo(
                x = centerX + siteList[4][2].first.dp.toPx(),
                y = centerY + siteList[4][2].second.dp.toPx()
            )
            for (i in 0..4) {
                lineTo(
                    x = centerX + siteList[i][0].first.dp.toPx(),
                    y = centerY + siteList[i][0].second.dp.toPx()
                )
                if (i < 2) {
                    cubicTo(
                        centerX + siteList[i][1].first.dp.toPx(),
                        centerY + siteList[i][1].second.dp.toPx(),
                        centerX + siteList[i][2].first.dp.toPx(),
                        centerY + siteList[i][2].second.dp.toPx(),
                        centerX + siteList[i][3].first.dp.toPx(),
                        centerY + siteList[i][3].second.dp.toPx(),
                    )
                } else {
                    cubicTo(
                        centerX + siteList[i][1].first.dp.toPx(),
                        centerY + siteList[i][1].second.dp.toPx(),
                        centerX + siteList[i][1].first.dp.toPx(),
                        centerY + siteList[i][1].second.dp.toPx(),
                        centerX + siteList[i][2].first.dp.toPx(),
                        centerY + siteList[i][2].second.dp.toPx(),
                    )
                }
            }
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
