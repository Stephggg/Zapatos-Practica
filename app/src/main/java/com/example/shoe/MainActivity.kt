package com.example.shoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.shoe.navigation.AppNavigation
import com.example.shoe.ui.theme.ShoeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoeTheme {
                AppNavigation()
            }
        }
    }
}