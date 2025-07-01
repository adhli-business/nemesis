fun main() {
    val arrScore = mutableListOf<Int>()

    for (i in 1..5) {
        print("Masukkan nilai ke-$i: ")
        val score = readLine()?.toIntOrNull()

        if (score != null) {
            arrScore.add(score)
        } else {
            println("Input tidak valid. Masukkan angka.")
            continue
        }
    }

    val total = arrScore.sum()
    val average = total.toDouble() / arrScore.size

    println("Total: $total")
    println("Rata-rata: $average")
}
