package com.oceanbrasil.oceanjornadaandroidmar2024

import retrofit2.Call
import retrofit2.http.GET

data class Item(
    val nome: String,
    val imagem: String
)

interface ApiService {
    @GET("itens")
    fun carregarItens(): Call<Array<Item>>
}
