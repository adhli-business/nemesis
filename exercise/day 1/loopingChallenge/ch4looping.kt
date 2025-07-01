fun main() {
    while (true) {
        println("1. Lihat menu")
        println("2. Beli")
        println("3. Keluar")
        print("Pilih: ")

        val inputOption = readLine()?.toIntOrNull() ?: continue

        when (inputOption) {
            1 -> println("Menu: Nasi Goreng, Mie Ayam\n")
            2 -> println("Kamu membeli Nasi Goreng, Mie Ayam\n")
            3 -> {
                println("Terima kasih!")
                break
            }
            else -> println("Masukkan angka yang sesuai\n")
        }
    }
}
