package Classes

import kotlin.random.Random

class rectProperties (var l: Double,
                 var b: Double
) {

    // companion objects are user defined objects that contain some properties, imp functions
    // that can be used by the class it is defined in
    // Also since it is an object we cannot create objects of this
    companion object {

        // Function to give a random rectangle
        fun randomRectangle(): rectProperties {
            var l = Random.nextDouble(1.0, 10.0)
            var b = Random.nextDouble(1.0, 10.0)

            return rectProperties(l, b)
        }
    }

    init {
        println("This is a rectangle class of length: $l and width: $b")
        println("Area of the rectangle: ${area()}")
        println("Perimeter of the rectangle: ${peri()}")
    }

    fun area() = l*b
    fun peri() = 2*l + 2*b
}