package Classes.Inheritance

class pod2 (
    var ID: Int,
    var location: String
    ): HumanRace("Jupiter 2"){
    init {
        println("This is pod $ID and we're located at $location")
    }
}