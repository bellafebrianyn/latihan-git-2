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
    // Create an instance of the Square class with side length 5.0
    val square = Square(sideLength = 5.0)

    // Print the area of the square
    println("Area of the square: ${square.area()}")

    // Print the perimeter of the square
    println("Perimeter of the square: ${square.perimeter()}")
}
