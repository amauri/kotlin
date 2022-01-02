package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 8.3

    // Usando o operador range
    if (nota in 9.0..10.0) {
        print("Fantástico!!")
    } else if (nota in 7.0..8.99) {
        println("Parabéns!!")
    } else if (nota in 4.0..6.99) {
        println("Tem como recuperar!!")
    } else if (nota in 0.0..3.99) {
        println("Te vejo no próximo semestre!!")
    } else {
        println("Nota inválida!!")
    }

    // Operador range
    println(5 in 7..4) // false, range deve ser sempre do menor para o maior, como abaixo.
    println(5 in 4..7) // true
}