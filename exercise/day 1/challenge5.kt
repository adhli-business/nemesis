fun main(){
    print("Masukkan nilai ujian anda (0-100): ")
    val inpNilai = readLine()?.toInt()?:0
    val nilai = inpNilai / 25.0

    val hasil = String.format("Nilai: %d -> skala 4.0 = %.2f", inpNilai, nilai)

    println(hasil)
}