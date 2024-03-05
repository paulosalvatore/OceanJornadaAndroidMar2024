package com.oceanbrasil.oceanjornadaandroidmar2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1 - Detectar o clique no botão
        //      Primeiro, encontramos o botão pelo ID
        //      Depois, criamos um listener para ele
        // 2 - Alterar o conteúdo o TextView
        //      Busca o elemento pelo ID
        //      Altera o conteúdo da propriedade text

        // findViewById<TipoDaInformacao>(ReferenciaAoID)
        // Ex: findViewById<Button>(R.id.btEnviar)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        // Criamos um listener para o botão encontrado
        btEnviar.setOnClickListener {
            // O código dentro das chaves { } será executado ao clicar no botão

            // Atualiza o conteúdo do TextView
            tvResultado.text = "Samsung Ocean!!"
        }
    }
}
