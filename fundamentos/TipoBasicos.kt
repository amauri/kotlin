package fundamentos

fun main(args: Array<String>) {
    // Tipo numéricos inteiros
    val num1: Byte = 127 // Byte -> de -128 até 127
    val num2: Short = 32767 // Short -> de -32768 até 32767
    val num3: Int = 2147483647 // Int -> de -2147483648 até 2147483647
    // val num3: Int = 2_147_483_647 -> Também poderia ser escrito dessa forma, com underline.
    val num4: Long = Long.MIN_VALUE // Long -> de -9223372036854775808 até 9223372036854775807
    // val num4: Long = Long.MIN_VALUE -> constant que tem o valor minimo dos tipos.
    // val num4: Long = Long.MAX_VALUE -> constant que tem o valor maximo dos tipos.

    // Tipo numérios reais
    val num5: Float = 3.14F // Obrigatório colocar o F no fim
    val num6: Double = 3.14

    // Tipo caractere
    val char: Char = '?' // outros exemplos... '1', 'g', ' '

    // Tipo booleano
    val boolean: Boolean = true // ou false. Não pode usar 0 ou 1, gera um erro.

    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(21334534566 is Long)
    println(2.0 is Double)

}