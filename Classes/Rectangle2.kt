package Classes

class Rectangle2 ( // Primary constructor
    var a: Double,
    var b: Double
        ){

    // this used over here is to refer the primary constructor i.e. the values that the class takes from the user
    // initially, so this constructor tells the program to create the rectangle by taking only one value from
    // the user
    // We cannot put var for variables here, as they're only allowed in primary constructors
    constructor(a: Double): this(a, a)

    // this constructor will take two Int values from the user and convert them to Double values
    constructor(a:Int, b: Int): this(a.toDouble(), b.toDouble())

    // Here this constructor overloads with the primary constructor but in a "conflicting" manner
    // as both the constructor have the same type of parameters, so it confuses kotlin that which constructor to call
    // when the instance is created
          //constructor(a: Double, b: Double): this(a, b)

    //Hence whenever we overload the constructors make sure to make them unique from each other


    init {
        println("This is a rectangle with sides, a: $a and b: $b")

    }

    fun area() = a*b

    fun perimeter() = 2*a + 2*b
}