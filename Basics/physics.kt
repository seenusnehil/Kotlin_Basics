class physics
    (val distance: Double,
     val speed: Double,
){

        init {
            println("This spaceship have a speed of:$speed lt yrs per hr, which need to travel: $distance ")

        }

    fun Time() = distance/speed
}