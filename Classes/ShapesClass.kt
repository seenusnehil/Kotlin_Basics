package Classes

import Classes.Circle
//import Classes.Rectangle
import Classes.ShapesInheritance
import Classes.Triangle

fun main() {

    // Making objects and calls for rectangle class
//    val myRect = Classes.Rectangle(9.0, 8.7)
//    println("Result is: ${myRect.area(2, 4)}")
//    println("Result is: ${myRect.peri()}")

    // Creating object for Classes.Circle class
//    val myCircle = Classes.Circle(4.0)
//    println("Perimeter of Classes.Circle is: ${myCircle.perimeter()}")
//    println("Area of Classes.Circle is: ${myCircle.area()}")
//
//    myCircle.changeName("Classes.Triangle")
//    println(myCircle.name)

//    val myTri = Classes.Triangle(1.0, 2.0, 3.0)
//    println("Classes.Triangle Perimeter: ${myTri.peri()}")
//    val ans = myTri.area()
//    println(ans)
//
//    val x: Int = 5
//    val y: Int = 9
//
//    // plus is an internal function
//    println(x.plus(y))

//    val myCircle = Circle(5.0)
//    myCircle.changeName("C1")
//    println(myCircle.name)
//
//    val myTriangle = Triangle(2.0, 4.0, 6.0)
//    myTriangle.changeName("T1")
//    println(myTriangle.name)
//
//    val myRectangle = Rectangle(4.0, 6.0)
//    myRectangle.changeName("R1")
//    println(myRectangle.name)

//    var rect = Rectangle(4.0, 5.0)
//    var circle = Circle(5.5)
//    var triangle = Triangle(3.0, 3.0, 3.0)
//
//    var maxRectCircle = maxArea(rect, circle)
//    println("Max of rectangle and circle area is $maxRectCircle")
//
//    var maxRectCircleTri = maxArea(rect, circle, triangle)
//    println("Max of rectangle, circle and triangle area is $maxRectCircleTri")
//}
//
//fun maxArea(shape1: ShapesInheritance, shape2: ShapesInheritance): Double {
//    var rectArea = shape1.area()
//    var circleArea = shape2.area()
//
//    return if(rectArea > circleArea) rectArea else circleArea
//}
//
//// Function overloading: passed 3 shapes instead of 2 shapes
//fun maxArea(shape1: ShapesInheritance, shape2: ShapesInheritance, shape3: ShapesInheritance): Double {
//    var maxRectCircle = maxArea(shape1, shape2)
//    var triangleArea = shape3.area()
//
//    return if(maxRectCircle > triangleArea) maxRectCircle else triangleArea

    val a = 5.0
    val b = 4.0
    val c = 9.0
    val d = 7.0
    val h = 3.0

    // We have created an anonymous class that is inheriting from the ShapesInheritance class
    // Anonymous class is an alternative class to the super class if you want to make some modifications to it
    // but not to disturb the super class original structure or to make a new separate class file
    var trap = object: ShapesInheritance("Trapezium", a, b, c, d, h) {

        init {
            println("Trapezium is created")
            println("Area of the trapezium is: ${area()}")
            println("Perimeter of the trapezium is: ${peri()}")
        }
        override fun area() = 0.5*(a+b)*h
        override fun peri() = a+b+c+d
    }
}

