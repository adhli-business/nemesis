---
# 📄 **Pretest Kotlin & Basic Android Development (30 Soal)**
---

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

1. Apa tipe data untuk menyimpan teks di Kotlin?

   - a. `Char`
   - b. `Int`
   - c. `String`
   - d. `Double`

2. Kata kunci `val` digunakan untuk:

   - a. Variabel global
   - b. Variabel tetap (tidak bisa diubah)
   - c. Variabel bisa diubah
   - d. Fungsi cetak

3. Apa hasil dari `println(5 + 3 * 2)`?

   - a. 16
   - b. 11
   - c. 13
   - d. 6

4. Fungsi utama program Kotlin adalah:

   - a. `start()`
   - b. `main()`
   - c. `run()`
   - d. `launch()`

5. Di Android Studio, layout antarmuka ditulis dengan:

   - a. Kotlin
   - b. Java
   - c. XML
   - d. JSON

6. Apa hasil dari kode berikut?

   ```kotlin
   val x = "4"
   println(x + 1)
   ```

   - a. 5
   - b. 41
   - c. Error
   - d. 14

7. Fungsi `readLine()` dalam Kotlin digunakan untuk:

   - a. Menyimpan file
   - b. Menampilkan teks
   - c. Membaca input
   - d. Membuat variabel

8. Apa hasil dari perbandingan berikut: `5 > 3 && 2 < 1`?

   - a. true
   - b. false
   - c. error
   - d. null

9. Android Studio adalah tools untuk:

   - a. Menulis HTML
   - b. Menjalankan script Python
   - c. Membuat aplikasi Android
   - d. Desain presentasi

10. Untuk berpindah dari satu activity ke activity lain di Android, digunakan:
   - a. Intent
   - b. Fragment
   - c. TextView
   - d. XML

---

### ✅ **Bagian B – Jawaban Penjelasan Singkat (15 Soal)**

11. Jelaskan perbedaan `val` dan `var` di Kotlin.
12. Sebutkan dua tipe data numerik dalam Kotlin.
13. Apa kegunaan fungsi `println()`?
14. Bagaimana cara mengambil input angka dari pengguna dan mengubahnya ke tipe `Int` secara aman?
15. Sebutkan satu contoh layout yang sering digunakan dalam Android dan fungsinya.
16. Apa itu `Intent` dalam Android?
17. Bagaimana cara menampilkan teks di layar Android menggunakan Kotlin dan XML?
18. Apa arti dari null safety dalam Kotlin?
19. Apa perbedaan antara `toInt()` dan `toIntOrNull()`?
20. Sebutkan minimal satu keunggulan Kotlin dibandingkan Java dalam pengembangan Android.
21. Dalam Android Studio, di folder mana biasanya file `activity_main.xml` disimpan?
22. Bagaimana struktur dasar fungsi utama (`main`) dalam Kotlin? Tuliskan contohnya.
23. Apa yang dimaksud dengan `String interpolation` dalam Kotlin?
24. Apa arti `?.` dan `?:` dalam penulisan kode Kotlin?
25. Bagaimana Kotlin menangani error saat input dari user tidak sesuai tipe data?

---

### ✅ **Bagian C – Perbaiki Kode (5 Soal)**

26. Perbaiki dan jelaskan:

```kotlin
fun main() {
    val umur = readLine()
    println("Umur anda adalah " + umur + 5)
}
```

---

27. Perbaiki:

```kotlin
val nama: String
println("Halo $nama")
```

---

28. Perbaiki dan jalankan:

```kotlin
fun main() {
    var nama = readLine()
    var umur = readLine()?.toInt()
    println("Nama saya: $nama, umur: umur tahun")
}
```

---

29. Perbaiki kode berikut agar tidak error:

```kotlin
val angka = "20"
val hasil = angka + 5
println(hasil)
```

---

30. Debug:

```kotlin
fun main() {
  val tinggi = readLine().toDouble()
  println("Tinggi kamu adalah $tinggi")
}
```

---

### ✅ **Jawaban**

1. C. String
2. B. Variabel tetap (tidak bisa diubah)
3. B. 11
4. B. `main()`
5. C. XML
6. B. 41
7. C. Membaca input
8. B. false
9. C. Membuat aplikasi Android
10. A. Intent

