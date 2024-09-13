package com.example.myapplication.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = { CustomTopBar(navController) },
        bottomBar = { CustomBottomBar(navController) }
    ) { innerPadding ->
        // Contenido de la pantalla principal
        Box(modifier = Modifier.padding(innerPadding)) {
            // Otros componentes aquí
        }
    }
}