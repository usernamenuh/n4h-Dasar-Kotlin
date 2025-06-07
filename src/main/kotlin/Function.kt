fun main() {
    sapa("Nuh")
    val hasil = tambah(10,10)
    println("Hasil = $hasil")
}

fun sapa(nama: String) {
    println("Hello $nama")
}

fun tambah(a: Int, b: Int): Int {
    return a + b
}