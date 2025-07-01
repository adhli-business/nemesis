fun main (){
    print("Masukkan tahun lahir anda: ")
    val inpThLahir = readLine()?.toInt()?:0
    print("Masukkan tahun saat ini: ")
    val inpThNow = readLine()?.toInt()?:0


    val usia = inpThNow - inpThLahir

    println("\n===============")
    println("Tahun lahir: $inpThLahir")
    println("Tahun sekarang: $inpThNow")
    println("Usia Anda: $usia tahun")
}