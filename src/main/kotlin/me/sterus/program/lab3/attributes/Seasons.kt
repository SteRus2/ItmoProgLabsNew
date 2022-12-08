package me.sterus.program.lab3.attributes

enum class Seasons (private val season: String) : Attribute {
    WINTER("Зима"),
    SUMMER("Лето"),
    AUTUMN("Осень"),
    SPRING("Весна");
    override fun attr(): String {
        return season
    }
}