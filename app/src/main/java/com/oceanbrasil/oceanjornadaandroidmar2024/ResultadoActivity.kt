package com.oceanbrasil.oceanjornadaandroidmar2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Pegamos o btVoltar pelo ID
        val btVoltar = findViewById<Button>(R.id.btVoltar)

        // Criamos um listener para o evento de clique do botão
        btVoltar.setOnClickListener {
            // Finalizamos a tela
            finish()
        }
    }
}
