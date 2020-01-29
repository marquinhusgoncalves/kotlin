// Seção 9 - Mais conceitos

fun main() {

    try{
        println("husuhsuhs".toInt())
    } catch (e: NumberFormatException){
        println("Esse valor não é um número")
    } catch (e: Exception){
        //forma generica de tratar o erro.
        println("Algo de errado ocorreu!")
    } finally {

        println("teste01 finally")
        println("teste02 finally")

        /**
        EX. se por algum motivo o sistema travar com o banco de dados aberto
        será aqui no finalley que pode ser adicionando o código para fechar o banco
        caso tenha ocorrido uma exceção.
         */
    }

}

/*
   OBS. a exceção depende da posição EX o trecho abaixo priorisa o mais generico
    try{
       println("husuhsuhs".toInt())
   } catch (e: Exception){
       println("Esse valor não é um número")
   } catch (e: NumberFormatException){
       //forma generica de tratar o erro.
       println("Algo de errado ocorreu!")
   }
   * */