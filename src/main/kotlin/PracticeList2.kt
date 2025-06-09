fun main() {
    val temankantor: List<String> = listOf("Mushlih", "Ahmad", "Wafiq", "Dani")
    val temankuliah: List<String> = listOf("Andi", "Dika", "Ganteng")

    val semuateman: MutableList<String> = mutableListOf(temankuliah, temankantor.toMutableList()).flatten().toMutableList()

    semuateman.remove("Andi")
    semuateman.add("Eka")

    semuateman.sort()
    println("Daftar undangan ${semuateman}")
}