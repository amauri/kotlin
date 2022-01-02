package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)


fun main(args: Array<String>) {
    // Pegando os dois atributos de uma classe
    val (marca, modelo) = Carro("Ford", "Fusion")
    println("$marca $modelo")

    // Pegando os 2 elementos de uma lista
    val (marido, mulher) = listOf("João", "Maria")
    println("$marido e $mulher")

    // Pegando o terceiro elemento de uma lista
    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar.")
}