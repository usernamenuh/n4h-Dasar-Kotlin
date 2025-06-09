fun main() {
    val listbelanja: MutableList<String> = mutableListOf()
    println(listbelanja)

    listbelanja.add("Mie")
    listbelanja.add("Sayur")
    listbelanja.add("Buah")

    println("List Belanja Awal: $listbelanja")

    listbelanja.remove("Buah")
    listbelanja.add("Apel")

    println("List Belanja Akhir: $listbelanja")

    listbelanja.clear()

    println("List Belanja Kosong: $listbelanja")
}