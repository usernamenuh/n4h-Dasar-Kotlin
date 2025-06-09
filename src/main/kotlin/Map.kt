fun main() {
    val nilai = mapOf(
        "Mushlih" to 90,
        "Ahmad" to 85,
        "Wafiq" to 95,
        "Dani" to 75
    )
    println(nilai["Mushlih"])

    // MutableMap

    val hasil = mutableMapOf<String, Int>()
        hasil["Ahmad"] = 85
    hasil["Mushlih"] = 90
    println(hasil)

    // Set data unik tidak boleh duplikat
    val angka = setOf(1, 2, 3, 4, 5, 4, 1, 3, 9, 10)
    println(angka)
}