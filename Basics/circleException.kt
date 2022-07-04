import Classes.importantNumber
import java.lang.Exception

fun main() {

    val circle = circleException(-5.0)

    // Exception handling for area of the circle
    val area = try {
        circle.area()
    }catch(e: NegativeRadiusException) {
        0.0
    }
    println("Circle area: $area")

    // Exception handling for perimeter of the circle
    val peri = try {
        circle.peri()
    }catch(e: NegativeRadiusException) {
        0.0
    }
    println("Circle perimeter: $peri")
}

// Created exception class for negative radius
class NegativeRadiusException: Exception("Negative radius for a circle is not possible, enter a positive radius")

// Circle class
class circleException(val radius: Double) {

    init {
        println("A circle with radius $radius is created")
    }

    fun area(): Double {
        if(radius < 0.0)
            // Whenever radius is -ve, it throws the Exception
            throw NegativeRadiusException()
        return importantNumber.PI*radius*radius
    }

    fun peri(): Double {
        // Whenever radius is -ve, it throws the Exception
        if(radius < 0.0)
            throw NegativeRadiusException()
        return 2*importantNumber.PI*radius
    }
}