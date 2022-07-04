package Classes

fun main() {

    var list = mutableListOf<Int>(1, 2, 3, 4, 5)
    var array = arrayOf(1, 2, 3, 4, 5)

    printList(list, list.size)
    printList(array, array.size)
}

// Function to print alternative elements i.e first -> last, second -> second-last... so on
fun printList(list: List<Int>, size: Int) {
    var s = 0
    var e = size-1
    while(s <= e) {
        if(s == e) {
            println(list[s])
            break
        }
        println(list[s])
        s++
        println(list[e])
        e--
    }

    println()
}

// Overloading the above function, and passing array as parameter instead of list
fun printList(array: Array<Int>, size: Int) {
    var s = 0
    var e = size-1
    while(s <= e) {
        if(s == e) {
            println(array[s])
            break
        }
        println(array[s])
        s++
        println(array[e])
        e--
    }
}