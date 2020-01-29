// Seção 08 - Controle de fluxo
// if - else

fun calculaBonusQuatro(cargo: String, salario: Float): Float {
    // Gerente Junior, Gerente Senior e Coordenador

    return if (cargo == "coordenador") {
        salario * 0.2f
    } else if (cargo == "junior") {
        salario * 0.5f
    } else if (cargo == "senior") {
        salario * 2
    } else {
        0f
    }

}

fun main() {

    // String str = valor == 10 ? "Sim" : "Não"; Operador ternário em Java
    val valor = 10
    val str = if (valor == 10) "Sim" else "Não"

    println(calculaBonusQuatro("coordenador", 1000f))
    println(calculaBonusQuatro("junior", 1000f))
    println(calculaBonusQuatro("senior", 1000f))

}

/*
fun calculaBonusQuatro(cargo: String, salario: Float): Float {
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

fun calculaBonusQuatro(cargo: String, salario: Float): Float {
    // Gerente Junior, Gerente Senior e Coordenador

    val bonus: Float = if (cargo == "coordenador") {
        salario * 0.2f
    } else if (cargo == "junior") {
        salario * 0.5f
    } else if (cargo == "senior") {
        salario * 2
    } else {
        0f
    }
    return bonus
}

* */