package me.sterus.program.lab3.attributes

enum class GenderCase(private val genderNoun: String) : Attribute {
    MALE("который обладал свойствами: "),
    FEMALE("которая обладала свойствами: "),
    NEUTER("которое обладало свойствами: ");

    override fun attr(): String {
        return genderNoun
    }
}