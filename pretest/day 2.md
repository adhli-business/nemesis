## 📄 **Pretest: Activity Lifecycle di Android (30 Soal)**

### ✅ **Bagian A – Pilihan Ganda (10 Soal)**

**Pilih satu jawaban yang paling benar.**

1. Method lifecycle manakah yang pertama kali dipanggil ketika Activity baru dimulai?
   a. `onResume()`
   b. `onCreate()`
   c. `onStart()`
   d. `onRestart()`

2. Method `onPause()` biasanya dipanggil ketika...
   a. Aplikasi ditutup total
   b. User menekan tombol back
   c. Activity lain muncul di atas Activity saat ini
   d. Aplikasi di-_reinstall_

3. Method `onDestroy()` akan selalu dipanggil jika...
   a. Aplikasi direstart
   b. Pengguna berpindah ke Activity lain
   c. Aplikasi ditutup melalui recent apps
   d. Tidak selalu dijamin dipanggil

4. Saat rotasi layar terjadi, method apa yang umumnya **tidak** dipanggil kembali secara otomatis?
   a. `onCreate()`
   b. `onStart()`
   c. `onPause()`
   d. `onRestart()`

5. Lifecycle `onRestart()` akan dipanggil saat...
   a. Aplikasi dijalankan pertama kali
   b. Setelah `onStop()` dan Activity dibuka lagi
   c. Setelah `onDestroy()`
   d. Setelah `onPause()`

6. Saat user menekan tombol home, urutan method yang dipanggil adalah:
   a. `onPause()`, `onDestroy()`
   b. `onPause()`, `onStop()`
   c. `onStop()`, `onDestroy()`
   d. `onCreate()`, `onStart()`

7. Untuk menyimpan data sementara sebelum Activity di-_recreate_, gunakan:
   a. `onStart()`
   b. `onPause()`
   c. `onSaveInstanceState()`
   d. `onResume()`

8. Jika ingin mencegah Activity di-_recreate_ saat rotasi, properti apa yang ditambahkan?
   a. `android:stateAlwaysVisible`
   b. `android:keepScreenOn`
   c. `android:configChanges="orientation|screenSize"`
   d. `android:restartOnRotation`

9. Lifecycle method mana yang dipanggil tepat setelah `onCreate()`?
   a. `onStop()`
   b. `onDestroy()`
   c. `onStart()`
   d. `onPause()`

10. Fungsi dari `onResume()` adalah...
    a. Menyimpan data sebelum aplikasi ditutup
    b. Menjalankan logika utama setelah tampilan muncul
    c. Menghapus cache aplikasi
    d. Mendaftarkan listener ViewGroup

---

### ❓ **Bagian B – True/False (10 Soal)**

**Tulis T (True) atau F (False) untuk setiap pernyataan.**

11. `onStart()` dipanggil hanya sekali selama siklus hidup Activity.
12. `onPause()` dipanggil sebelum `onStop()`.
13. `onDestroy()` selalu dipanggil jika Activity berpindah ke Activity lain.
14. Rotasi layar akan memanggil kembali `onCreate()`.
15. `onResume()` menandakan bahwa Activity sedang tampil dan aktif.
16. `onSaveInstanceState()` digunakan untuk menampilkan notifikasi.
17. Setelah `onStop()`, Activity akan langsung `onDestroy()` tanpa pengecualian.
18. Method `onRestart()` tidak akan pernah dipanggil jika aplikasi ditutup total.
19. `onCreate()` hanya digunakan untuk menampilkan layout.
20. Android menjamin bahwa semua lifecycle dipanggil secara berurutan.

---

### ✍️ **Bagian C – Isian Singkat (5 Soal)**

21. Sebutkan 3 method utama yang dipanggil ketika Activity pertama kali diluncurkan.

22. Apa fungsi utama dari method `onSaveInstanceState()`?

23. Apa perbedaan `onPause()` dan `onStop()` dalam siklus Activity?

24. Apa dampak dari tidak menambahkan `configChanges` saat orientasi berubah?

25. Sebutkan satu kondisi di mana `onDestroy()` **tidak** dipanggil oleh sistem Android.

---

### 🔧 **Bagian D – Koreksi Kode (5 Soal)**

**Perbaiki dan jelaskan kesalahan pada cuplikan kode berikut.**

26.

```kotlin
override fun onCreate() {
  super.onCreate()
  setContentView(R.layout.activity_main)
}
```

27.

```kotlin
override fun onStop(savedInstanceState: Bundle?) {
  super.onStop(savedInstanceState)
  Log.d("LIFECYCLE", "Stopped")
}
```

28.

```kotlin
override fun onResume() {
  setContentView(R.layout.activity_main)
  super.onResume()
}
```

29.

```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  Log.d("LIFECYCLE", "Created")
}
```

30.

```kotlin
override fun onSaveInstanceState() {
  outState.putString("username", "admin")
  super.onSaveInstanceState(outState)
}
```

---

### ✅ **Jawaban**
1. b. `onCreate()`
2. c. Activity lain muncul di atas Activity saat ini
3. d. Tidak selalu dijamin dipanggil
4. d. `onRestart()`
5. b. Setelah `onStop()` dan Activity dibuka lagi
6. b. `onPause()`, `onStop()`
7. c. `onSaveInstanceState()`
8. c. `android:configChanges="orientation|screenSize"`
9. c. `onStart()`
10. b. Menjalankan logika utama setelah tampilan muncul

11. False
12. True
13. False
14. True
15. True
16. False
17. False
18. True
19. False
20. False
21. `onCreate(), onStart(), onResume()`
22. Untuk menyimpan data sementara sebelum activity dihancurkan
23. `onPause()` Dipanggil saat Activity tidak lagi di foreground (tapi masih terlihat sebagian). Sementara, `onStop()` Dipanggil saat Activity tidak terlihat sama sekali (misalnya saat berpindah ke Activity lain).
24. Activity akan di-recreate otomatis saat orientasi berubah, menyebabkan onCreate() dan seluruh lifecycle dijalankan ulang.
25. Jika sistem mematikan proses paksa karena kekurangan memori (tanpa memberi kesempatan memanggil lifecycle).
26. `onCreate()` harus menerima parameter `Bundle?.`
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
}
```
27. `onStop()` tidak menerima parameter.
```kotlin
override fun onStop() {
  super.onStop()
  Log.d("LIFECYCLE", "Stopped")
}
```
28. `super.onResume()` harus dipanggil lebih dulu, dan biasanya `setContentView()` hanya dipanggil di `onCreate()`.
```kotlin
override fun onResume() {
  super.onResume()
  // Tidak perlu setContentView di sini kecuali ingin reset layout
}
```
29. `super.onCreate()` wajib dipanggil terlebih dahulu.


```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  Log.d("LIFECYCLE", "Created")
}
```
30. Method harus menerima parameter `outState`.
```kotlin
override fun onSaveInstanceState(outState: Bundle) {
  super.onSaveInstanceState(outState)
  outState.putString("username", "admin")
}
```










