fun main() {
    val list = listOf("Mushlih", "Ahmad", "Wafiq", "Dani")
    for (nama in list) {
        println("Nama saya adalah $nama")
    }

    val nilai = mapOf("Mushlih" to 90, "Ahmad" to 85, "Wafiq" to 95, "Dani" to 90)
    for ((nama, nilaiUjian) in nilai) {
        println("Nilai $nama adalah $nilaiUjian")
    }
}