package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import com.example.quiz.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityResultadoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val bundle = intent.extras

        if (bundle != null) {

            val respostasCorretasTotal = bundle.getInt("totalRespostasCorretas")
            val totalPerguntas = bundle.getInt("totalPerguntas")

            binding.textResultadoFinal.text =
                "Você acertou $respostasCorretasTotal de $totalPerguntas"
        }

        binding.btnEncerrar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}