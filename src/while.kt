// Seção 08 - Controle de fluxo

fun main() {
    // while
    /*
    while (true){
        println("Adelmo")
    }
    Exemplo se loop infinito, pois o teste sempre é true
     */


    var index: Int = 0
    while (index <= 30){
        print("$index ")
        index++

        if(index == 15){
            break
        }

    }
}