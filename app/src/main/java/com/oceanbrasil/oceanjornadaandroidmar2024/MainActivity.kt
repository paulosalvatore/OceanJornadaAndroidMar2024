package com.oceanbrasil.oceanjornadaandroidmar2024

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://ocean-api-itens.onrender.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
