fun konver(nilai: Int): String {
    return when {
        nilai >= 90 -> "A Lulus"
        nilai >= 80 -> "B Lulus"
        nilai >= 70 -> "C Remedial"
        nilai >= 60 -> "D Remedial"
        nilai >= 50 -> "E Mengulang"
        nilai >= 40 -> "F Mengulang"
        else -> "Tidak Lulus"
    }
}

fun main() {
    print("Masukan Nilai : ")
    val nilai = readLine()!!.toInt()
    val huruf = konver(nilai)
    println("Nilai Anda : $huruf")
}