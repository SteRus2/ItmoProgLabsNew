package me.sterus.program.lab3.attributes

enum class Time (private val time: String) : Attribute {
    ONCEAYEAR("Раз в год");
    override fun attr(): String {
        return time
    }
}