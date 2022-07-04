package Classes.Inheritance

open class HumanRace (
    var name: String
        ){
    init {
        println("This is the Resolute reporting... We're heading towards Alpha Centauri")
    }

    fun changeName(newName: String) {
        name = newName
    }
}