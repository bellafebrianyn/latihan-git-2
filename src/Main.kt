import kotlin.math.PI
import kotlin.math.sqrt

class Lingkaran(val radius: Double) {

    fun luas(): Double {
        return PI * radius * radius
    }

    fun keliling(): Double {
        return 2 * PI * radius
    }
}

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {

    private fun calculatePerimeter(): Double {
        return sideA + sideB + sideC
    }

    private fun calculateArea(): Double {
        val semiPerimeter = calculatePerimeter() / 2
        return sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
    }
}

fun main() {
    val lingkaran = Lingkaran(radius = 5.0)
    println("Luas lingkaran: ${lingkaran.luas()}")
    println("Keliling lingkaran: ${lingkaran.keliling()}")
}