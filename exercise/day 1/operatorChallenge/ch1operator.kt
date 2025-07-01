fun main() {
    print("Masukkan Angka pertama: ")
    val angkaSatu = readLine()?.toDouble() ?: 0.0

    print("Operator: ")
    val operator = readLine()

    print("Masukkan Angka kedua: ")
    val angkaDua = readLine()?.toDouble() ?: 0.0

    val hasil =
            when (operator) {
                "+" -> angkaSatu + angkaDua
                "-" -> angkaSatu - angkaDua
                "*" -> angkaSatu * angkaDua
                "/" -> if (angkaDua != 0.0) angkaSatu / angkaDua else "Tidak bisa dibagi nol"
                else -> "Operator tidak dikenali"
            }

    println("Hasil: $hasil")
}
