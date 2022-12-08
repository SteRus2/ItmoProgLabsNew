package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.Attribute
import me.sterus.program.lab3.attributes.GenderCase
import me.sterus.program.lab3.attributes.PlaceAndDirections
import java.lang.StringBuilder

class Pillar : OptionShowable {
    val name: String
    private val place: Place
    private val attrs: ArrayList<Attribute>
    private val gender: GenderCase = GenderCase.MALE
    constructor(name: String, place: Place, attrs : ArrayList<Attribute>){
        this.name = name
        this.place = place
        this.attrs = attrs
    }
    constructor(name: String, place: Place){
        this.name = name
        this.place = place
        attrs = ArrayList()
    }

    override fun getDescription() : String {
        if (this.attrs.isEmpty()){
            return "Нет атрибутов"
        }
        val description = StringBuilder()
        for(i in this.attrs){
            description.append(i.attr()).append(", ")
        }
        description.delete(description.length - 2, description.length)
        return description.toString()
    }

    fun stay(direct: PlaceAndDirections){
        println("Столб (%s), %s, стоял по местоположению: %s, у места: %s".format(name, gender.attr() + getDescription(), direct.attr(), place.name))
    }

}