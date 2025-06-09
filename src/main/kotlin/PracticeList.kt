fun main() {
    val nilaiujian: List<Int> = listOf(100, 95, 80, 70, 60)
    println("Nilai Ujian: $nilaiujian")

    val nilaiUjianTertinggi = nilaiujian.maxOrNull()
    println("Nilai Ujian Tertinggi: $nilaiUjianTertinggi")

    val rataRata = nilaiujian.average()
    println("Rata-rata: $rataRata")

    val nilaiTerendah = nilaiujian.minOrNull()
    println("Nilai Terendah: $nilaiTerendah")

    val siswaLulus = nilaiujian.filter { it >= 80 }
    println("Siswa Lulus: $siswaLulus")

    val jumlahSiswaLulus = siswaLulus.size
    println("Jumlah Siswa Lulus: $jumlahSiswaLulus")

    val jumlahsiswalulus = nilaiujian.count { it >= 80 }
    println("Jumlah Siswa Lulus: $jumlahsiswalulus")
}