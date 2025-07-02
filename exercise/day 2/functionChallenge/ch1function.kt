fun luasPersegi(sisi: Int): Int {
    return sisi*sisi
}

fun main() {
    print("Input sisi: ")
    val inputSisi = readLine()?.toIntOrNull() ?: 0
    println("Luas persegi: ${luasPersegi(inputSisi)}")
}