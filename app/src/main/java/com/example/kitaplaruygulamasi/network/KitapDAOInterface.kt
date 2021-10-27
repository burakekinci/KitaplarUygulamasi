package com.example.kitaplaruygulamasi.network

import com.example.kitaplaruygulamasi.response.KitaplarResponse
import retrofit2.Call
import retrofit2.http.GET

// hangi http isteklerinin yapılacağı buradan belirtilecek
interface KitapDAOInterface {

    @GET("all_books.php")
    fun kitaplariAl() : Call<KitaplarResponse>
}