package me.sterus.program.lab3.attributes

enum class PlaceAndDirections(private val location: String) : Attribute {
    CENTRAL("По центру"),
    LEFT("Слева"),
    RIGHT("Сверху"),
    UP("Сверху"),
    DOWN("Снизу");

    override fun attr(): String {
        return location
    }
}