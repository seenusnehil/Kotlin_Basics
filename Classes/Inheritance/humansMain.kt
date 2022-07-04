package Classes.Inheritance

fun main() {

    var Jupiter1 = pod1(1, "Fortuna B")
    Jupiter1.changeName("Jupiter 1")
    println(Jupiter1.name)

    var Jupiter2 = pod1(1, "Amber planet")
    Jupiter2.changeName("Jupiter 2")
    println(Jupiter1.name)

    var Jupiter3 = pod1(1, "Gas giant")
    Jupiter3.changeName("Jupiter 3")
    println(Jupiter1.name)
}