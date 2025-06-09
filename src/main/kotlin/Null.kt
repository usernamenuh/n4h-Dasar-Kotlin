fun main() {
    val nama: String? = null // Boleh null karena pake tanda '?'

    // Safe call
    println(nama?.length) // Tidak error meskipun null -> hasil: null

    // Elvis operator (?:)
    val panjang = nama?.length ?: 0
    println("Panjang nama adalah $panjang")

  /*  // Force unwrap (!!) - Awas Error
    println(nama!!.length) // Akan crash kalu null*/
}