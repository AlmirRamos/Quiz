package com.example.quiz

class DadosPerguntas() {
    companion object {
        fun retornarPerguntas(): List<Perguntas> {

            val pergunta1 = Perguntas(
                "Eu cometo erros enquanto estou trabalhando em tarefas importantes.",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            val pergunta2 = Perguntas(
                "Não consigo me concentrar por tempo suficiente, não importa o quão importante a tarefa possa ser",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            val pergunta3 = Perguntas(
                "Ao conversar com outras pessoas, acho difícil seguir linha de uma conversa, mesmo que as pessoas estejam falando diretamente comigo",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            val pergunta4 = Perguntas(
                "Eu posso estar trabalhando em uma tarefa importante quando coisas menores me fazem perder minha concentração.",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            val pergunta5 = Perguntas(
                "Sou uma pessoa metódica e bem organizada.",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            val pergunta6 = Perguntas(
                "Eu esqueço ou perco as coisas como (meu telefone, carteira, chaves, óculos etc.)",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            val pergunta7 = Perguntas(
                "Eu não gosto de trabalho que requer que eu me concentre por um tempo.",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            val pergunta8 = Perguntas(
                "Meu foco freqüentemente vai e volta de uma tarefa para outra",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            val pergunta9 = Perguntas(
                "Eu acho difícil ficar parado",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            val pergunta10 = Perguntas(
                "Não posso deixar de me sentar em reuniões ou outras situações em que preciso permanecer sentado.",
                "Nunca",
                "Raramente",
                "As vezes",
                "Frequentemente",
                "Muitas vezes",
                1
            )

            return listOf(
                pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, pergunta6, pergunta7, pergunta8, pergunta9, pergunta10
            )

        }
    }
}
