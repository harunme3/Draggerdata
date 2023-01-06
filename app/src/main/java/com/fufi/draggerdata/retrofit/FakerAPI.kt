package com.fufi.draggerdata.retrofit

import com.fufi.draggerdata.model.ProductItem
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {
    @GET("users")
   suspend fun getproducts():Response<List<ProductItem>>


}