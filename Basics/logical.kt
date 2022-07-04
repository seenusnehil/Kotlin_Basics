fun main() {

//    var x = 5
//    var y = 5
//
//    var a = 6
//    var b = 10
//
//    println(!(((x == y || a == b) && a > y)))

    val result = (3 > 4 || 4 > 3 && 4 <= 4)
    println(result)

    // Homework

    val bool = true
    val x = 9
    val y = 3
    val z = 9

    val exp = !(x != z) && bool || z > (x+y) && (!bool || y < z)
    println(result)
}