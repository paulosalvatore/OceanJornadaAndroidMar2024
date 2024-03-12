package com.oceanbrasil.oceanjornadaandroidmar2024

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TreasureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treasure)

        val palavraChave = intent.getStringExtra("PALAVRA_CHAVE")

        val tvMensagem = findViewById<TextView>(R.id.tvMensagem)

        if (palavraChave == "ouro") {
            tvMensagem.text = "Parabéns, você encontrou o tesouro!"
        } else {
            tvMensagem.text = "Desculpe, continue procurando!"
        }
    }
}
