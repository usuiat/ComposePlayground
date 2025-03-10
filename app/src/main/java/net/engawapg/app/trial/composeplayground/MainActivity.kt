package net.engawapg.app.trial.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import net.engawapg.app.trial.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePlaygroundTheme {
                Box(modifier = Modifier.fillMaxSize().safeDrawingPadding()) {
                    Sample()
                }
            }
        }
    }
}

@Composable
fun Sample() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Blue)
            .align(Alignment.TopStart)
            .clickable { println("*** Click ***") }
        )
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Blue)
            .align(Alignment.Center)
            .clickable { println("*** Click ***") }
        )
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Blue)
            .align(Alignment.BottomEnd)
            .clickable { println("*** Click ***") }
        )
    }
}