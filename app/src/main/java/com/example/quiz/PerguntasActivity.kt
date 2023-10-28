package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz.databinding.ActivityPerguntasBinding

class PerguntasActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityPerguntasBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        recuperarIntentExtras()

    }

    private fun recuperarIntentExtras() {
        val bundle = intent.extras
        val nome = bundle?.getString("nome")
        binding.textBemVindo.text = "Olá $nome"
    }
}