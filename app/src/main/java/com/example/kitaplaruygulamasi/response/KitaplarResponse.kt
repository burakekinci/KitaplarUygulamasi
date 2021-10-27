package com.example.kitaplaruygulamasi.response

import com.example.kitaplaruygulamasi.model.Kitap
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class KitaplarResponse(
    @SerializedName("books") @Expose var books : List<Kitap>,
    @SerializedName("success") @Expose var success : Int
) : Serializable
