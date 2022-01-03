package funcoes

fun relacaoDeTrabalho(chefe: String, funcionário: String): String {
    return "$funcionário é subordinado(a) à $chefe."
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("João", "Maria"))

    // com parâmetros nomeados, é possível inverter a ordem na chamada.
    println(relacaoDeTrabalho(funcionário = "João", chefe = "Maria"))
}