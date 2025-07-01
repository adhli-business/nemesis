fun main() {
    print("Masukkan nama anda: ")
    val inpNama = readLine()
    print("Apakah anda mahasiswa aktif? (true/false): ")
    val inpStatus = readLine()?.toBoolean() ?: false

    println("\n===============")
    println("Nama: $inpNama")
    println("Mahasiswa Aktif: $inpStatus")
}
