package com.example.shoe.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InicioScreen(
    onDetalle: () -> Unit,
    onPerfil: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Tienda de Zapatos",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("Bienvenido a nuestra tienda de zapatos.")

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = onDetalle,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ver productos")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onPerfil,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ir a perfil")
        }
    }
}