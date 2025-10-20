package com.vanshika.blureffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.vanshika.blureffect.ui.theme.BlurEffectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlurEffectTheme {
                MainScreen()
            }
        }
    }
}