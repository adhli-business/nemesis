fun main() {
    print("Masukkan angka pertama: ")
    val inputA = readLine()?.toIntOrNull() ?: return println("Tolong masukkan angka!")

    print("Masukkan angka kedua: ")
    val inputB = readLine()?.toIntOrNull() ?: return println("Tolong masukkan angka!")

    print("Pilih operasi: ")
    val inputOperasi = readln()

    when(inputOperasi) {
        "+" -> println("Hasil: ${tambah(inputA, inputB)}")
        "-" -> println("Hasil: ${kurang(inputA, inputB)}")
        "*" -> println("Hasil: ${kali(inputA, inputB)}")
        "/" -> println("Hasil: ${bagi(inputA, inputB)}")
        else -> return println("Tidak ada operasi yang sesuai")
    }
}

fun tambah(a: Int, b: Int): Int {
    return a + b
}

fun kurang(a: Int, b: Int): Int {
    return a - b
}

fun kali(a: Int, b: Int): Int {
    return a * b
}

fun bagi(a: Int, b: Int): Int {
    return a / b
}
