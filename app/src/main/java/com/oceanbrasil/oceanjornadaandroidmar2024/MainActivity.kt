package com.oceanbrasil.oceanjornadaandroidmar2024

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etPalavraChave = findViewById<EditText>(R.id.etPalavraChave)
        val btProcurarTesouro = findViewById<Button>(R.id.btProcurarTesouro)

        btProcurarTesouro.setOnClickListener {
            val palavraChave = etPalavraChave.text.toString()

            if (palavraChave.isBlank()) {
                etPalavraChave.error = "Digite algo."
            } else {
                val treasureActivityIntent = Intent(this, TreasureActivity::class.java)

                treasureActivityIntent.putExtra("PALAVRA_CHAVE", palavraChave)

                startActivity(treasureActivityIntent)
            }
        }
    }
}
