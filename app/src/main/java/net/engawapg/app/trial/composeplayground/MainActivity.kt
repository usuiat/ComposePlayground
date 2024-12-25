package net.engawapg.app.trial.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import net.engawapg.app.trial.composeplayground.ui.theme.ComposePlaygroundTheme
import net.engawapg.lib.zoomable.rememberZoomState
import net.engawapg.lib.zoomable.zoomable

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
    val painter = painterResource(R.drawable.fuji)
    val zoomState = rememberZoomState(contentSize = painter.intrinsicSize)
    Image(
        painter = painter,
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .zoomable(zoomState)
    )
}