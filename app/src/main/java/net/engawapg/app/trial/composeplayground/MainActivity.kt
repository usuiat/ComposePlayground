package net.engawapg.app.trial.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.SplitButtonDefaults
import androidx.compose.material3.SplitButtonLayout
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.tooling.preview.Preview
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

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Preview
@Composable
fun Sample() {
    ComposePlaygroundTheme {
        Surface {
            var checked by remember { mutableStateOf(false) }

            SplitButtonLayout(
                leadingButton = {
                    SplitButtonDefaults.LeadingButton(
                        onClick = { /* Do Nothing */ },
                    ) {
                        Icon(
                            Icons.Filled.Edit,
                            modifier = Modifier.size(SplitButtonDefaults.LeadingIconSize),
                            contentDescription = "Localized description",
                        )
                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                        Text("My Button")
                    }
                },
                trailingButton = {
                    SplitButtonDefaults.TrailingButton(
                        checked = checked,
                        onCheckedChange = { checked = it },
                        modifier =
                        Modifier.semantics {
                            stateDescription = if (checked) "Expanded" else "Collapsed"
                            contentDescription = "Toggle Button"
                        },
                    ) {
                        val rotation: Float by
                        animateFloatAsState(
                            targetValue = if (checked) 180f else 0f,
                            label = "Trailing Icon Rotation"
                        )
                        Icon(
                            Icons.Filled.KeyboardArrowDown,
                            modifier =
                            Modifier.size(SplitButtonDefaults.TrailingIconSize).graphicsLayer {
                                this.rotationZ = rotation
                            },
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Preview
@Composable
fun Sample2() {
    ComposePlaygroundTheme {
        Surface {
            var checked by remember { mutableStateOf(false) }

            SplitButtonLayout(
                leadingButton = {
                    SplitButtonDefaults.TonalLeadingButton(
                        onClick = { /* Do Nothing */ },
                    ) {
                        Icon(
                            Icons.Filled.Edit,
                            modifier = Modifier.size(SplitButtonDefaults.LeadingIconSize),
                            contentDescription = "Localized description",
                        )
                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                        Text("My Button")
                    }
                },
                trailingButton = {
                    SplitButtonDefaults.TonalTrailingButton(
                        checked = checked,
                        onCheckedChange = { checked = it },
                        modifier =
                        Modifier.semantics {
                            stateDescription = if (checked) "Expanded" else "Collapsed"
                            contentDescription = "Toggle Button"
                        },
                    ) {
                        val rotation: Float by
                        animateFloatAsState(
                            targetValue = if (checked) 180f else 0f,
                            label = "Trailing Icon Rotation"
                        )
                        Icon(
                            Icons.Filled.KeyboardArrowDown,
                            modifier =
                            Modifier.size(SplitButtonDefaults.TrailingIconSize).graphicsLayer {
                                this.rotationZ = rotation
                            },
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        }
    }
}