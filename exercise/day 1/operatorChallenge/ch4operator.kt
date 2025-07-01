fun main() {
    print("Angka A: ")
    val inpA = readLine()?.toInt() ?: 0
    print("Angka B: ")
    val inpB = readLine()?.toInt() ?: 0

    var hasil: Int
    if (inpA > inpB) {
        hasil = inpA
    } else {
        hasil = inpB
    }

    println("Angka lebih besar: $hasil")
}
