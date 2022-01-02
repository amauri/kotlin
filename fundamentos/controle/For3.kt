package fundamentos.controle

fun main(args: Array<String>) {
    // De 0 a 100 em passos de 5
    for (i in 0..100 step 5) {
        println(i)
    }

    // De 100 decrescendo para 0 em passos de 5
    for (i in 100 downTo 0 step 5) {
        println(i)
    }
}