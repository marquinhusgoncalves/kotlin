// Seção 08 - Controle de fluxo
// if - else

fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade!")
    } else {
        println("Não é maior de idade!")
    }
}

fun calculaBonusTres(cargo: String, salario: Float): Float {
    // Gerente Junior, Gerente Senior e Coordenador

    val bonus: Float
    if (cargo == "coordenador") {
        bonus = salario * 0.2f
    } else if (cargo == "junior") {
        bonus = salario * 0.5f
    } else if (cargo == "senior") {
        bonus = salario * 2
    } else {
        bonus = 0f
    }
    return bonus
}

fun main() {

    maiorDeIdade(10)
    maiorDeIdade(18)
    maiorDeIdade(27)

    println(calculaBonusTres("coordenador", 1000f))
    println(calculaBonusTres("junior", 1000f))
    println(calculaBonusTres("senior", 1000f))

}

/*
fun maiorDeIdade(idade: Int){
    if(idade >= 18){
        println("Maior de idade!")
    } else {
        println("Não é maior de idade!")
    }
}

fun maiorDeIdade(idade: Int): Boolean{
    return idade >= 18
}

fun calculaBonusTres(cargo: String, salario: Float): Float{
    // Gerente Junior, Gerente Senior e Coordenador
    if(cargo == "coordenador"){
        return salario * 0.2f
    } else {
        if (cargo.contains("gerente")){
            if(cargo == "senior"){
                return salario * 2
            } else {
                salario * 0.5f
            }
        }
    }
    return 0f
}

fun calculaBonusTres(cargo: String, salario: Float): Float{
    // Gerente Junior, Gerente Senior e Coordenador

    var bonus: Float = salario
    if(cargo == "coordenador"){
        bonus = salario * 0.2f
    } else if(cargo == "junior") {
        bonus = salario * 0.5f
    } else {
        bonus = salario * 2
    }
    return bonus
}
* */