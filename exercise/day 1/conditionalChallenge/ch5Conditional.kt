fun main() {
    print("Umur: ")
    val age = readLine()?.toIntOrNull() ?: 0

    print("Member VIP: ")
    val membership = readLine()?.toBoolean() ?: false

    val isAllowed = if(membership && age > 18) "Diperbolehkan masuk" else "Tidak diperbolehkan masuk"
    print("Status: $isAllowed")
    
}