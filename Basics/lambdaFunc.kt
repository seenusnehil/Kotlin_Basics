//import Classes.Circle
//import Classes.Rectangle
//import Classes.ShapesInheritance
//import Classes.Triangle
//
//// lambda functions are higher order functions as they take functions as parameters, and returns functions
//fun main() {
////    var list = (1..20).toList()      // Lists defined in this way are immutable
////    println(list)
////    // Here filter is a lambda function
////    list = list.filter { it % 2 == 0}
////    println(list)
//
//    // Creating multiple shapes and put them in a list
//    var c1 = Circle(5.0)
//    var c2 = Circle(4.3)
//
//    var t1 = Triangle(3.0, 3.0, 3.0)
//    var t2 = Triangle(4.0, 5.0, 6.0)
//
//    var r1 = Rectangle(2.0, 4.6)
//    var r2 = Rectangle(3.5, 5.0)
//
//    var shapes = listOf(c1, c2, t1 ,t2, r1, r2)
//    shapes = shapes.customFilter { it.area() > 35.0 }.sortedBy { it.area() }
//
//    for(shape in shapes) {
//        println("${shape.name}: Area = ${shape.area()}")
//    }
//}
//
//// Creating our own Lambda function
//// customFilter is the main Lambda function
//// This customFilter function will take another function named as filterFunction
//// And this filterFunction takes a Shape as parameter and depending upon some conditions it returns
//// a Boolean value, and ultimately the Lambda function i.e., customFilter will return a list filtering
//// out the necessary elements from the list
//fun List<ShapesInheritance>.customFilter(filterFunction: (ShapesInheritance) -> Boolean): List<ShapesInheritance> {
//    var result = mutableListOf<ShapesInheritance>()
//
//    for(shape in this) {   // this refers to the list we're searching on
//        if(filterFunction(shape)){
//            result.add(shape)
//        }
//    }
//
//    return result
//}
//
//// Now suppose that the filterFunction takes 2 parameters, then in the main function where we use the Lambda function
//// we need to define it like as follows:
////         shapes = shapes.customFilter2 {shape, string ->
////                     shape.area() > 35.0
//// this removes the ambiguity that which parameter
//// the function need to access
////         }
//fun List<ShapesInheritance>.customFilter2(filterFunction: (ShapesInheritance, String) -> Boolean): List<ShapesInheritance> {
//    var result = mutableListOf<ShapesInheritance>()
//
//    for(shape in this) {   // this refers to the list we're searching on
//        if(filterFunction(shape, "Hello")){
//            result.add(shape)
//        }
//    }
//
//    return result
//}


// Homework: To create a Lambda function such that it gives the sum of only desired numbers from the list
fun main() {

    var list = (1..10).toList()
    val sum = list.customSum { it % 2 == 1 }

    println("Sum is: $sum")
}

// Lambda function to return sum of only desired elements: customSum takes filterElements function as parameter
fun List<Int>.customSum(FilterElements: (Int) -> Boolean): Int {

    var sum = 0
    for(num in this) {
        if(FilterElements(num)) {
            sum += num
        }
    }

    return sum
}