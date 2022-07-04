// Here we discuss different types of parameters we pass in a function
//
//fun Classes.main() {
////    val array = intArrayOf(1, 4, 6, 23, 6, 8, 4, 2)
////
////    // *array i.e. *<arrayName> will insert the elements of your array int the parameters list
////    // of type vararg
////    val max = printMax(1, 2, 6, 4, 3, 7, 9, 4)
////    println("The max is: $max")
////    val numbers = IntArray(5) { 10 * (it + 1) }
//
////    searchFor("What is my name?")
////    searchFor("Where are you from?", "Yahoo")
//
//    printMyName(lname = "Seenu", fname = "Snehil")
//}
//
//// vararg stands for variable no of arguments
//// So a vararg variable can contain many variables just like list
//fun printMax(vararg numbers: Int): Int {
//    var max = numbers[0]
//    for(i in numbers) {
//        if(i > max)
//            max  = i
//    }
//    return max
//}
//
//// Use of default parameters
//// In this case even if we don't specify any one of the defined parameters
//// we'll get any error
//fun searchFor(search: String, searchEngine: String = "Google") {
//    println("Searching for '$search' on $searchEngine")
//}
//
//// Use of named Parameters
//// This type of parameters are generally used when we have
//// lots parameters defined in our functions
//fun printMyName(fname: String, lname: String) {
//    println("My full name is $fname $lname")
//}

// Homework: Find the alternative sum from the given list using functions
fun main() {

    val ans = alternativeSum(1, 2, 3, 4, 5, 6, 7, 8)
    println("Answer is: $ans")
}

// We used vararg type of parameters
fun alternativeSum(vararg nums: Int): Int {
    var sum1 = 0
    var sum2 = 0
//    for(i in 0 until nums.size step 2)
//        sum1 += nums[i]
//
//    for(i in 1 until nums.size step 2)
//        sum2 += nums[i]

    // can use (nums.indices) as well instead of setting the range
    for(i in 0 until nums.size) {
        if(i%2 == 0)
            sum1 += nums[i]
        if(i%2 == 1)
            sum1 -= nums[i]
    }

//    val ans = sum1 - sum2
    return sum1
}