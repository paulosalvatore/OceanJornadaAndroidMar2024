package com.oceanbrasil.oceanjornadaandroidmar2024.model.api

import com.oceanbrasil.oceanjornadaandroidmar2024.model.domain.Item
import com.oceanbrasil.oceanjornadaandroidmar2024.model.domain.ItemDetail
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("itens")
    fun carregarItens(): Call<Array<Item>>

    @GET("itens/{id}")
    fun carregarItem(@Path("id") id: Int): Call<ItemDetail>
}
