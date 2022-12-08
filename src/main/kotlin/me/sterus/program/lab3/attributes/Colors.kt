package me.sterus.program.lab3.attributes

enum class Colors(private val color: String) : Attribute {
    GREEN("Зеленый"),
    YELLOW("Желтый"),
    RED("Красный"),
    BLUE("Синий"),
    PINK("Розовый"),
    ORANGE("Оранжевый"),
    PURPLE("Пурпурный"),
    VIOLET("Фиолетовый");

    override fun attr(): String {
        return color
    }
}