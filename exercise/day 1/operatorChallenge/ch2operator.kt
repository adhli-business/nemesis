fun main() {
    print("Nomor kursi: ")
    val inpAngka = readLine()?.toIntOrNull() ?: return println("Inputan anda tidak valid")

    val hasil = if (inpAngka % 2 == 0) "Genap" else "Ganjil"
    println("Status: $hasil")
}