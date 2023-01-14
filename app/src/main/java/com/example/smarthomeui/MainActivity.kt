package com.example.smarthomeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.smarthomeui.ui.theme.SmartHomeUiTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartHomeUiTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                ) {

                    val boxColor  = remember {
                        mutableStateOf(Color.Green)
                    }
                    Column {
                        MainColorBox(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(0.5f)
                                .background(Color.Red)
                            ) {
                            boxColor.value = it
                        }
                        ColorChangingBox(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(0.5f)
                                .background(boxColor.value)
                        )
                    }

                }
            }
        }
    }

}

@Composable
fun MainColorBox(
    modifier: Modifier,
    onMainBoxClicked: (Color) -> Unit
) {

    Box(
        modifier = modifier.clickable {
            onMainBoxClicked(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                )
            )
        }
    ) {

    }
}

@Composable
fun ColorChangingBox(modifier: Modifier) {

    Box(
        modifier = modifier
    )
}