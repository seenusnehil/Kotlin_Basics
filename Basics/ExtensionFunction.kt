//// About Extension functions
//// Special feature of Kotlin
//
//fun Classes.main() {
//    println("Enter a number: ")
//    val input = readLine()?.toInt()
//
//    if(input != null) {
//
//        // Here since we extended a function of Int type
//        // and our input is of Int type too
//        // Hence, in this case we call the function in the following manner
//        // Cause both the inout and function are of Integer type
//        if(input.isPrime()) {
//            println("$input is a prime number")
//        } else {
//            println("$input is not a prime number")
//        }
//
//    }
//}
//
//// Since the input is of type Integer,
//// we can use extension function of Int type
//// And since the extension functions already know that of what type
//// the extension is, we do not need to pass any parameter into this function
//fun Int.isPrime(): Boolean {
//
//    // Here, this is used to refer the input (i.e. number entered by the user)
      // as both are of the same type (INT)
//    for(i in 2 until this-1) {
//        if(this % i == 0)
//            return false
//    }
//
//    return true
//}

// Homework : Product of a given list using extension functions

fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5, 6)

    val ans = list.product()
    println("Product of the $list is: $ans")
}

fun List<Int>.product(): Int{
    var result = 1
    for(i in this) {    // this denotes list given in the Classes.main function
        result *= i
    }

    return result
}
