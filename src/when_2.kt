// Seção 08 - Controle de fluxo

fun operacaoDois(a: Int, b: Int, c: String){

    when{
        a > 0 && b > 0 -> {
            println("Variáveis maiores que zero")
        }
    }

    when(a){
        //Range - Intervalo de valores 1..10
        in 1..99 -> {
            println("século")
        }
    }

}

fun main() {

    println(operacaoDois(10, 10, "soma"))
    println(operacaoDois(10, 10, "subtracao"))

}