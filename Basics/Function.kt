
// Functions are ued to reduce the number of lines in code
// and to reduce repetitive codes
fun main() {

    var x = readLine()?.toInt()
    var y = readLine()?.toInt()
    //printThreeLines()
    if (x != null && y != null) {
        printPow(x, y)
    }
//      if(result(1, 2))
//          println("Same")
//      else
//          println("Different")
}

fun printPow(base: Int, exponent: Int) {
    var result = 1
    for(i in 1..exponent) {
        result *= base
    }
    println("$base to the power of $exponent is $result")
}
//
//fun printThreeLines() {
//    println("First")
//    println("Second")
//    println("Third")
//}
  // We can define our function in this way as well
// as kotlin is smart enough to recognise the type of the output
// But, this function would work only when you have a single statement
// output in the function
//fun result(a: Int, b: Int) = a==b

// Homework: Calculate for a range of numbers
//fun Classes.main() {
//    sum(10)
//}
//
//fun sum(range: Int) {
//    var sum = 0
//    for(i in 1..range)  {
//        sum += i
//    }
//    println("Sum of the values from 1 to $range range is $sum")
//}

