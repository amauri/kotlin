package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null // ? -> Safe call operator

    // Essa impressão não gera o erro que tem no Java
    // chamado NullPointerException
    println(a?.dec())

}