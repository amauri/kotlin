package classes

class Geladeira(val marca: String, val litros: Int)

data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)
    println(g1 == g2) // false, como se fosse ===

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)
    println(tv1 == tv2) // true porque o equals foi implementado pelo data class
    println(tv1 === tv2) // false
    println(tv1.toString()) // data class implementa o toString de forma básica
    println(tv1.copy())
    println(tv1.copy(polegadas = 42)) // cria um copia dos dados e altera a variavel

    // Destructuring em data class
    val (marca, pol) = tv1
    println("$marca $pol")
}