fun main() {
    print("Digite uma palavra: ")
    val palavra = readLine()!!.toLowerCase()

    if (palavra == palavra.reversed()){
        println("É palindromo") 
    } else {
        println ("Não é palindromo")
    }
}