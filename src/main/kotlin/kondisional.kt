fun main() {
    val umur = 18

    if (umur >= 20) { // Lebih Dari atau sama dengan
        println("Anda Boleh Daftar Judol")
    } else if (umur >= 19) {
        println("Anda Tidak Boleh daftar")
    } else {
        println("Jangan Judol")
    }

    val nilai = "K"

    when (nilai) {
        "A" -> println("Anda Baik Sekali")
        "B" -> println("Anda Baik")
        "C" -> println("Anda Kurang Baik")
        else -> println("Gmna Ini Remedial")
    }

    val absen = 80
    val hasil = when {
        absen >= 90 -> "A"
        absen >= 80 -> "B"
        else -> "C"
    }


}
