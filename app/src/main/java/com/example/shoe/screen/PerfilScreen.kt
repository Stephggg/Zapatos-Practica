package com.example.shoe.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PerfilScreen(
    onInicio: () -> Unit,
    onDetalle: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Perfil del Cliente",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text("Nombre: Cliente invitado")
        Text("Estado: Revisando productos")
        Text("Tienda favorita: Tienda de Zapatos")

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = onDetalle,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ver productos")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = onInicio,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Volver al inicio")
        }
    }
}