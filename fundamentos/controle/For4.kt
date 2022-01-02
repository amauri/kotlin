package fundamentos.controle

fun main(args: Array<String>) {
    val alunos = arrayListOf("Joe", "Bob", "Zé")
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} -> $aluno")
    }
}