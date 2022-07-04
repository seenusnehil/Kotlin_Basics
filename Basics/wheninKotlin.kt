fun main() {

    val age = readLine()?.toInt()

//    if(age in 0..3) {
//        println("You're an infant")
//    }
//    else if(age in 4..12) {
//        println("You're a young kid")
//    }
//    else if(age in 13..17) {
//        println("You're a teenager")
//    }
//    else if(age == 18) {
//        println("You're finally 18")
//    }
//    else if(age in 19..30) {
//        println("You're a young adult")
//    }
//    else if(age in 31..65) {
//        println("You're an adult")
//    }
//    else {
//        println("You're an old man!")
//    }

    // When function is a shorter alternative for if else condition
    // When is used only when you have all the comparisons based on a single variable
    when(age) {

        in 0..3 -> println("You're an infant")   // When you need to check it within a range
        in 4..12 -> println("You're a yound kid")
        in 13..17 -> println("You're a teenager")
        18 -> println("You're finally 18")     // When you have to compare it with only a single value
        in 19..30 -> println("You're a young adult")
        in 31..65 -> println("You;re an adult")
        else -> println("You're really old")
    }

    //Homework: Checking the region of the user and greeting them accordingly

    println("Hey, where are you from?")
    val region = readLine()

    when(region) {
        "India" -> println("Namaste")
        "Usa", "usa", "USA" -> println("Hello")      // When you need to check it with multiple values (OR condition)
        "Russia" -> println("Привет")
        "Germany" -> println("Hallo")
        "Pakistan", "UAE", "Bangladesh" -> println("Assalamu alaikum")
        else -> println("Sorry, I don't understand that")
    }
    val x = 8
    if(age == 19 && x == 8) {
        println("Great")
    }

    // So, to translate above if condition with and clause
    // We can do it as follows

    when(age)  {

        18 -> if(x == 8) {      // Way to translate AND condition, as when support comparison of only a single variable
            println("Great")
        }
    }
}