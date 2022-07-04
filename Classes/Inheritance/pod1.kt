package Classes.Inheritance

class pod1 (
    var ID: Int,
    var location: String
        ): HumanRace("Jupiter 3"){
    init {
        println("This is Pod $ID, and we're located at $location")
    }

}