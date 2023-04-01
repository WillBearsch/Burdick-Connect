package com.example.burdickconnect

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun loginScreen() {
    Box(
        contentAlignment = Alignment.Center,
    ){
        Column()
        {
            Text("User Log-In", modifier = Modifier.weight(1.0f))
        }
    }
}