fun main() {
//     var array = arrayOf(1, 2, 3, 4)
//    var list = listOf(1, 2, 3, 4)   // This kind of list is immutable
//
//    array[2] = 5
//
//    // Since the list we defined is immutable, we cannot change its elements
//    //list[2] = 6
//
//    // Inorder to create a mutable list, we use
//    // mutablelistOf function
//
//    val lists = mutableListOf(1, 2, 3, 4)
//    lists[2] = 9
//
//    // we can change the size of the list at runtime
//    lists.add(5)
//    println(lists)   // And we can also print the entire list just by using simple println function
//
//    lists.remove(4)    // Helps to remove a particular element
//    lists.removeAt(3)    // Helps to remove element at a particular index
//    println(lists)

    // This declaration is used when we need to create an empty list
//    val list = mutableListOf<Int>()
//    for(i in 1..10) {
//        var x = readLine()?.toInt()
//        if(x != null) {
//            list.add(x)
//        }
//    }
//    println(list)

//    Homework 1: Print list is reverse order
//    var lists = mutableListOf<Int>()
//
//    println("Enter 5 numbers: ")
//    for(i in 1..5) {
//        val x = readLine()?.toInt()
//        if(x != null) {
//            lists.add(x)
//        }
//    }
//
//    println("The 5 numbers in reverse order are: ")
//    for(i in lists.reversed()) {
//        println(i)
//    }

    // Homework 2: Print Fibonacci numbers in a list
    val myList = mutableListOf(0, 1)

    println("Enter a value greater than 1: ")
    val num = readLine()?.toInt()

    if (num != null) {
        for(i in 2..num-1) {
            myList.add(myList[i-2] + myList[i-1])
        }
    }
    println(myList)
}

