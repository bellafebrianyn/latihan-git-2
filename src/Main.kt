import kotlin.math.PI

class Lingkaran(val radius: Double) {

    fun luas(): Double {
        return PI * radius * radius
    }

    fun keliling(): Double {
        return 2 * PI * radius
    }
}

class Square(val sideLength: Double) {

    // Function to calculate the area of the square
    fun area(): Double {
        return sideLength * sideLength
    }

    // Function to calculate the perimeter of the square
    fun perimeter(): Double {
        return 4 * sideLength
    }
}

fun main() {
    val lingkaran = Lingkaran(radius = 5.0)
    println("Luas lingkaran: ${lingkaran.luas()}")
    println("Keliling lingkaran: ${lingkaran.keliling()}")

    // Create an instance of the Square class with side length 5.0
    val square = Square(sideLength = 5.0)
    println("Area of the square: ${square.area()}")
    println("Perimeter of the square: ${square.perimeter()}")
}
