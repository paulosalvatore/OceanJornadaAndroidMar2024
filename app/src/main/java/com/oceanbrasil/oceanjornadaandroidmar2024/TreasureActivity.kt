package com.oceanbrasil.oceanjornadaandroidmar2024

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TreasureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treasure)

        val palavraChave = intent.getStringExtra("PALAVRA_CHAVE")

        val tvMensagem = findViewById<TextView>(R.id.tvMensagem)
        val ivTesouro = findViewById<ImageView>(R.id.ivTesouro)

        if (palavraChave == "ouro") {
            ivTesouro.setImageResource(R.drawable.ouro)
            tvMensagem.text = "Parabéns, você encontrou o ouro!"
        } else if (palavraChave == "prata") {
            ivTesouro.setImageResource(R.drawable.prata)
            tvMensagem.text = "Parabéns, você encontrou a prata!"
        } else if (palavraChave == "bronze") {
            ivTesouro.setImageResource(R.drawable.bronze)
            tvMensagem.text = "Parabéns, você encontrou o bronze!"
        } else {
            ivTesouro.setImageResource(R.drawable.bau_vazio)
            tvMensagem.text = "Desculpe, continue procurando!"
        }

        val btVoltar = findViewById<Button>(R.id.btVoltar)
        btVoltar.setOnClickListener {
            finish()
        }
    }
}
