fun main() {
    print("Masukan Angka Untuk di cek")
    val angka = readLine()!!.toInt()

    if (angka % 2 == 0) {
        println("Bilangan Genap")
    } else if (angka % 2 == 1) {
        println("Bilangan Ganjil")
    } else {
        println("Masukan Angka Yang Benar")
    }
}