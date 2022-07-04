package Classes

// We can define the primary constructor as private/protected constructor
// using private constructor keyword
// Then the variables inside this constructor can only be initialised
// inside that class

// So it better to keep it public (default)
class Circle (
    val radius: Double
) : ShapesInheritance("Classes.Circle"){
    // We did not put this onto the constructor as we
    // do not want to initialize everytime
    // So always make such variables private
    //private val pi = 3.141592
    init {
        println("$name class created with radius = $radius")
        println("Classes.Circle area = ${area()}")
        println("Classes.Circle perimeter = ${peri()}")
    }

    // instead of a private value, we created a singleton object which will be accessed
    override fun peri() = 2*radius*importantNumber.PI
    override fun area() = radius*radius*importantNumber.PI

}