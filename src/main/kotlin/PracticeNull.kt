fun produk(nama: String?): String? {
    return nama?.let { "Produk $it telah dibuat" }
}

fun descripsi(produk: String?): String? {
    return produk?.let { "Deskripsi produk $it adalah sebagai berikut:" }
}

class Produk(
    val nama: String,
    val deskripsi: String?
)

fun main() {
    val produk = Produk("Handphone", "Handphone yang terbaik")
    val produk2 = Produk("Komputer", null)

    println(produk.nama)
    println(produk.deskripsi)

    println(produk2.nama)
    println(produk2.deskripsi)
}