package com.oceanbrasil.oceanjornadaandroidmar2024

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

data class Item(
    val id: Int,
    val nome: String,
    val imagem: String
)

data class ItemDetail(
    val id: Int,
    val nome: String,
    val imagem: String,
    val status: String,
    val especie: String,
    val genero: String,
)

interface ApiService {
    @GET("itens")
    fun carregarItens(): Call<Array<Item>>

    @GET("itens/{id}")
    fun carregarItem(@Path("id") id: Int): Call<ItemDetail>
}
