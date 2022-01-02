package fundamentos.controle

fun main(args: Array<String>) {
    val num1: Int = 3
    val num2: Int = 7

    // if como expressão
    /*
    val maiorValor = if (num1 > num2) {
        println("processando if...")
        num1
    } else {
        println("processando else...")
        num2
    }
    */

    // Expressão resumida
    val maiorValor = if (num1 > num2) num1 else num2

    print("O maior valor é $maiorValor.")
}