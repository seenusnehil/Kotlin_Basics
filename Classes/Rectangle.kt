package Classes

class Rectangle(
    val a: Double,
    val b: Double
) : ShapesInheritance("Classes.Rectangle"){
    // init block is the first entity to be executed as soon as the
    // class gets its object instantiated
    init {
        println("This is rectangle class with a = $a, b = $b")
        println("Area is: ${area()}")
    }

    // Functions can also be defined as public/private/protected
    // overriding the functions' means that it is going to use the abstract functions defined
    // by its super class
    override fun area() = a*b

    // We can define a function in a single line as well
    // If any sub-class of the super class doesn't override the abstract functions of the super-class then
    // it will raise an error, as abstract functions are the ones that need to be common in all the sub-classes
    override fun peri() = 2*(a+b)
}