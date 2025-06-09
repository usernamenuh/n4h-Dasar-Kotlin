// Class untuk menyimpan item dan harganya
data class ItemBelanja(
    val nama: String,
    val harga: Double
)

fun main() {
    val daftarBelanja = mutableListOf<ItemBelanja>()

    println("Masukan daftar belanja satu per satu (Ketik 'selesai' untuk selesai)")
    while (true) {
        print("Masukan nama item belanjaan: ")
        val namaItem = readLine()!!.trim()
        
        if (namaItem.lowercase() == "selesai") break

        if (namaItem.isNotEmpty()) {
            print("Masukan harga untuk $namaItem: ")
            val hargaInput = readLine()!!.trim()
            
            try {
                val harga = hargaInput.toDouble()
                daftarBelanja.add(ItemBelanja(namaItem, harga))
            } catch (e: NumberFormatException) {
                println("⚠️ Harga tidak valid! Mohon masukan angka yang benar.")
                continue
            }
        }
    }

    // Menampilkan daftar belanja dengan format harga
    println("\n🛒 Daftar Belanja Kamu:")
    for ((index, item) in daftarBelanja.withIndex()) {
        println("${index + 1}. ${item.nama}: Rp ${format(item.harga)}")
    }

    // Menghitung dan menampilkan total
    val total = daftarBelanja.sumOf { it.harga }
    println("\n💰 Total Belanja: Rp ${format(total)}")
}

// Fungsi untuk memformat angka dengan pemisah ribuan
fun format(number: Double): String {
    return String.format("%,.0f", number)
}