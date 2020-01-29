fun oddNumbers() {
    for (i in 100..200 step 2) println(i)
}

fun invertedString(stg: String) {
    println(stg.reversed())
}

fun listNumbers(start: Int, end: Int, ordem: String) {
    return if (ordem == "Crescente") {
        for (i in start..end) println(i)
    } else {
        for (i in end downTo start) println(i)
    }
}

fun pyramid() {
    for (i in 0..3) {
        for (j in 0..i) {
            print("#")
        }
        println("")
    }
}

fun main() {
    oddNumbers()
    invertedString("Teste")
    listNumbers(1, 100, "Crescente")
    listNumbers(1, 100, "Decrescente")
    pyramid()
}
