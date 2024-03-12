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

        var imagemTesouro = R.drawable.bau_vazio
        var mensagemTesouro = "Desculpe, continue procurando!"

        when (palavraChave) {
            "ouro" -> {
                imagemTesouro = R.drawable.ouro
                mensagemTesouro = "Parabéns, você encontrou o ouro!"
            }
            "prata" -> {
                imagemTesouro = R.drawable.prata
                mensagemTesouro = "Parabéns, você encontrou a prata!"
            }
            "bronze" -> {
                imagemTesouro = R.drawable.bronze
                mensagemTesouro = "Parabéns, você encontrou o bronze!"
            }
        }

        ivTesouro.setImageResource(imagemTesouro)
        tvMensagem.text = mensagemTesouro

        val btVoltar = findViewById<Button>(R.id.btVoltar)
        btVoltar.setOnClickListener {
            finish()
        }
    }
}
