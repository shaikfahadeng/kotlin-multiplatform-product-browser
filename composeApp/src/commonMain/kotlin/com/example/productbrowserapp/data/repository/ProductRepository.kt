package com.example.productbrowserapp.data.repository

import com.example.productbrowserapp.data.api.ProductApi
import com.example.productbrowserapp.data.mapper.toDomain
import com.example.productbrowserapp.domain.Product

class ProductRepository(
    private val api: ProductApi
) {

    suspend fun getProducts(): List<Product> {
        return api.getProducts().products.map { it.toDomain() }
    }

    fun searchProducts(products: List<Product>, query: String): List<Product> {
        return products.filter {
            it.title.contains(query, ignoreCase = true)
        }
    }
}
