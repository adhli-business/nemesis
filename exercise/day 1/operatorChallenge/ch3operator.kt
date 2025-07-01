fun main() {
    print("Total belanja: ")
    val totalShop = readLine()?.toDouble() ?: 0.0

    var discNom: Double
    if (totalShop > 100000) {
        discNom = 0.1
    } else {
        discNom = 0.0
    }

    val disc = discNom * totalShop
    val payment = totalShop - disc

    val discInt = disc.toInt()
    val paymentInt = payment.toInt()

    println("Diskon: $discInt")
    println("Total bayar: $paymentInt")
}
