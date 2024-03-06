package com.oceanbrasil.oceanjornadaandroidmar2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        // Pegamos a informação que está na Intent
        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")
        // Acessamos o tvResultado pelo ID
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        // Atualizamos o texto do tvResultado com o nomeDigitado
        tvResultado.text = nomeDigitado

        // Pegamos o btVoltar pelo ID
        val btVoltar = findViewById<Button>(R.id.btVoltar)

        // Criamos um listener para o evento de clique do botão
        btVoltar.setOnClickListener {
            // Finalizamos a tela
            finish()
        }
    }
}
