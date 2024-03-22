package com.oceanbrasil.oceanjornadaandroidmar2024.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oceanbrasil.oceanjornadaandroidmar2024.R
import com.oceanbrasil.oceanjornadaandroidmar2024.viewmodel.ItemViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configuração da RecyclerView
        val rvItens = findViewById<RecyclerView>(R.id.rvItens)
        rvItens.layoutManager = LinearLayoutManager(this)

        // Exemplo com Grid de 2 colunas:
        // rvItens.layoutManager = GridLayoutManager(this, 2)

        val itemViewModel = ViewModelProvider(this)[ItemViewModel::class.java]
        itemViewModel.itens.observe(this) {
            rvItens.adapter = ItemAdapter(it)
        }
    }
}
