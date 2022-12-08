package me.sterus.program.lab3.attributes

enum class Size(private val attr: String) : Attribute {
    HIGH("Высокий"),
    SHORT("Низкий"),
    BIG("Большой"),
    SMALL("Маленький");
    override fun attr(): String {
        return attr
    }
}