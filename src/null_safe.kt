// Seção 9 - Mais conceitos

fun main() {

    val str: String? = null
    val num: Float? = null

    println(str)
    println(str?.length)
    println(str!!.length)// a exclamação estou assumindo o que esta ocorrendo

    // TesteDois().meuNome() // da erro, pois não existe o tratamento direto
    /*
    if(str != null){
        println(str.length)
    }else{
        println("teste")
    }
    exemplo para testar a validação sem a necessidade de utilizar o ponto de ?
    */
}