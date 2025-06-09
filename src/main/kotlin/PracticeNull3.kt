fun sapaPengguna(nama: String?) {
    if (!nama.isNullOrEmpty()) {
        println("Hello $nama, Panjang nama kamu adalah ${nama.length} karakter")
    } else {
        println("Hallo, Kawan")
    }
}

fun main() {
    sapaPengguna("Nuh")
    sapaPengguna(null)
}