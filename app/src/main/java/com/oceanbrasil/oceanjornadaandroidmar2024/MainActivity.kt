package com.oceanbrasil.oceanjornadaandroidmar2024

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuração da RecyclerView
        val rvItens = findViewById<RecyclerView>(R.id.rvItens)
        rvItens.layoutManager = LinearLayoutManager(this)

        // Preparando interação com a API (Backend)
        val retrofit = Retrofit.Builder()
            .baseUrl("https://ocean-api-itens.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(ApiService::class.java)

        apiService.carregarItens().enqueue(object : Callback<Array<Item>> {
            override fun onResponse(call: Call<Array<Item>>, response: Response<Array<Item>>) {
                response.body()?.let {
                    Log.d("API", it.size.toString())

                    it.forEach {
                        Log.d("API", "${it.nome} - ${it.imagem}")
                    }
                }
            }

            override fun onFailure(call: Call<Array<Item>>, t: Throwable) {
                Log.e("API", "Erro ao carregar dados da API.", t)
            }
        })
    }
}
