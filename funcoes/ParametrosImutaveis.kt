package funcoes

// Não é permitido reatribuir parametros.
// gera o erro:
// Kotlin: Val cannot be reassigned
fun incremento(num: Int) {
//    num++ // num = num + 1
}

fun main(args: Array<String>) {
    incremento(3)
}