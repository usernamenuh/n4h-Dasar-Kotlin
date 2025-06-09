fun jumlahDeret(n: Int): Int {
    return n * (n + 1) / 2
}

fun main() {
    print("Masukan nilai n : ")
    val n = readLine()!!.toInt()

    val jumlah = jumlahDeret(n)
    println("Jumlah deret ke $n adalah $jumlah")
}