import java.lang.Exception

fun main() {

    // This will generate an error if you enter a word, or something that cannot be converted into integer
//    val input = readLine()?.toInt()

    // So, to handle this Exception we use try and catch block
    // in try section, we include code for what we need to get as result
    // and in catch block we include things which we need to display if we didn't get the desired result
    // All types of exceptions are classes which inherit from the super class Exception
//    val input = try{
//        readLine()?.toInt()
//    } catch(e: Exception) {
//        println("Wrong Input")
//    }
//    // This block will run in every case, even when the program doesn't throw any error
//    finally {
//        println("finally block will run in every case")
//    }
//    println("Your input is: $input")

    // Code for raising an error in dic=vision problems
//    val result = try {
//        divide(5.0, 4.0)
//    }catch(e: DivideByZeroException) {
//        0.0
//    }
//
//    println("The result is: $result")


}
//
//// This is a self created exception for some particular function you want to execute with the message
//class DivideByZeroException: Exception("Zero in denominator is not accepted, try putting another number")
//
//
//fun divide(a: Double, b: Double): Double {
//
//    // For the condition, throwing an error
//    if(b == 0.0) {
//        throw DivideByZeroException()
//    }
//    return a/b
//}