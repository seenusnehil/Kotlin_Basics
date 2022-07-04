package Classes
// In kotlin by-default all the classes are final
// so, you can't inherit them directly
// Inorder to inherit them, you need to make it "open"

// This class acts as a super class for the other shape classes defined
//open class ShapesInheritance(
//    var name: String
//) {
//    init {
//        println("This is a super class")
//    }
//
//    fun changeName(newName: String) {
//        name = newName
//    }
//
//}

abstract class ShapesInheritance(
    var name: String
) {

    constructor(name: String,  vararg dimensions: Double): this(name)

    init {
        println("This is a super class")
    }

    abstract fun area(): Double
    abstract fun peri(): Double

    fun changeName(newName: String) {
        name = newName
    }

}