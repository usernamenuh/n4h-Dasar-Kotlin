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
      /*  println("index $i = ${buah[i]}")*/
        println("buah pertama $i = ${buah[i]}")
    }
    println("Buah ${buah[0]}")
    println(buah.first())
    println(buah.last())
    println(buah.get(1))
    println(buah.firstOrNull() ?: "Kosong" )
}