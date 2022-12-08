package me.sterus.program.lab3.attributes

enum class BowAttr(private val attr : String) : Attribute {
    CEREMONIALLY("Церемонно"),
    LOW("Низко");

    override fun attr(): String {
        return attr
    }
}