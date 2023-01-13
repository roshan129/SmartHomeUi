package com.example.smarthomeui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ProfileImage(padding: Dp = 0.dp, height: Dp = 64.dp, mainIcon: Int = R.drawable.ic_launcher_background) {

    Image(
        painter = painterResource(id = mainIcon),
        contentDescription = "Profile Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(start = 16.dp)
            .width(height)
            .height(height)
            .clip(CircleShape)
            .border(1.dp, Color.Gray, CircleShape)
            .padding(padding)
    )

}