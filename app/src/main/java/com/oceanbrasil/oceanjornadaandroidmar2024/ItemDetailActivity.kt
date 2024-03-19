package com.oceanbrasil.oceanjornadaandroidmar2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ItemDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_detail)

        val id = intent.getIntExtra("ID", 0)

        if (id > 0) {
            Toast.makeText(this, "Carregar API para o ID $id", Toast.LENGTH_LONG).show()

            // TODO: Desafio!
            //   Implementar a chamada para API para o endpoint /itens/:id, usando o ID recebido
            //   Ao receber os dados, atualizar o TextView, ImageView e as 3 Chips com os valores
            //   recebidos da API.
        }
    }
}
