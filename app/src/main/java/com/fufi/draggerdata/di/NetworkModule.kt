package com.fufi.draggerdata.di

import com.fufi.draggerdata.retrofit.FakerAPI
import com.fufi.draggerdata.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideRetrofit() :Retrofit{
        return Retrofit.Builder().baseUrl(Constants.Base_url).addConverterFactory(GsonConverterFactory.create()).build()
    }
    @Singleton
    @Provides
    fun provideFakerAPI(retrofit: Retrofit):FakerAPI{
        return  retrofit.create(FakerAPI::class.java)  //<--- It provide all body implementation for FakerAPI Interface
    }
}