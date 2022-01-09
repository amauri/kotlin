package classes

class Pessoa1(var nome: String)
class Pessoa2(val nome: String)
class Pessoa3(momeInicial: String) {
    val nome: String = momeInicial
}

fun main(args: Array<String>) {
    val p1 = Pessoa1(nome = "João")
    p1.nome = "Guilherme"
    println("${p1.nome} sabe programar")

    val p2 = Pessoa2("Maria")
    // p2.nome = "Guilherme" // Não pode atribuir por ser uma constante
    val p3 = Pessoa3(momeInicial = "Pedro")
    println("${p2.nome} e ${p3.nome} são legais!")
}

