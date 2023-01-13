package com.example.smarthomeui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.smarthomeui.ui.theme.Pink40
import com.example.smarthomeui.ui.theme.Purple40

@Composable
fun Chip(text: String, chipColor: Color = Color.LightGray, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(8.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(color = Color.LightGray)


    ) {
        Text(
            text, style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(
                start = 24.dp, end = 24.dp, top = 12.dp,
                bottom = 12.dp
            )
        )
    }
}