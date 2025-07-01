fun main() {
    print("Masukkan nama anda: ")
    val inpNama = readLine()

    print("Masukkan umur anda: ")  
    val inpUmur = readLine()?.toIntOrNull() ?: 0

    print("Masukkan kota anda: ")
    val inpKota = readLine() ?: ""

    println("\n===============")
    println("Nama: $inpNama")
    println("Umur: $inpUmur tahun")
    println("Kota: $inpKota")
}