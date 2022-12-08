package me.sterus.program.lab3.attributes

enum class BushAttr (private val attr: String) : Attribute {
    FLOWERING("Цветущий"),
    WITHERING("Вянущий");
    override fun attr(): String {
        return attr
    }
}