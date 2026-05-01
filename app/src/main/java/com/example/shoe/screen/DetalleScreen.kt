package com.example.shoe.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoe.model.Shoe

@Composable
fun DetalleScreen(
    onInicio: () -> Unit,
    onPerfil: () -> Unit
) {
    val shoes = listOf(
        Shoe("Tenis deportivos", "C$ 1200", "Ideales para caminar y hacer ejercicio."),
        Shoe("Zapatos casuales", "C$ 950", "Cómodos para uso diario."),
        Shoe("Sandalias", "C$ 700", "Perfectas para clima cálido."),
        Shoe("Botines elegantes", "C$ 1500", "Buena opción para eventos especiales.")
    )

    var mensaje by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Text("Productos disponibles", fontSize = 28.sp)

        Spacer(modifier = Modifier.height(12.dp))

        LazyColumn {
            items(shoes) { shoe ->
                ShoeItem(shoe = shoe) {
                    mensaje = "${shoe.name} agregado al carrito"
                }
            }
        }

        if (mensaje.isNotEmpty()) {
            Text(text = mensaje)
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onPerfil,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ir a perfil")
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