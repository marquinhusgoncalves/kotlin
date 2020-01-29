// Seção 08 - Controle de fluxo

fun main() {

    // String str = valor == 10 ? "Sim" : "Não"; Operador ternário em Java
    val valor = 10
    val str = if(valor == 10) "Sim" else "Não"

    // Operador Elvis -> ?:
    // o operador indicado para informar que a váriavel pode ser nula é adicionar ? ao lado do tipo da várivael
    val teste: Int? = null
    val op: Int = teste ?: 100 //Se a variavel for nula use 100, caso contrario use o valor de teste
    println(op)

}