package com.fufi.draggerdata.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.fufi.draggerdata.model.ProductItem
import com.fufi.draggerdata.retrofit.FakerAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI) {


    private  val _products=MutableLiveData<List<ProductItem>>()
    val products : LiveData<List<ProductItem>>
    get() = _products


    suspend fun getProductsData(){
        val result=fakerAPI.getproducts()
        if (result.isSuccessful && result.body()!=null){
                _products.postValue(result.body())
        }
    }
}