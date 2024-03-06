package com.oceanbrasil.oceanjornadaandroidmar2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        val etNome = findViewById<EditText>(R.id.etNome)

        // Criamos um listener para o botão encontrado
        btEnviar.setOnClickListener {
            // O código dentro das chaves { } será executado ao clicar no botão

            // Checamos se o EditText não está vazio
            // Caso não esteja, entramos no if
            if (etNome.text.isNotBlank()) {
                // Atualiza o conteúdo do TextView
                tvResultado.text = etNome.text
            } else { // Caso contrário, exibimos o erro
                etNome.error = getString(R.string.insert_a_valid_name)
            }
        }

        // Comportamento do botão de Abrir Nova Tela
        // Localizamos o botão na tela, usando o ID
        val btAbrirNovaTela = findViewById<Button>(R.id.btAbrirNovaTela)

        // Criamos um listener para esse botão
        btAbrirNovaTela.setOnClickListener {
            // Criamos a Intent para ir dessa tela à ResultadoActivity
            val novaTelaIntent = Intent(this, ResultadoActivity::class.java)

            // Adicionamos o nome digitado como informação extra na Intent
            novaTelaIntent.putExtra("NOME_DIGITADO", etNome.text.toString())

            // Para que o Android abra a tela, precisamos registrá-la
            startActivity(novaTelaIntent)
        }
    }
}
