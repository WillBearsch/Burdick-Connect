package com.example.burdickconnect

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun locker(

    isReserved: Boolean = false,
    isLocked : Boolean = false,
    onReservedChanged: (Boolean) -> Unit,
    onLockedChanged: (Boolean) -> Unit
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        )
        {
            Text("Reserve a locker",
                fontSize = 40.sp,
                modifier = Modifier.padding(48.dp))
            Button(
                onClick = { onReservedChanged(!isReserved) },
                enabled = !isReserved,
                modifier = Modifier.padding(16.dp)
            ) {
                if (isReserved) {
                    Text("Reserved",
                        fontSize = 40.sp,
                        modifier = Modifier.padding(24.dp))
                } else {
                    Text("Reserve",
                        fontSize = 40.sp,
                        modifier = Modifier.padding(24.dp))
                }
            }
            Button(
                onClick = { onLockedChanged(!isLocked) },
                enabled = isReserved && !isLocked,
                modifier = Modifier.padding(16.dp)
            ) {
                if (isLocked) {
                    Text("Locked",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(16.dp))
                } else {
                    Text("Lock",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(16.dp))
                }
            }
        }
    }
}