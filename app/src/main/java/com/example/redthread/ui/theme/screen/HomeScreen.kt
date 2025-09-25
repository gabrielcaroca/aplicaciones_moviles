package com.example.redthread.ui.theme.screen

import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(){
    Scaffold (
        topBar = {
            TopAppBar(title = { Text(text = "RedThread")})
        }
    ) { innerPadding ->
        Column (
            modifier = Modifier
                .padding()
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(23.dp)
        ) {
            Text(text = "¡Bienvenido!")
            Button(onClick = { })
        }
    }
}