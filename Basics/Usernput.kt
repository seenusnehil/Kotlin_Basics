fun main() {
//    val userInput = readLine()
//
//    // ? is a check for the compiler to check
//    // whether the string is a null or not
//    println(userInput?.toUpperCase())
//    if(userInput != null)
//        println(userInput.toInt() - 8)

    // Homework25
    println("Enter your age:")
    var age = readLine()
     if(age != null) {
         if(age.toInt() < 18)    // toInt() is used to convert the default string variables to integer type
             println("You're yet not an adult")
         else if(age.toInt() in 18..49)      // in keyword helps us to check values within a range
             println("Hey, you're an adult")
         else
             println("You're really old")
     }


    println("What is your name?")
    println("Name: ")
    var name = readLine()

    println("My name is: $name")
}