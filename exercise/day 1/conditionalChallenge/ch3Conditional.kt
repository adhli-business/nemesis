fun main() {
    val uname = "admin"
    val passw = "1234"

    print("Masukkan username: ")
    var username = readLine()
    print("Masukkan password: ")
    var password = readLine()

    val res = if (username == uname && password == passw) "Login berhasil!" else "Username/password salah."
    print(res)
}
