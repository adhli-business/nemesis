## ✅ **Bagian 1: Pilihan Ganda (5 Soal)**

```
1. Komponen Android yang digunakan untuk menampilkan teks adalah:
   A. Button
   B. EditText
   C. TextView
   D. ImageView

2. Komponen UI yang digunakan untuk mengambil input teks dari pengguna adalah:
   A. Button
   B. TextView
   C. EditText
   D. Spinner

3. Untuk menampilkan gambar, kita menggunakan komponen:
   A. WebView
   B. ImageView
   C. RecyclerView
   D. VideoView

4. Layout yang memungkinkan penempatan elemen secara bebas dengan constraint disebut:
   A. LinearLayout
   B. RelativeLayout
   C. ConstraintLayout
   D. FrameLayout

5. Manakah yang merupakan komponen UI untuk menampilkan daftar data besar secara efisien?
   A. ListView
   B. GridView
   C. RecyclerView
   D. TextView

```
---

## 🔄 **Bagian 2: True/False (5 Soal)**

6. `LinearLayout` hanya bisa digunakan untuk tata letak horizontal.
7. `Button` bisa digunakan untuk menampilkan gambar.
8. `ScrollView` hanya dapat memiliki satu child langsung.
9. `Toast` digunakan untuk menampilkan notifikasi yang butuh interaksi pengguna.
10. `findViewById()` digunakan untuk mengambil referensi UI dari layout XML.

---

## ✍️ **Bagian 3: Jawaban Singkat (10 Soal)**

11. Apa nama layout yang cocok untuk membuat UI kompleks dengan aturan posisi antar elemen?
12. Sebutkan dua komponen UI untuk input pilihan pengguna!
13. Fungsi dari `TextInputLayout` adalah untuk...?
14. Bagaimana cara menambahkan teks ke `TextView` di Kotlin?
15. Apa fungsi `RecyclerView.Adapter` dalam RecyclerView?
16. Apa perbedaan utama antara `TextView` dan `EditText`?
17. Komponen apa yang digunakan untuk membuat notifikasi pop-up singkat di layar?
18. Sebutkan satu perbedaan antara `LinearLayout` dan `RelativeLayout`!
19. Apa nama komponen UI untuk menampilkan teks dengan opsi "hint"?
20. Jika ingin menambahkan ikon di atas tombol, komponen apa yang sebaiknya digunakan?

---

## 🛠️ **Bagian 4: Perbaiki Kode (10 Soal)**

21.

```xml
<TextView
    android:layout_width="match_content"
    android:layout_height="wrap_content"
    android:text="Hello" />
```

22.

```kotlin
val btn = findViewById<Button>(R.id.button)
btn.text("Click Me")
```

23.

```xml
<LinearLayout
    android:orientation="vertikal"
    ...>
```

24.

```kotlin
val text = findViewById<TextView>(R.id.textView)
text.setText = "Hi"
```

25.

```xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="image.png" />
```

26.

```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.getText().toString
```

27.

```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething()" />
```

28.

```kotlin
Toast.makeText(this, "Saved!", LENGTH_LONG).show()
```

29.

```xml
<EditText
    android:hintText="Enter name"
    ... />
```

30.

```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContent(layout)
```

---

## **Jawaban**
1. C. TextView
2. C. EditText
3. B. ImageView
4. C. ConstraintLayout
5. C. RecyclerView
6. False
7. True
8. True
9. False
10. True 
11. ConstraintLayout
12. RadioButton dan Spinner
13. Membungkus EditText dengan label/hint animasi
14. ` textView.text = "Hello world" `
15. Fungsi `RecyclerView.Adapter` adalah sebagai jembatan antara data yang ditampilkan dan tampilan (view) yang digunakan untuk menampilkan data tersebut
16. `TextView` digunakan untuk menampilkan teks, sementara `EditText` digunakan untuk user menginputkan data.
17. Toast
18. `LinearLayout` menyusun elemen sejajar (vertikal/horizontal), `RelativeLayout` menyusun relatif antar elemen.
19. `EditText`
20. `ImageButton` atau `Button` dengan drawableTop
21. Perbaikan kode:
```xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello" />
```
22. Perbaikan kode:
```kotlin
val btn = findViewById<Button>(R.id.button)
btn.text = "Click Me"
```

23. Perbaikan kode: 
```xml
<LinearLayout
    android:orientation="vertical"
    ...>
```

24. Perbaikan kode: 
``` kotlin
val text = findViewById<TextView>(R.id.textView)
text.text = "Hi"
```

25. Perbaikan kode:
``` xml
<ImageView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:src="@drawable/image" />
```

26. Perbaikan kode: 
```kotlin
val input = findViewById<EditText>(R.id.input)
val value = input.text.toString
```

27. Perbaikan kode: 
```xml
<Button
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:onClick="doSomething" />
```

28. Perbaikan kode: 
```kotlin
Toast.makeText(this, "Saved!", Toast.LENGTH_LONG).show()
```

29. Perbaikan kode:
```xml
<EditText
    android:hint="Enter name"
    ... />
```

30. Perbaikan kode:
```kotlin
val layout = LinearLayout(this)
layout.orientation = LinearLayout.VERTICAL
setContentView(layout)
```
