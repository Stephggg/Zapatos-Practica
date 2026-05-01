package com.example.shoe.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoe.model.Shoe

@Composable
fun ShoeItem(
    shoe: Shoe,
    onBuy: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = shoe.name, fontSize = 18.sp)
            Text(text = shoe.price, fontSize = 14.sp)
            Text(text = shoe.description, fontSize = 12.sp)

            Spacer(modifier = Modifier.height(8.dp))

            Button(onClick = onBuy) {
                Text("Comprar")
            }
        }
    }
}