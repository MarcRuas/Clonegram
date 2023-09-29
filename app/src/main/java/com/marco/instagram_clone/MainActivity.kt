package com.marco.instagram_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.marco.instagram_clone.ui.theme.InstagramCloneTheme
import com.marco.instagram_clone.ui.view.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            InstagramCloneTheme {
                HomeScreen()
            }
        }
    }
}

