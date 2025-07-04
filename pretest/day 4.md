## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

1. Fragment digunakan untuk: A. Menyimpan data permanen
   B. Menampilkan halaman web
   C. Membagi antarmuka aplikasi ke dalam bagian modular
   D. Menyimpan file gambar

2. Kelas dasar untuk membuat fragment adalah: A. `AppCompatFragment`
   B. `FragmentManager`
   C. `Fragment`
   D. `SupportFragment`

3. Metode untuk menambahkan fragment ke activity adalah: A. `addView()`
   B. `beginTransaction().add()`
   C. `inflate()`
   D. `pushFragment()`

4. Untuk mengelola fragment, kita menggunakan: A. `ActivityManager`
   B. `FragmentAdapter`
   C. `FragmentManager`
   D. `Intent`

5. Layout container yang umum digunakan untuk menempatkan fragment di XML adalah:
   A. `TextView`
   B. `LinearLayout`
   C. `FrameLayout`
   D. `ListView`


---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. Fragment memiliki lifecycle yang sama persis dengan Activity.
7. Satu activity bisa menampilkan lebih dari satu fragment.
8. Kita tidak bisa mengganti fragment yang sedang ditampilkan.
9. Fragment bisa mengakses komponen UI dari activity langsung.
10. Fragment tidak bisa hidup tanpa activity.

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa fungsi `FragmentManager` dalam Android?
12. Apa metode yang digunakan untuk menghubungkan layout XML ke fragment?
13. Sebutkan dua metode lifecycle penting pada fragment!
14. Bagaimana cara mengirim data dari activity ke fragment?
15. Mengapa kita menggunakan `FrameLayout` untuk fragment container?
16. Apa perbedaan antara `replace()` dan `add()` saat transaksi fragment?
17. Apakah fragment bisa berdiri sendiri tanpa activity? Jelaskan singkat.
18. Bagaimana cara kembali ke fragment sebelumnya setelah `replace()`?
19. Apa tujuan dari `setArguments(Bundle)` di fragment?
20. Sebutkan alasan menggunakan fragment dibanding activity!

---

## 🛠️ **Bagian 4: Perbaikan Kode (10 Soal)**

21.

```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction.add(R.id.container, fragment).commit()
```

22.

```kotlin
class MyFragment : Fragment {
    override fun onCreateView(...) { ... }
}
```

23.

```xml
<fragment
    android:name="MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_heigth="match_parent" />
```

24.

```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments(bundle)
```

25.

```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack()
    .commit()
```

26.

```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```

27.

```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.setBundle(args)
```

28.

```kotlin
supportFragmentManager.pop()
```

29.

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commitNowAllowingStateLoss()
```

30.

```kotlin
val view = inflater.inflate(R.layout.fragment_home)
```

---

## ✅ **Jawaban**
1. C. Membagi antarmuka aplikasi ke dalam bagian modular
2.  C. `Fragment`
3. B. `beginTransaction().add()`
4. C. `FragmentManager`
5. C. `FrameLayout`
6. False
7. True
8. False
9. True
10. True
11. `FragmentManager` digunakan untuk mengelola fragment seperti menambah, mengganti, atau menghapus fragment.
12. `onCreateView()` digunakan untuk menghubungkan layout XML dengan fragment.
13. `onCreate()` dan `onCreateView()`
14. Dengan menggunakan `setArguments(Bundle)` pada fragment sebelum ditambahkan ke activity.
15. Karena `FrameLayout` adalah layout sederhana yang hanya menampilkan satu anak, cocok sebagai kontainer fragment.
16. `add()` menambahkan fragment tanpa menghapus yang lama, sedangkan `replace()` akan mengganti fragment yang ada.
17. Tidak bisa, karena Fragment harus ada dalam konteks activity agar bisa ditampilkan.
18. Gunakan `.addToBackStack(null)` saat transaksi, lalu `popBackStack()` untuk kembali.
19. Untuk mengirim data ke fragment sebelum ditampilkan (sebagai argumen).
20. Reusabilitas UI, efisiensi memori, dan fleksibilitas pada layar besar (tablet).
21. Perbaikan kode: beginTransaction harus dipanggil sebagai method (())
```kotlin
val fragment = ExampleFragment()
supportFragmentManager.beginTransaction().add(R.id.container, fragment).commit()
```

22. Perbaikan kode: Fragment harus dipanggil sebagai konstruktor dengan tanda kurung
```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(...) { ... }
}
```

23. Perbaikan kode: Typo di layout_heigth → harus layout_height + class name harus fully qualified
```xml
<fragment
    android:name="com.example.MyFragment"
    android:id="@+id/my_fragment"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```
24. Perbaikan kode: arguments bukan fungsi
```kotlin
val bundle = Bundle()
bundle.putString("key", "value")
fragment.arguments = bundle
```

25. Perbaikan kode: addToBackStack() butuh argumen (boleh null)
```kotlin
supportFragmentManager.beginTransaction()
    .replace(R.id.container, NewFragment())
    .addToBackStack(null)
    .commit()
```

26. Benar
```kotlin
class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_my, container, false)
    }
}
```

27. Perbaikan kode: Tidak ada fungsi setBundle(). Gunakan properti arguments untuk mengirim Bundle ke fragment.


```kotlin
val fragment = MyFragment()
val args = Bundle()
args.putInt("id", 10)
fragment.arguments = args
```

28. Perbaikan kode: Tidak ada fungsi pop() di FragmentManager. Untuk kembali ke fragment sebelumnya, gunakan popBackStack().

```kotlin
supportFragmentManager.popBackStack()
```

29. Benar

```kotlin
activity.supportFragmentManager.beginTransaction()
    .remove(fragment)
    .commitNowAllowingStateLoss()
```

30. Kurang argumen container dan attachToRoot
```kotlin
val view = inflater.inflate(R.layout.fragment_home, container, false)
```