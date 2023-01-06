package com.fufi.draggerdata.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fufi.draggerdata.model.ProductItem
import com.fufi.draggerdata.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: ProductRepository): ViewModel() {

    val productLiveData:LiveData<List<ProductItem>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProductsData()
        }
    }
}