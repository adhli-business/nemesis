fun main() {
    val secretNumber = 7
    var inputNumber = 0
    var totalGuess = 0

    while (inputNumber != secretNumber) {
        print("Masukkan tebakan Anda: ")
        inputNumber = readLine()?.toIntOrNull() ?: continue
        totalGuess++
    }

    println("Tebakan Anda benar! Jumlah percobaan: $totalGuess")
}
