package funcoes

fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for (n in ordenar(38, 3 , 456, 51, 1 ,88, 73))
        println("$n ")
}