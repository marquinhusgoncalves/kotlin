// Seção 9 - Mais conceitos

/**
Type      Bit
Double    64  ponto flutuante
Float     32  ponto flutuante
Long      64  inteito
Int       32  inteito
Short     16  inteito
Byte      8   inteito
 */

fun teste(n1: Int){

}

fun main() {
    /*
    val l1: Long = 100
    teste(1 * l1)
    acaba dando erro, pois são de tipos diferente
     */

    val d1: Double = Double.MAX_VALUE
    val b1: Byte = d1.toByte()

    println(d1)
    println(b1)

    val d2: Double = Double.MAX_VALUE
    val b2: Byte = 100

    println(d2)
    println("Convertando Byte para Short -> ${b2.toShort()} ")
    println("Convertando Byte para Long -> ${b2.toLong()}")
    println("Convertando Byte para Float -> ${b2.toFloat()}")
    println("Convertando Byte para Double -> ${b2.toDouble()}")

    //println("husuhsuhs".toInt()) da erro
    println("19".toInt())
    println("19".toFloat())
    println("19".toDouble())

}