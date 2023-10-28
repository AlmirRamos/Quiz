package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        configClicks()
    }

    private fun configClicks() {
        binding.btnConcluir.setOnClickListener {
            validarCampos()
        }
    }

    private fun validarCampos() {
        val nome = binding.editNome.text.toString()
        if (nome.isNotEmpty()){

            val intent = Intent(this, PerguntasActivity::class.java)
            intent.putExtra("nome", nome)
            startActivity(intent)

        }else{
            binding.editNome.requestFocus()
            binding.editNome.error = "Adicione seu nome para prosseguir"
        }
    }
}