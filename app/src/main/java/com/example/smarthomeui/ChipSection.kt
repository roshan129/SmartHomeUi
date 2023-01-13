package com.example.smarthomeui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.smarthomeui.ui.theme.gold

@Composable
fun ChipSection() {

    Box(
        modifier = Modifier.padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Chip(text = "Rooms") {

            }
            Spacer(modifier = Modifier.width(12.dp))
            Chip(text = "Devices") {

            }

        }
    }

}