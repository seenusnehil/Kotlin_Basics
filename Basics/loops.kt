fun main() {

    // While loop
//    var x = 9
//
//    while(x > 5) {
//        println("Hello")
//        x--
//    }
//    println("How are you?, out of the loop finally")

//    val myArray = arrayOf("A", "B", "C")
//    val length = myArray.size       // helps to calculate total no. of elements in the array
//    var i =0
//
//    while(i < length) {
//        println(myArray[i])
//        i++
//    }

    // Homework 1: Print number in reverse order
//    val num = readLine()?.toInt()
//    var i = num
//
//    if (i != null) {
//        println("Lets count from $num to 0 ")
//        while(i >= 0) {
//            println(i)
//            i--
//        }
//    }

    // Homework 2: Power problem (num1 ^ num2)
//    println("Enter num1:")
//    val num1 = readLine()?.toInt()
//
//    println("Enter num2:")
//    var num2 = readLine()?.toInt()
//    var result = 1
//
//    if(num2 != null && num1 != null) {
//        while(num2 > 0) {
//            result *= num1
//            num2--
//        }
//        println("Answer is: $result")
//    }

    // For loop

//    var i = 0
//    val myArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

//    for(i in 1..9) {    // .. defines range
//        print("$i ")
//    }
//
//    for(i in 9 downTo 1) {    // downTo defines range in reverse order
//        print("$i ")
//    }

//    for(i in 1..9 step 2) {    // step defines how many skips we need to make
//        print("$i ")
//    }
//
//    for(i in 'a'..'z') {    // We can print all alphabets in that way as well
//        print("$i ")
//    }

    val myArray = arrayOf(1, 3, 6, 2, 5, 6, 9)
    var max = myArray[0]
    for(i in myArray) {     // Here i directly indicates the item in the array
        if(i > max)
            max = i
    }
    println("Max is: $max")

    //Homework 1: Sum of array elements

    val array = arrayOf(1, 2, 3, 4, 5, 6)
    var sum = 0

    for(i in array) {
        sum += i
    }
    println("Sum: $sum")

    // Homework 2: Find average of array elements

    var sum2 = 0
    for(i in array) {
        sum2 += i
    }

    val num = array.size
    val avg = sum2/num
    println("Average is: $avg")
}