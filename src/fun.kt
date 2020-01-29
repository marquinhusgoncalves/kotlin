// Seção 07 - Conceitos Iniciais

// quando não declaramos o tipo de retorno de uma função o kotlin trata como :Unit
fun calculaBonus(a: Int, b: Int, c: Int){

    //println("O bônus é: ${a + b * c}")
    println("O bônus é: ${a + b * c * 2}")
}

fun hello(nome: String): String{
    return "Olá, $nome"
}

fun main() {

    val a = 10
    val b = 20
    val c = 30

    val d = 1; val e = 2; val f = 6;

    calculaBonus(a, b, c)
    calculaBonus(d, e, f)
    //println("O bônus é: ${a + b * c}")

    println(hello("Adelmo Menezes"))

}