fun LuasPersegiPanjang(panjang: Int, lebar: Int): Int {
    return panjang * lebar
}

fun main() {
    print("Masukan Panjang : ")
    val panjang = readLine()!!.toInt()
    print("Masukan Lebar : ")
    val lebar = readLine()!!.toInt()

    val luas = LuasPersegiPanjang(panjang, lebar)
    println("Luas Persegi Panjang = $luas")
}