package com.example.burdickconnect

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import navigation.Routes

// nav: NavHostController

@Composable
fun welcomeScreen(nav: NavHostController) {

    Box(
        contentAlignment = Alignment.Center,
    ){
        Column()
        {
            Text("Welcome Screen", modifier = Modifier.weight(1.0f))
        }
    }

}