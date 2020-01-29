// Seção 07 - Conceitos Iniciais

/**
Type      Bit
Double    64  ponto flutuante
Float     32  ponto flutuante
Long      64  inteito
Int       32  inteito
Short     16  inteito
Byte      8   inteito
Boolean   ?
String    ?
Char      ?
 */

/** Lembrando sobre unidades de medida
1 Byte = 8 bits
1 Kilobyte (kb) = 1024 bytes
1 Megabyte (mb) = 1024 kilobyte
1 Gigabyte (gb) = 1024 megabyte
 */

fun main() {

    var nome = "Adelmo Menezes"
    //var !idade = 13 não pode iniciar com caracteres especiais
    var idade = 13 // declaração implicita
    var idadeDois: Byte = 13 // declaração explicita
    var idadeTres: Float = 13.7f
    var character: Char = 'h'

    println("Double: Max: " + Double.MAX_VALUE + " e Min: " + Double.MIN_VALUE)
    println("Float: Max: " + Float.MAX_VALUE + " e Min: " + Float.MIN_VALUE)
    println("Long: Max: " + Long.MAX_VALUE + " e Min: " + Long.MIN_VALUE)
    println("Int: Max: " + Int.MAX_VALUE + " e Min: " + Int.MIN_VALUE)
    println("Short: Max: " + Short.MAX_VALUE + " e Min: " + Short.MIN_VALUE)
    println("Byte: Max: " + Byte.MAX_VALUE + " e Min: " + Byte.MIN_VALUE)

}