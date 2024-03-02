import kotlin.math.PI

class Lingkaran(val radius: Double) {

    fun luas(): Double {
        return PI * radius * radius
    }

    fun keliling(): Double {
        return 2 * PI * radius
    }
}

fun main() {
    val lingkaran = Lingkaran(radius = 5.0)
    println("Luas lingkaran: ${lingkaran.luas()}")
    println("Keliling lingkaran: ${lingkaran.keliling()}")
}