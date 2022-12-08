package me.sterus.program.lab3.attributes

enum class FlowerAttr(private val attr: String) : Attribute {
    BEAUTIFUL("Красивые"),
    RARE("Редкие"),
    COUNTRY("Из Муми-Доля"),
    NOTCOUNTY("не из Муми-Доля"),
    HEAVY("Тяжелые"),
    WHITE("Серебристо-белые"),
    DICOTS("Двудольные"),
    BLACK("Cумеречных тонов"),
    MALINEBLACK("Малиново-черные"),
    MOTTLED("Пестревшие"),
    GLASS("Словно отлитые из стекла"),
    CROWN("Похожие на корону");

    override fun attr(): String {
        return attr
    }
}