fun main() {
print("Digite o primeiro número: ")
    val numero1 = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val numero2 = readLine()!!.toDouble()

    val soma = numero1 + numero2
    val subtracao = numero1 - numero2
    val multiplicacao = numero1 * numero2
    val divisao = numero1 / numero2

    println("Soma: $soma")
    println("Subtração: $subtracao")
    println("Multiplicação: $multiplicacao")
    if (numero2 == 0.0){
        println ("não pode ser dividido por 0")
    }else
    println("Divisão: $divisao")
}