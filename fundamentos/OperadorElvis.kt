package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null

    // Usando o Elvis operator, se atribui um valor padrão
    // Caso a variável opcional seja nula, esse valor padrão
    // é utilizado.
    val obrigatorio: String = opcional ?: "valor padrão"

    println(obrigatorio)
}