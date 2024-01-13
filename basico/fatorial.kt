fun main(args: Array<String>) {
    println("Calculo Fatorial de um número")
    print("Digite um número: ")

    val num = readLine()!!.toInt()

    var fatorial = 1

    for (i in 1..num) {
        fatorial *= i
    }

    println("O fatorial de $num é $fatorial")
}

