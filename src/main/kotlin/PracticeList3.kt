fun main() {
    val daftarbelanja = mutableListOf<String>()

    daftarbelanja.add("Air Mineral")
    daftarbelanja.add("Telur")
    daftarbelanja.add("Es Teh")

    println("Daftar Belanja:")

    for (belanja in daftarbelanja) {
        println("- $belanja")
    }
}