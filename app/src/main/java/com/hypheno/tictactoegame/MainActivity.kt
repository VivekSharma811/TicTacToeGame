package com.hypheno.tictactoegame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hypheno.tictactoegame.ui.theme.OnlineTicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnlineTicTacToeTheme {
                
            }
        }
    }
}