package Classes

fun main() {

    //randomRectangle is a function defined in companion object, so it cannot be instantiated
    // So we need to directly access randomRectangle function of the companion object in the class
    // rectProperties

    // we cannot use this as follows:
    // var rect = rectProperties()
    // car myRect = rect.randomRectangle  ->  this is not valid as we cannot access objects from objects

    var rectangle = rectProperties.randomRectangle()
}