package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.Attribute
import me.sterus.program.lab3.attributes.GenderCase

class Bush (name: String, private val place: Place, attrs: ArrayList<Attribute> = ArrayList(), gender: GenderCase = GenderCase.MALE) : Greens(name, attrs){
    fun surround(greens: Greens) {
        println("Кустарник (%s), %s, окружал место: %s".format(name, getOptions(gender), greens.name))
    }

    override fun toString(): String {
        return "{%s - name: %s, place: %s, attr: %s, gender: %s}".format(javaClass, name, place.toString(), attr.toString(), gender.toString())
    }
}