fun main() {
    print("Input: ")
    val teks = readLine() ?: ""
    
    print("Jumlah: ")
    val jumlah = readLine()?.toIntOrNull() ?: return println("Input jumlah tidak valid.")

    println("Output:")
    for (i in 1..jumlah) {
        println(teks)
    }
}