package me.sterus.program.lab3.attributes

enum class LawnAttr(private val attr: String) : Attribute {
    FLAT("Ровный"),
    CURVE("Кривой");

    override fun attr(): String {
        return attr
    }
}