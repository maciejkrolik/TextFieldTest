package com.example.textfieldtest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.textfieldtest.ui.theme.TextFieldTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        MyTextField()
                    }
                }
            }
        }
    }
}

@Composable
fun MyTextField() {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        maxLines = 1,
        singleLine = true,
        onValueChange = { text = it }
    )
}