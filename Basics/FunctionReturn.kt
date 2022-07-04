//fun Classes.main() {
//    println("The result is: ${printPow(2, 3)}")
//    println("Result: ${multiply(3, 5)}")
//}
//
//// This function returns a value of type Integer
//fun printPow(base: Int, exponent: Int): Int {
//    var result = 1
//    for(i in 1..exponent) {
//        result *= base
//    }
//    return result
//}
//
//// Syntax :
////fun <fun_name>(parameters): return type
//
//// Another way to define one line return function
//fun multiply(a: Int, b: Int) = a*b

//fun Classes.main()  {
//    val lists = mutableListOf(1, 2, 3)
//    list(lists)
//}
//
//// Passing a list in the function
//fun list(list: List<Int>) {
//    println(list)
//}

// Homework:
fun main() {
    val list = listOf(1, 6, 4, 5, 7, 9, 0, 2)

    val key = readLine()?.toInt()
    if(key != null) {
        val ans = search(list, key)
        println("The number $key is present as index $ans")
    }
}

fun search(list: List<Int>, key: Int) : Int{
    for(i in 0 until list.size-1) {
        if(list[i] == key)
            return i
    }
    return -1
}

// Passing array in a function
//fun Classes.main() {
//    val array = arrayOf(1, 2, 3, 4, 5)
//    print(array)
//}
//
//fun print(array: Array<Int>) {
//    for(i in array) {
//        print("$i ")
//    }
//}
