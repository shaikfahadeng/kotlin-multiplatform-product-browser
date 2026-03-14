package com.example.productbrowserapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.productbrowserapp.Presentation.ProductListScreen
import com.example.productbrowserapp.domain.Product

@Composable
fun App() {

    val sampleProducts = listOf(
        Product(1, "Phone", 500, ""),
        Product(2, "Laptop", 1200, ""),
        Product(3, "Headphones", 200, "")
    )

    MaterialTheme {
        ProductListScreen(products = sampleProducts)
    }
}
