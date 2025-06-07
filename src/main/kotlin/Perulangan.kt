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
    var buah = arrayOf("Apel", "Mangga", "Jeruk")
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
    println(buah.get(1))
    println(buah.firstOrNull() ?: "Kosong" )

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
}