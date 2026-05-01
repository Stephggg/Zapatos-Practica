package com.example.shoe.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.shoe.screen.DetalleScreen
import com.example.shoe.screen.InicioScreen
import com.example.shoe.screen.PerfilScreen

@Composable
fun AppNavigation() {
    var screen by remember { mutableStateOf("inicio") }

    when (screen) {
        "inicio" -> InicioScreen(
            onDetalle = { screen = "detalle" },
            onPerfil = { screen = "perfil" }
        )

        "detalle" -> DetalleScreen(
            onInicio = { screen = "inicio" },
            onPerfil = { screen = "perfil" }
        )

        "perfil" -> PerfilScreen(
            onInicio = { screen = "inicio" },
            onDetalle = { screen = "detalle" }
        )
    }
}