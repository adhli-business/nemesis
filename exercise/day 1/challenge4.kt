fun main() {
    print("Nama barang: ")
    val inpBarang = readLine()
    print("Jumlah: ")
    val inpJumlah = readLine()?.toInt()?:0
    print("Harga: ")
    val inpHarga = readLine()?.toDouble()
    val total = inpJumlah.toDouble() * (inpHarga ?: 0.0)

    println("\n===============")
    println("Barang: $inpBarang")
    println("Jumlah: $inpJumlah")
    println("Harga satuan: $inpHarga")
    println("Total: $total")
}