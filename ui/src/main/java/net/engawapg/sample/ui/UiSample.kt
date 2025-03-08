package net.engawapg.sample.ui

import androidx.compose.foundation.Image
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TestComposable() {
    Image(painterResource(R.drawable.sakura), contentDescription = null)
}

@Preview(group = "UiSample", name = "testComposable")
@Composable
fun TestComposablePreview() {
    Surface {
        TestComposable()
    }
}