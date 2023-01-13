package com.example.smarthomeui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.smarthomeui.ui.theme.cardColor

@Composable
fun EnergyConsumptionCard() {

    Card(
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = cardColor
            /*containerColor = MaterialTheme.colorScheme.surfaceVariant,*/
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )

    ) {

        Card(
            modifier = Modifier.padding(20.dp),
            shape = RoundedCornerShape(40.dp)
        ) {

            Column {
                Box(
                    modifier = Modifier
                        .background(Color.Green)
                        .padding(20.dp)
                ) {
                    Row {
                        Text(text = "Energy Consumption")
                        Text(
                            text = "04, Jan 2023"
                        )
                    }
                }
            }
        }

        Row(
            modifier = Modifier
                .padding(20.dp)
                .border(BorderStroke(width = 1.dp, cardColor))
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,

        ) {
            ProfileImage(height = 48.dp)
            Column(modifier = Modifier.padding(start = 6.dp)) {
                Text(text = "31.7kWh", color = Color.White)
                Text(text = "Today", color = Color.White)
            }
            Spacer(modifier = Modifier.width(24.dp))
            ProfileImage(height = 48.dp)
            Column(modifier = Modifier.padding(start = 6.dp)) {
                Text(text = "31.7kWh", color = Color.White)
                Text(text = "Today", color = Color.White)
            }

        }


    }



}

@Composable
fun EnergyIconCircle(iconId: Int) {

    Card(
        modifier = Modifier
            .padding(12.dp),
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Yellow
            /*containerColor = MaterialTheme.colorScheme.surfaceVariant,*/
        )
    ) {

        Image(painter = painterResource(id = iconId), contentDescription = "icon")

    }

}










