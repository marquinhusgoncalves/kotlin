fun numberCharacters (stg: String) : Int = stg.length

fun showNumberCharacters (stg: String) = println("A String $stg possui ${stg.length} caracteres.")

fun main () {
    println(numberCharacters("Marquinhus"))
    showNumberCharacters("Marquinhus")
}