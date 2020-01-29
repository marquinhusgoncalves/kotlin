// Seção 08 - Controle de fluxo

//when

fun operacaoUm(a: Int, b: Int, c: String): Int{
/*
    when(c){
        "soma" -> {
            return a + b
        }
        "subtracao" -> {
            return a - b
        }
        else -> {
            println("Operação incorreta")
            return 0
        }
    }
*/
    return when(c){
        "soma" -> a + b
        "subtracao" -> a - b
        else -> {
            println("Operação incorreta")
            0
        }
    }

}

fun main() {

    println(operacaoUm(10, 10, "soma"))
    println(operacaoUm(10, 9, "subtracao"))

    operacaoUm(10, 10, "somaa")

}