fun main() {
    val myArrays = arrayOf("Apple", "Mango", "Cherry")
    val numArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    numArray[2] = 6

    println(myArrays[2])
    println()

    // To print the entire array we need to use for loop
    for(i in numArray) {
        println(i)
    }

}