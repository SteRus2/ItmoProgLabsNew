package me.sterus.program.lab3.attributes

enum class NumberAttr(private val attr: String) : Attribute {
    ABOUT("Примерно"),
    EQUAL("Ровно");
    override fun attr(): String {
        return attr
    }
}