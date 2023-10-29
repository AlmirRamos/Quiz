package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz.databinding.ActivityPerguntasBinding

class PerguntasActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityPerguntasBinding.inflate(layoutInflater)
    }
    private lateinit var listaPerguntas: List<Perguntas>
    private lateinit var perguntaAtual: Perguntas
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        recuperarIntentExtras()

    }

    private fun recuperarIntentExtras() {
        val bundle = intent.extras
        val nome = bundle?.getString("nome")

        if (nome != null) binding.textBemVindo.text = "Olá $nome"

    }
}