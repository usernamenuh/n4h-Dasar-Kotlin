fun main () {
    var x = "Kamu" // Can Be Changed
    x = "aku"
    println(x)

    val y = "you" // Can't Be Changed
    println(y)

    // type data
    val nilai: Int = 100
    val hadir: Boolean = true
    val pi: String = "My name is nuh"
    val po: Double = 20.900
    val fl: Float = 9.900f

    // Practice
    var panjang: Int = 5
    var lebar: Int = 3

    println("Panjang = $panjang, Lebar = $lebar")
    var hasil = panjang * lebar
    println("Hasil = $hasil")

    val celcius: Double = 30.0
    val fahrenheit = (celcius * 9/5) + 32

    println("Suhu dalam fahrenheit $fahrenheit")

    val name: String = "Muhammad Enuh"
    val age: Int = 20
    val tall: Double = 75.0

    println("My name is $name, I am $age years old and my height is $tall cm.")

    val nama: String = "Siti"
    val nim: Int = 2401109
    val status: Boolean = true

    println("Nama : $nama")
    println("NIM : $nim")
    println("Status : $status")

    val a = 10
    val b = 3

    println(a * b) // Perkalian
    println(a + b) // Penjumlahan
    println(a - b) // Penguragan
    println(a / b) // Pembagian (ini hasilnya 3 karena di pangkas)
    println(a % b) // Sisa Bagi

}