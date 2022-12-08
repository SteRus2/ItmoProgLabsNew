package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.Attribute
import me.sterus.program.lab3.attributes.GenderCase
import me.sterus.program.lab3.attributes.PlaceAndDirections

class Lawn(name: String, private val place: Place, attrs: ArrayList<Attribute> = ArrayList(), gender: GenderCase = GenderCase.FEMALE) : Greens(name, attrs){
    fun spreadOut(location: PlaceAndDirections) {
        println("Лужайка (%s), %s, расстилалась по местоположению: %s, у места: %s.".format(name, getOptions(gender), location.attr(), place.name))
    }

    override fun toString(): String {
        return "{%s - name: %s, place: %s, attr: %s, gender: %s}".format(javaClass, name, place.toString(), attr.toString(), gender.toString())
    }

}