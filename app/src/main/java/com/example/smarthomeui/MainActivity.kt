package com.example.smarthomeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.smarthomeui.ui.theme.SmartHomeUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartHomeUiTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                ) {

                    MainScreen()
                }
            }
        }
    }

}

@Composable
fun MainScreen() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())

        ) {
            Spacer(modifier = Modifier.height(16.dp))
            ProfileImage()
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "Hello, Emmamuel", fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 16.dp))
            Spacer(modifier = Modifier.height(16.dp))
            EnergyConsumptionCard()
            ChipSection()
            SpecificRoomCardSection()
        }
    }


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SmartHomeUiTheme {
        Greeting("Android")
    }
}