fun centerText(text: String, lebar: Int = 80): String {
    val spasi = (lebar - text.length) / 2
    return " ".repeat(spasi.coerceAtLeast(0)) + text
}

fun main() {

    println(centerText("<------Kalkulator Sederhana------>"))
    print(centerText("Masukan Angka pertama :"))
    val angka1 = readLine()!!.toDouble()

    print(centerText("Masukan Angka Kedua :"))
    val angka2 = readLine()!!.toDouble()

    print(centerText("Masukan Operasi (+, -, *, /)"))
    val operasi = readLine()

    val hasil = when (operasi) {
        "+" -> angka1 + angka2
        "-" -> angka1 - angka2
        "*" -> angka1 - angka2
        "/" -> {
            if (angka2 !== 0.0) angka1 / angka2 else {
                println(centerText("Pembagian dengan nol tidak di perbolehkan"))
                return
            }
        } else -> {
            println("Operasi tidak di kenal")
            return
        }
    }
    println(centerText("Hasil = $hasil"))

    if (hasil.toInt() % 2 == 0) {
        println(centerText("$hasil adalah bilangan genap"))
    } else {
        println(centerText("$hasil adalah bilangan ganjil"))
    }
}