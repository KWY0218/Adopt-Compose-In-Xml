package com.example.adopt_compose.presentation.ui

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.adopt_compose.R

@Composable
fun RuleIcon(
    @DrawableRes iconId: Int = R.drawable.ic_launcher_foreground,
    enabled: Boolean = true
) {
    var isClick by remember { mutableStateOf(false) }
    val setSize by animateDpAsState(targetValue = if (isClick) 70.dp else 40.dp)
    Box(
        modifier = Modifier
            .clip(shape = CircleShape)
            .background(colorResource(id = R.color.hous_gray))
            .size(setSize)
            .clickable(enabled = enabled) { isClick = !isClick }
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp),
            alignment = Alignment.Center,
            painter = painterResource(id = iconId),
            contentDescription = ""
        )
    }
}

@Composable
fun RuleList() {
    LazyRow(
        modifier = Modifier
            .wrapContentSize()
            .selectableGroup(),
        contentPadding = PaddingValues(10.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        item { RuleIcon(R.drawable.ic_person, enabled = false) }
        items(5) { RuleIcon() }
        item { RuleIcon(R.drawable.ic_add) }
    }
}

@Preview(showBackground = true)
@Composable
private fun RuleIconPreview() {
    RuleIcon()
}

@Preview(showBackground = true)
@Composable
private fun RuleListPreview() {
    RuleList()
}
