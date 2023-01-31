package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
                    .width(300.dp)
                    .height(300.dp)
                    . background(Color.Green),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically


            ) {
                Greeting(name = "ANSARI")
                Text(text = "Mohammed")
                Text(text = "Abdul")
            }

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello dude $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        Row(
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
                . background(Color.Green),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically


        ) {
            Greeting(name = "ANSARI")
            Text(text = "Mohammed")
            Text(text = "Abdul")
        }
    }
}