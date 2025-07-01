fun main() {
    println("1. Nasi Goreng \n2. Mie Ayam \n3. Ayam Geprek")
    print("Pilihan: ")
    val option = readLine()?.toInt() ?: 0

    val res = when(option){
        1 -> "Nasi Goreng"
        2 -> "Mie Ayam"
        3 -> "Ayam Geprek"
        else -> "Pilihan tidak tersedia"
    }

    println("Kamu memilih: $res")
}