11. val digunakan untuk variabel yang nilainya tidak dapat diubah (immutable), mirip dengan final di Java. Sementara itu, var digunakan untuk variabel yang nilainya dapat diubah (mutable) setelah inisialisasi. 
12. Integer dan Double. **Int** digunakan untuk menyimpan bilangan bulat, sedangkan **Double** digunakan untuk menyimpan bilangan desimal.
13. `println` digunakan untuk menampilkan teks atau data ke layar dan menambahkan karakter newline di akhir, sehingga teks berikutnya akan ditampilkan pada baris baru. 
14. Untuk mengambil input angka dari pengguna dan mengubahnya menjadi tipe Int secara aman dapat menggunakan fungsi `toIntOrNull()`. 
15. Salah satu contoh layout yang sering digunakan dalam Android adalah LinearLayout. Fungsinya adalah untuk mengatur tampilan anak-anaknya (child views) dalam satu baris (horizontal) atau satu kolom (vertical).
16. `Intent` adalah objek pesan di Android yang digunakan untuk meminta tindakan dari komponen aplikasi lain, seperti memulai aktivitas baru, memulai layanan, atau mengirim pesan broadcast.
17. Untuk menampilkan teks di layar Android menggunakan Kotlin dan XML, kita perlu membuat tampilan (View) TextView dalam file XML layout dan menetapkan teks yang ingin ditampilkan di sana, lalu mengaitkannya dengan kode Kotlin.
18. `Null safety` dalam Kotlin adalah fitur yang dirancang untuk mencegah terjadinya NullPointerException (NPE) atau kesalahan karena mencoba mengakses nilai null pada variabel yang seharusnya tidak null.
19. Perbedaan utama antara `toInt()` dan `toIntOrNull()` dalam Kotlin terletak pada penanganan nilai null dan potensi pengecualian yang mungkin terjadi. `toInt()` akan memunculkan NumberFormatException jika string tidak dapat diubah menjadi integer, sementara `toIntOrNull()` mengembalikan null jika konversi gagal. 
20. Salah satu keungulannya adalah kotlin memiliki fitur nullable types yang mengharuskan developer untuk secara eksplisit menangani kemungkinan nilai null, sehingga dapat mencegah terjadinya crash aplikasi yang disebabkan oleh NPE.
21. `activity_main.xml` biasanya ada di dalam folder res dalam layout.
22. Struktur dasar fungsi utama (`main`) dalam Kotlin:
```kotlin
fun main() {
    println("Hello, world!")
}
```
23. String interpolation dalam Kotlin adalah teknik untuk menyisipkan nilai variabel atau ekspresi langsung ke dalam sebuah string, dengan menggunakan tanda `$` sebelum variabel atau ekspresi yang ingin disisipkan. Ini membuat kode lebih ringkas dan mudah dibaca dibandingkan dengan menggabungkan string menggunakan operator `+` seperti pada bahasa lain. 
24. `Safecall Operator ?.` digunakan untuk memanggil method atau mengakses property secara aman pada objek yang mungkin null. Jika objek tersebut null, maka operasi tidak akan dijalankan dan akan mengembalikan null. Sementara, `Elvis Operator ?:` digunakan untuk memberikan nilai default ketika nilai di sebelah kiri adalah null. Jika nilai di sebelah kiri null, maka nilai di sebelah kanan yang akan digunakan.
25. Kotlin melakukan Exception Handling dengan Try-Catch. Ketika konversi tipe data gagal, Kotlin akan melempar exception yang bisa ditangani.
26. Kode tersebut memiliki beberapa masalah: 
- `readLine()` mengembalikan `String? (nullable)`, bukan Int.
- Operasi matematika pada string mencoba menambahkan angka 5 ke string
- Tidak ada penanganan untuk input null atau invalid
```kotlin
fun main() {
    print("Masukkan umur Anda: ")
    val input = readLine()
    
    try {
        val umur = input?.toInt() ?: 0
        val umurSetelah5Tahun = umur + 5
        println("Umur Anda adalah $umur")
        println("Umur Anda 5 tahun lagi adalah $umurSetelah5Tahun")
    } catch (e: NumberFormatException) {
        println("Error: Harap masukkan angka yang valid!")
    }
}
```
27. Kode tersebut memiliki masalah:

- Variabel nama dideklarasikan tetapi tidak diinisialisasi
- Kotlin tidak mengizinkan penggunaan variabel yang belum diinisialisasi
- Akan menyebabkan compile error: "Variable 'nama' must be initialized"

```kotlin
fun main() {
    val nama: String = "Adhli"
	println("Halo $nama")
}
```

28. Masalah String Interpolation
```kotlin
fun main() {
    var nama = readLine()
    var umur = readLine()?.toInt()
    println("Nama saya: $nama, umur: $umur tahun")  // Tambah $ di depan umur
}
```

29. Masalah Konversi Tipe Data
```kotlin
val angka = "20"
val hasil = angka.toInt() + 5  // Konversi ke Int: 20 + 5 = 25

println(hasil)
```

30. Masalah Null Safety
```kotlin
fun main() {
  val tinggi = readLine()?.toDoubleOrNull() ?: 0.0

  println("Tinggi kamu adalah $tinggi")
}
```