package com.example.productbrowserapp.Presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productbrowserapp.data.repository.ProductRepository
import com.example.productbrowserapp.domain.Product
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ProductViewModel(
    private val repository: ProductRepository
) : ViewModel() {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> = _products

    fun loadProducts() {
        viewModelScope.launch {
            _products.value = repository.getProducts()
        }
    }

    fun search(query: String) {
        _products.value =
            repository.searchProducts(_products.value, query)
    }
}
