package funcoes

// Filtrar recebe uma lista genérica e uma função como parâmetro
fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()
    for (e in lista) {
        if (filtro(e)) {
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean {
    return nome.length == 3
}

fun main(args: Array<String>) {
    val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca")
    // Passando a lista nomes e a função comTresLetras como parâmetro
    // para a função filtrar.
    println(filtrar(nomes, ::comTresLetras))

}