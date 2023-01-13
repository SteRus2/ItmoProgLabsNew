package me.sterus.program.lab3.places

import me.sterus.program.lab3.attributes.Attribute
import me.sterus.program.lab3.attributes.GenderCase

class Bush(
    name: String,
    private val place: Greens,
    // todo
    attrs: ArrayList<Attribute> = ArrayList()
) : Greens(name, attrs) {
    fun surround(greens: Greens) {
        println("Кустарник (%s), %s, окружал место: %s".format(name, getOptions(gender), greens.name))
        println("asd $name")
    }

    override fun toString(): String {
        return "{%s - name: %s, place: %s, attr: %s, gender: %s}".format(
            javaClass,
            name,
            place.toString(),
            attr.toString(),
            gender.toString()
        )
    }
}