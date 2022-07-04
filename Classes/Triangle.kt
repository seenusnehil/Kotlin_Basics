package Classes

import Classes.ShapesInheritance
import kotlin.math.sqrt

class Triangle(
    val a: Double,
    val b: Double,
    val c: Double
) : ShapesInheritance("Classes.Triangle"){
    init{
        println("Classes.$name created with a = $a, b = $b, c = $c")
        println("Perimeter of the triangle is: ${peri()}")
        println("Area of the triangle is: ${area()}")

    }

    override fun peri() = a+b+c

    override fun area(): Double {
        return sqrt((peri() / 2) * ((peri() / 2) - a) * ((peri() / 2) - b) * ((peri() / 2) - c))
    }
}