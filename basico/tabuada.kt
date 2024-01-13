fun main() {
    print("Tabuada. Digite um número: ")
    val num = readLine()!!.toInt()

    println("TABUADA DO $num")

    for (i in 0..10){
        val resultado = num * i
        println("$num * $i = $resultado")
    }
}