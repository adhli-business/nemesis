fun main() {
    print("Umur: ")
    val age = readLine()?.toIntOrNull() ?: 0

    val category: String
    if (age >= 60) {
        category = "Lansia"
    } else if (age >= 20) {
        category = "Dewasa"
    } else if (age >= 13) {
        category = "Remaja"
    } else {
        category = "Anak-anak"
    }

    println("Kategori: $category")
}
