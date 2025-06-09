fun isGenap(angka: Int): Boolean {
    return angka % 2 == 0
}

fun main() {
    print("Masukan Angka:")
    val angka = readLine()!!.toInt()
    val hasil = isGenap(angka)
    println("Angka $angka adalah bilangan genap: $hasil")
}