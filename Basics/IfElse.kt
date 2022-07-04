fun main() {

//    val x = 9
//    val y = 9
//
//    // Assigning value based upon if else condition
//    val z = if(x+y == 18) 6 else 5
//
//    // Conditional statement in Kotlin
//    if(x > y) {
//        println("x is greater than y")
//    }
//    else if(x < y)
//        println("x is smaller than y")
//    else
//        println("They're equal")
//
//    println(z)

    // Homework
    // So, kotlin is also a case-sensitive language
    val palindrome = "malayalam"

//    if(palindrome == palindrome.reversed())
//        println("yes, it is a palindrome")
//    else
//        println("No, it is not a palindrome")

    var s = 0
    var e = palindrome.length -1

    while(s <= e) {
        if(palindrome[s] == palindrome[e]) {
            s++
            e--
        }
        else {
            println("this is not a palindrome")
            break
        }
    }
    println("This is a palindrome")
}