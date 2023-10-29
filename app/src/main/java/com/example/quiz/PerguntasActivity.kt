package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quiz.databinding.ActivityPerguntasBinding

class PerguntasActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityPerguntasBinding.inflate(layoutInflater)
    }

    private lateinit var listaPerguntas: List<Perguntas>
    private lateinit var perguntaAtual: Perguntas

    private var indicePerguntaAtual = 0
    private var totalPerguntas = 0
    private var totalRespostasCorretas = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        recuperarIntentExtras()
        listaPerguntas = DadosPerguntas.retornarPerguntas()
        exibirDadosPerguntaAtual()

        binding.btnConfirmar.setOnClickListener {

            if (validarResposta()) {

                exibirResultadoResposta()
                indicePerguntaAtual++

                if (indicePerguntaAtual < totalPerguntas) {
                    exibirDadosPerguntaAtual()
                } else {
                    val intent = Intent(this, ResultadoActivity::class.java)

                    intent.putExtra("totalRespostasCorretas", totalRespostasCorretas)
                    intent.putExtra("totalPerguntas", totalPerguntas)
                    startActivity(intent)
                    Toast.makeText(this, "Resultado", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Responda para prosseguir", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun exibirResultadoResposta() {

        val respostaCorreta = perguntaAtual.respostaCerta

        var respostaSelecionada = when{
            binding.radioResposta1.isChecked -> 1
            binding.radioResposta2.isChecked -> 2
            binding.radioResposta3.isChecked -> 3
            binding.radioResposta4.isChecked -> 4
            binding.radioResposta5.isChecked -> 5
            else -> 0
        }

        if (respostaSelecionada == respostaCorreta){
            Toast.makeText(this, "Você acertou, a resposta correta é: $respostaCorreta", Toast.LENGTH_SHORT).show()
            totalRespostasCorretas++
        }else{
            Toast.makeText(this, "Você errou a resposta certa era: $respostaCorreta", Toast.LENGTH_SHORT).show()
        }

    }

    private fun validarResposta(): Boolean {
        if (binding.radioResposta1.isChecked ||
            binding.radioResposta2.isChecked ||
            binding.radioResposta3.isChecked ||
            binding.radioResposta4.isChecked ||
            binding.radioResposta5.isChecked
        ) {
            return true
        }
        return false
    }

    private fun exibirDadosPerguntaAtual() {
        perguntaAtual = listaPerguntas[indicePerguntaAtual]

        //exibir os dados
        totalPerguntas = listaPerguntas.size
        val textoResumo = "${indicePerguntaAtual + 1} pergunta de $totalPerguntas "

        binding.textExibicaoResumo.text = textoResumo

        binding.textTitulo.text = perguntaAtual.titulo
        binding.radioResposta1.text = perguntaAtual.resposta1
        binding.radioResposta2.text = perguntaAtual.resposta2
        binding.radioResposta3.text = perguntaAtual.resposta3
        binding.radioResposta4.text = perguntaAtual.resposta4
        binding.radioResposta5.text = perguntaAtual.resposta5

        //Limpara todos RadioButton selecionados
        binding.rgRespostas.clearCheck()

    }

    private fun recuperarIntentExtras() {
        val bundle = intent.extras
        val nome = bundle?.getString("nome")

        if (nome != null) binding.textBemVindo.text = "Olá $nome"

    }
}