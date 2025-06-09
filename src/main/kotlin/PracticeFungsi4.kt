fun konversinilai(nilai: Int): String {
    return when {
        nilai >= 90 -> "A"
        nilai >= 80 -> "B"
        nilai >= 70 -> "C"
        nilai >= 60 -> "D"
        else -> "E"
    }
}

fun main() {
    print("Masukan Nilai : ")
    val nilai = readLine()!!.toInt()

    println("Nilai Anda : ${konversinilai(nilai)}")
}