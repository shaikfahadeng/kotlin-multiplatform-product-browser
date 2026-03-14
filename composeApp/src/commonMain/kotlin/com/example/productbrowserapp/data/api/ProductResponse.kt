package com.example.productbrowserapp.data.api

import kotlinx.serialization.Serializable

@Serializable
data class ProductResponse(
    val products: List<ProductDto>
)

@Serializable
data class ProductDto(
    val id: Int,
    val title: String,
    val price: Int,
    val thumbnail: String
)