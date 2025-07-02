fun main() {
    println("===MENU NILAI SISWA===\n1. Tambahn Nilai Siswa\n2. Lihat Semua Data\n3. Cari Nilai Tertinggi\n4. Siswa yang Lulus\n5. Keluar\n")
    print("Pilih menu: ")
    var inputMenu = readLine()?.toIntOrNull() ?: return println("Silahkan pilih menu yang sesuai")
}
