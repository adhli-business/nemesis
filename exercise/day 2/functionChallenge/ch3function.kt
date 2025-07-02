fun konversiSuhu(celcius: Double): Double {
    return (celcius * 9 / 5) + 32
}

fun main() {
    val converted = String.format("%.2f", konversiSuhu(20.0))
    println("Suhu dalam Fahrenheit: $converted")
}
