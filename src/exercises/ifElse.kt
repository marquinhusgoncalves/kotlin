fun highestValue(a: Int, b: Int) {
    return if (a == b) {
        println("Valores iguais")
    } else if (a > b) {
        println(a)
    } else println(b)
}

fun coast(qtd: Int) {
    return if (qtd < 10) {
        println(qtd * 3)
    } else println(qtd * 2)
}

fun categoryFighters(ctg: String) {
    when (ctg) {
        "Pena" -> println("menos de 57 kg")
        "Leve" -> println("mais de 57 kg e menos de 61 kg")
        "Médio" -> println("mais de 61 kg e menos de 73 kg")
        "Pesado" -> println("igual ao acima de 73 kg")
    }
 }

fun main() {
    highestValue(13, 13)
    highestValue(1, 10)
    highestValue(99, 5)
    coast(9)
    coast(11)
    categoryFighters("Pena")
    categoryFighters("Leve")
    categoryFighters("Médio")
    categoryFighters("Pesado")
}