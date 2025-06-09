// Data class
class Produk(
    val nama: String,
    val deskripsi: String?
)

fun tampilkanProduk(produk: Produk) {
    println("Nama: ${produk.nama}")


    // Gunakan operator Elvis (?:) untuk memberikan nilai default
    // jika produk.deskripsi ternyata null.
    val deskripsiTampil = produk.deskripsi ?: "(Deskripsi tidak tersedia)"

    println("Deskripsi: $deskripsiTampil")
    println("---")
}

fun main() {
    val produk1 = Produk("Handphone", "Handphone yang terbaik")
    val produk2 = Produk("Komputer", null) // deskripsi null

    // Panggil fungsi
    tampilkanProduk(produk1)
    tampilkanProduk(produk2)
}