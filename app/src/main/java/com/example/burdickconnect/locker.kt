package com.example.burdickconnect

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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
    ){
        Column()
        {
            Text("Locker", modifier = Modifier.weight(1.0f))
            Button(
                onClick = { onReservedChanged(!isReserved) },
                enabled = !isReserved
            ) {
                if (isReserved) {
                    Text("Reserved",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(24.dp))
                } else {
                    Text("Reserve",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(24.dp))
                }
            }
            Button(
                onClick = { onLockedChanged(!isLocked) },
                enabled = isReserved && !isLocked
            ) {
                if (isLocked) {
                    Text("Locked",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(24.dp))
                } else {
                    Text("Lock",
                        fontSize = 30.sp,
                        modifier = Modifier.padding(24.dp))
                }
            }
        }
    }
}