package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>) {
    // println está no pacote kotlin.io e nao precisa ser importado explicitamente
    kotlin.io.println(funcaoSimples("OK"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)
    val blahhh = "bla"
    println(blahhh)
    // Chamando funções usando template strings
    println("${soma(2, 3)} ${subtracao(4, 6)}")
}