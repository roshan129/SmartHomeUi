package com.example.smarthomeui

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SpecificRoomCardSection() {

    Column(

    ) {

        RoomCard(roomName = "Bedroom", devices = 6)
        RoomCard(roomName = "Living Room", devices = 12, isConsuming = true, 16)
        RoomCard(roomName = "Bathroom", devices = 3, true, 7)
        RoomCard(roomName = "Kitchen", devices = 8, isConsuming = true, 12)
    }

}

@Composable
fun RoomCard(
    roomName: String,
    devices: Int,
    isConsuming: Boolean = false,
    consumptionWatt: Int = 0
) {

    Card(
        modifier = Modifier
            .padding(12.dp)
            .background(color = Color.White),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            ProfileImage(mainIcon = R.drawable.single_bed_24, height = 48.dp)
            Text(
                text = roomName, fontWeight = FontWeight.Bold, fontSize = 12.sp,
                modifier = Modifier.padding(top = 12.dp)
            )
            Text(
                text = "$devices devices", fontSize = 12.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
            Spacer(modifier = Modifier.height(12.dp))
            if (isConsuming) Text(text = "Consuming ${consumptionWatt}kWh", fontSize = 12.sp)
            else Text(text = "Not Consuming", fontSize = 12.sp)

        }

    }


}