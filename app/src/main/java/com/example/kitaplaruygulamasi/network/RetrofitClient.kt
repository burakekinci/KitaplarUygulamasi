package com.example.kitaplaruygulamasi.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    //gelen string url'i önce gsonConverterFactor ile dönüştür daha sonra retrofit objesi build et
    companion object{
        fun getClient(base_url: String) : Retrofit{
            return Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}