package fundamentos.operadores

fun main(args: Array<String>) {
    var a: Int = 7
    var b: Int = 3

    // Operadores binários de atribuição

    b += a // atribuição aditiva -> b = b + a
    b += 4 // atribuição subtrativa -> b = b - 4
    b *= 2 // atribuição multiplicativa -> b = b * 2
    b /= 2 // atribuição divisiva -> b = b / 2
    b %= 2 // atribuição de módulo

    println(b)
}