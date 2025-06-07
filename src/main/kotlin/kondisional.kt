fun main() {
/*    val umur = 18

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
    }*/

    // practice

    // Soal 2
    val nilai = 85

    if (nilai >= 85) {
        println("Lulus dengan pujian")
    } else if (nilai >= 60) {
        println("Lulus")
    } else {
        println("Tidak Lulus")
    }

    // Soal 3
    val umur = 16
    if (umur >= 17) {
        println("Boleh memilih")
    } else {
        println("Belum Boleh memilih")
    }

    // Soal 4
    val hari = "8"
    when (hari) {
        "1" -> println("Senin")
        "2" -> println("Selasa")
        "3" -> println("Rabu")
        "4" -> println("Kamis")
        "5" -> println("Jum'at")
        "6" -> println("Sabtu")
        "7" -> println("Minggu")
        else -> println("Input Tidak Valid")
    }

    val warna = "Jingga"
    val hasil = when (warna) {
        "Merah" -> println("Bahaya")
        "Hijau" -> println("Aman")
        "Biru" -> println("Terang")
        else -> println("Warna tidak valid")
    }
}
