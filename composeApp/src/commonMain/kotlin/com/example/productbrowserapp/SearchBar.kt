package com.example.productbrowserapp

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier

@Composable
fun SearchBar(onSearch: (String) -> Unit) {

    var text by remember { mutableStateOf("") }

    Row {

        TextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.weight(1f),
            placeholder = { Text("Search products") }
        )

        Button(
            onClick = { onSearch(text) }
        ) {
            Text("Search")
        }
    }
}
