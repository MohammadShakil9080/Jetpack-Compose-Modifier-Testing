package com.example.modifiersjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.modifiersjetpack.ui.theme.ModifiersJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column (
                modifier= Modifier
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .background(Color.Green)
                    .border(5.dp, Color.Black)
                    .padding(5.dp)
                    .border(6.dp, Color.Red)
                    .padding(5.dp)
                    .border(7.dp, Color.Yellow)
                    .padding(5.dp)
                    .border(5.dp, Color.Black)
                    .padding(5.dp)
            ){
                Text(text = "Hello", modifier = Modifier.padding(15.dp))
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "Men", modifier = Modifier.padding(15.dp))
                Text(text = "Whats up?", modifier = Modifier.padding(15.dp))
            }
        }

    }
}