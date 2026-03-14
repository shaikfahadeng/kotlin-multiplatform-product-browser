package com.example.productbrowserapp.data.api

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.call.body
import kotlinx.serialization.json.Json

class ProductApi {

    private val client = HttpClient(CIO)

    suspend fun getProducts(): ProductResponse {

        val json: String =
            client.get("https://dummyjson.com/products").body()

        return Json {
            ignoreUnknownKeys = true
        }.decodeFromString(json)
    }
}