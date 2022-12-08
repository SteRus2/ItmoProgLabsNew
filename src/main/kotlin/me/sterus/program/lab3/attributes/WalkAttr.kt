package me.sterus.program.lab3.attributes

enum class WalkAttr(private val walkType: String) : Attribute {
    SILENT("Молча"),
    LOUDLY("Громко"),
    SMW("Туда-сюда");
    override fun attr(): String {
        return walkType
    }
}