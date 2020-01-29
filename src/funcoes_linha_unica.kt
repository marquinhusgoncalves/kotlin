// Seção 07 - Conceitos Iniciais

// Assinatura de uma função consiste nome da função, tipo e quantidade de parametros e retorno

fun calculaBonusDois(a: Int, b: Int, c: Int) {

    //println("O bônus é: ${a + b * c}")
    println("O bônus é: ${a + b * c * 2}")
}

//fun hello(nome: String): String{
//  return "Olá, $nome"
//}

// Função de uma única linha
fun helloDois(nome: String): String = "Olá, $nome"

fun soma(a: Int, b: Int): Int = a + b

fun main() {

    val a = 10
    val b = 20
    val c = 30

    val d = 1;
    val e = 2;
    val f = 6;

    calculaBonusDois(a, b, c)
    calculaBonusDois(d, e, f)
    //println("O bônus é: ${a + b * c}")

    println(helloDois("Adelmo Menezes"))
    println(soma(a, b))
    println(soma(2, 2))

}