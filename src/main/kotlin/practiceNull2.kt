class Alamat (
    val jalan: String
)

class Dapartemen (
    val nama: String,
    val alamat: Alamat?
)

class Karyawan (
    val nama: String,
    val dapartemen: Dapartemen?
)

fun dapatkanAlamatJalan(Karyawan: Karyawan): String? {
    return Karyawan.dapartemen?.alamat?.jalan ?: "Alamat tidak ditemukan "
}

fun main() {
    val alamatIt = Alamat("JL. Tekonologi No. 123")
    val depIt = Dapartemen("Dapartemen IT", alamatIt)
    val depHr = Dapartemen("Sumber daya mannusia", null)

    val Eko = Karyawan("Eko", depIt)
    val alfian = Karyawan("Alfian", depHr)
    val cindy = Karyawan("Cindy", null)

    println("Alamat Eko: ${dapatkanAlamatJalan(Eko)}")
    println("Alamat Alfian: ${dapatkanAlamatJalan(alfian)}")
    println("Alamat Cindy: ${dapatkanAlamatJalan(cindy)}")
}