package com.example.productbrowserapp.data.mapper

import com.example.productbrowserapp.data.api.ProductDto
import com.example.productbrowserapp.domain.Product

fun ProductDto.toDomain(): Product {
    return Product(
        id = id,
        title = title,
        price = price,
        thumbnail = thumbnail
    )
}
