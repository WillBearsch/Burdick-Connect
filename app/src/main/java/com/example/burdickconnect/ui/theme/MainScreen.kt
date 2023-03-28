package com.example.burdickconnect.ui.theme

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import navigation.BurdickNavGraph

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(){
    val nav = rememberNavController()
    Scaffold(
        topBar = {
            TopBar(nav = nav)
        },
    ){
        BurdickNavGraph(nav)
    }
}

@Composable
private fun TopBar(
    nav: NavHostController
) {
    TopAppBar(
        title = {Text("Burdick Connect")},
    )
}