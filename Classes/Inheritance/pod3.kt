package Classes.Inheritance

class pod3(
    var ID: Int,
    var location: String
): HumanRace("Jupiter 1") {
    init {
        println("This is pod $ID and we're located at $location")
    }
}