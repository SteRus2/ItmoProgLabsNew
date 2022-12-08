package me.sterus.program.lab3.attributes

enum class PlaceAttr (private val attr: String) : Attribute {
    STRANGE("Странное"),
    SAFE("Безопасное"),
    SECRET("Тайное");
    override fun attr(): String {
        return attr
    }
}