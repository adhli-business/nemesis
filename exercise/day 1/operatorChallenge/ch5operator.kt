fun main() {
    print("Umur: ")
    val age = readLine()?.toInt() ?: 0

    print("Member: ")
    val member = readLine()?.toBoolean() ?: false

    val status = if (member && age > 21) "Boleh masuk" else "Tidak Boleh"
    
    print("Status: $status")
}
