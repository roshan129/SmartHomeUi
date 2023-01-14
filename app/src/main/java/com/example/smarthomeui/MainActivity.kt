package com.example.smarthomeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.smarthomeui.ui.theme.SmartHomeUiTheme
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SmartHomeUiTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                ) {

                    val textString = remember {
                        mutableStateOf("")
                    }
                    val snackBarHostState  = SnackbarHostState()
                    val scope  = rememberCoroutineScope()

                    Scaffold(
                        modifier = Modifier
                            .fillMaxSize(),
                        snackbarHost = {
                            SnackbarHost(hostState = snackBarHostState)
                        },
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(it)
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {

                            TextField(
                                value = textString.value,
                                onValueChange = { it: String ->
                                    textString.value = it
                                },
                                label = {
                                    Text(text = "Please Enter Name")
                                }
                            )
                            Button(onClick = {
                                scope.launch {
                                    snackBarHostState.showSnackbar(
                                        "Hello ${textString.value}"
                                    )
                                }

                            }) {
                                Text(text = "Greet Me")
                            }

                        }
                    }


                }
            }
        }
    }

}



