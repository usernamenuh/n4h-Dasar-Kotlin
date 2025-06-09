fun main() {

    // Tidak bisa di ubah
    val list = listOf("Mangga", "Nanas", "Durian")
    println(list)

    // Bisa di ubah
    val mutableList = mutableListOf("Mangga", "Nanas", "Durian")
    mutableList.add("Jeruk")
    mutableList.remove("Durian")
    mutableList[0] = "Apel"
    println(mutableList)
}