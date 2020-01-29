// Seção 08 - Controle de fluxo

fun main() {
    // for - loop
    // loop infinito

    val str = "Adelmo Menezes da Silva Protázio"
    for(c in str){
        print("$c ")
    }

    println("")

    for (i in 1..10){
        print("$i ")
    }

    println("")

    for (i in 1..100 step 5){
        print("$i ")
    }

    println("")

    for (i in 0..100 step 5){
        if(i != 80){
            print("$i ")
        }
    }

    println("")

    for (j in 40 downTo 0){
        print("$j ")
    }
}