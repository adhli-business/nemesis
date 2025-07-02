fun main() {
    val dataNilai: MutableMap<String, MutableList<Int>> = mutableMapOf()

    while (true) {
        println("\n=== MENU NILAI SISWA ===")
        println("1. Tambah Nilai Siswa")
        println("2. Lihat Semua Data")
        println("3. Cari Nilai Tertinggi")
        println("4. Siswa yang Lulus")
        println("5. Keluar")

        print("\nPilih menu: ")
        when (readLine()?.toIntOrNull()) {
            1 -> tambahNilaiSiswa(dataNilai)
            2 -> lihatSemuaData(dataNilai)
            3 -> cariNilaiTertinggi(dataNilai)
            4 -> siswaYangLulus(dataNilai)
            5 -> {
                println("Terima kasih! Program selesai.")
                break
            }
            else -> println("Pilihan tidak valid! Silakan pilih menu 1-5.")
        }
    }
}

fun tambahNilaiSiswa(dataNilai: MutableMap<String, MutableList<Int>>) {
    print("Masukkan nama siswa: ")
    val namaSiswa = readLine()?.trim() ?: ""

    if (namaSiswa.isEmpty()) {
        println("Nama siswa tidak boleh kosong!")
        return
    }

    print("Masukkan nilai (pisahkan dengan koma jika lebih dari satu): ")
    val inputNilai = readLine()?.trim() ?: ""

    try {
        val nilaiList =
                inputNilai.split(",").map { it.trim().toInt() }.filter {
                    it in 0..100
                } // Validasi nilai 0-100

        if (nilaiList.isEmpty()) {
            println("Tidak ada nilai valid yang dimasukkan!")
            return
        }

        // Jika siswa sudah ada, tambahkan nilai baru
        if (dataNilai.containsKey(namaSiswa)) {
            dataNilai[namaSiswa]?.addAll(nilaiList)
        } else {
            dataNilai[namaSiswa] = nilaiList.toMutableList()
        }

        println("Data nilai berhasil ditambahkan untuk $namaSiswa!")
        println("Nilai yang ditambahkan: ${nilaiList.joinToString(", ")}")
    } catch (e: NumberFormatException) {
        println("Format nilai tidak valid! Masukkan angka yang benar.")
    }
}

fun lihatSemuaData(dataNilai: MutableMap<String, MutableList<Int>>) {
    if (dataNilai.isEmpty()) {
        println("Belum ada data siswa yang tersimpan.")
        return
    }

    println("\n=== DATA SEMUA SISWA ===")
    dataNilai.forEach { (nama, nilaiList) ->
        val rataRata = hitungRataRata(nilaiList)
        println("\nNama: $nama")
        println("Nilai: ${nilaiList.joinToString(", ")}")
        println("Rata-rata: %.2f".format(rataRata))
    }
}

fun cariNilaiTertinggi(dataNilai: MutableMap<String, MutableList<Int>>) {
    if (dataNilai.isEmpty()) {
        println("Belum ada data siswa yang tersimpan.")
        return
    }

    val siswaWithMaxGrade =
            dataNilai.mapValues { (_, nilaiList) -> nilaiList.maxOrNull() ?: 0 }.maxByOrNull {
                it.value
            }

    siswaWithMaxGrade?.let { (nama, nilaiTertinggi) ->
        println("\n=== SISWA DENGAN NILAI TERTINGGI ===")
        println("Nama: $nama")
        println("Nilai Tertinggi: $nilaiTertinggi")
    }
}

fun siswaYangLulus(dataNilai: MutableMap<String, MutableList<Int>>) {
    if (dataNilai.isEmpty()) {
        println("Belum ada data siswa yang tersimpan.")
        return
    }

    val siswaLulus = dataNilai.filter { (_, nilaiList) -> hitungRataRata(nilaiList) >= 75.0 }

    if (siswaLulus.isEmpty()) {
        println("Tidak ada siswa yang lulus (rata-rata ≥ 75).")
        return
    }

    println("\n=== SISWA YANG LULUS (Rata-rata ≥ 75) ===")
    siswaLulus.forEach { (nama, nilaiList) ->
        val rataRata = hitungRataRata(nilaiList)
        println("\nNama: $nama")
        println("Nilai: ${nilaiList.joinToString(", ")}")
        println("Rata-rata: %.2f".format(rataRata))
    }
}

fun hitungRataRata(nilai: List<Int>): Double {
    return if (nilai.isNotEmpty()) {
        nilai.sum().toDouble() / nilai.size
    } else {
        0.0
    }
}
