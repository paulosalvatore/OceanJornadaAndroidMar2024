package com.oceanbrasil.oceanjornadaandroidmar2024.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.android.material.chip.Chip
import com.oceanbrasil.oceanjornadaandroidmar2024.model.api.ApiService
import com.oceanbrasil.oceanjornadaandroidmar2024.model.domain.ItemDetail
import com.oceanbrasil.oceanjornadaandroidmar2024.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ItemDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)

        val id = intent.getIntExtra("ID", 0)

        if (id == 0) {
            return finish()
        }

        Toast.makeText(this, "Carregar API para o ID $id", Toast.LENGTH_LONG).show()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://ocean-api-itens.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(ApiService::class.java)

        apiService.carregarItem(id).enqueue(object : Callback<ItemDetail> {
            override fun onResponse(call: Call<ItemDetail>, response: Response<ItemDetail>) {
                response.body()?.let {
                    Log.d("API", it.toString())

                    val tvNome = findViewById<TextView>(R.id.tvNome)
                    val ivImagem = findViewById<ImageView>(R.id.ivImagem)
                    val chipStatus = findViewById<Chip>(R.id.chipStatus)
                    val chipEspecie = findViewById<Chip>(R.id.chipEspecie)
                    val chipGenero = findViewById<Chip>(R.id.chipGenero)

                    tvNome.text = it.nome
                    Glide.with(ivImagem).load(it.imagem).into(ivImagem)
                    chipStatus.text = "Status: ${it.status}"
                    chipEspecie.text = "Espécie: ${it.especie}"
                    chipGenero.text = "Gênero: ${it.genero}"
                }
            }

            override fun onFailure(call: Call<ItemDetail>, t: Throwable) {
                Log.e("API", "Erro ao carregar dados da API.", t)
            }
        })
    }
}
