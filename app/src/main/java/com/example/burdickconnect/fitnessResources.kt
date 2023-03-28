package com.example.burdickconnect

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration

@Composable
fun fitnessResources(
    link: (String)->Unit,
)
{
    Box(
        contentAlignment = Alignment.Center,
    ){
        Column()
        {
            Text("Testing", modifier = Modifier.weight(1.0f))
        }
    }
}