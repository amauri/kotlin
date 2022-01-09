package classes

class Calculadora {
    private var resultado: Int = 0

    // Retorna a propria calculadora. Favorecendo a execução
    // encadeada das funções que retornam calculadora
    // dentro da classe.
    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun print(): Calculadora {
        println(resultado)
        return this
    }

    fun obterResultado(): Int {
        return resultado
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
    // execução das funções encadeadas
    calculadora.somar(1, 2, 3).multiplicar(3).print()
    calculadora.somar(7, 10).print().limpar()
    // essa função não pode ser encadeada, porque retorna um inteiro
    calculadora.obterResultado()
}