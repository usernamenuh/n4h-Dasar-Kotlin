fun main () {
   for (i in 1..5 ) {
        println("Angka ke-$i")
    }

    var i = 1
    while (i <= 5) {
        println("Interasi ke-$i")
        i++
    }

    var a = 1
    do {
        println(a)
        a++
    } while (a <= 10)

    // loop array
  /*  val buah = arrayOf("Apel", "Mangga", "Jeruk")
    for (item in buah) {
        println(item)
    }

    for (i in buah.indices) {
        println("index $i = ${buah[i]}")
        println("buah pertama $i = ${buah[i]}")
    }
    println("Buah ${buah[0]}")
    println(buah.first())
    println(buah.last())
  *//*  println(buah.get(1))*//*
    println(buah.firstOrNull() ?: "Kosong" )*/

    // Practice
    // Soal 1
    for (a in 1..10) {
        println("Angka ke-$a")
    }

    // Soal 2
    for (angka in 1..20) {
        if (angka % 2 == 0) {
            println("Angka ke-$angka")
        }
    }

    // Soal 3
    var  belajar = 1
    while (belajar <= 5) {
        println("belajar kotlin")
        belajar++
    }

    // Soal 4
    var cetak = 1
    do {
        println(cetak)
        cetak++
    } while (cetak <= 5)

    // Soal 5
    val hewan = listOf("Kucing", "Anjing", "Burung")
    for (item in hewan) {
        println(item)
    }

    // Soal 6
    val angka = listOf(10, 25, 40, 5)
    for (item in angka) {
        if (item >= 20) {
            println(item)
        }
    }

    // Soal 7
    for (ganjil in 1..10) {
        if (ganjil % 2 == 1) {
            println(ganjil)
        }
    }

    // Soal 8
    val nilai = listOf(80, 90, 70, 100)
    for (item in nilai) {
        if (item >= 75) {
            println("Lulus")
        } else {
            println("Tidak lulus")
        }
    }

    // Soal 9
    val buah = listOf("Apel", "Jeruk", "Mangga")
        for (b in 0 until buah.size) {
            println("Index $b = ${buah[b]}")
        }

    // Soal 10
    for (perkalian in 1..10) {
        val hasil = 2 * perkalian
        println("2 x $perkalian = $hasil")
    }

    // Soal 11
    val l = listOf(1, 2, 3, 4, 5)
    val o = l.sum()
    println("Hasil $o")

    // Soal 12
    var input: String
    var total = 0

    do {
        print("Masukkan angka (atau 0 untuk keluar): ")
        input = readLine()!!
        if (input.toIntOrNull() != null) {
            total += input.toInt()
        } else {
            println("Input tidak valid. Silakan masukkan angka.")
        }
    } while (input != "0" && input.toIntOrNull() != null)

    println("Total: $total")

    // Soal 13

    var siswa = listOf("Enuh", "Jingga", "Ontie")
    for (jio in siswa) {
        if (jio.length > 5) {
            println(jio)
        }
    }

}