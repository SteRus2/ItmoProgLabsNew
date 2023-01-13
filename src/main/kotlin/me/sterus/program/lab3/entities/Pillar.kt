package me.sterus.program.lab3.entities

import me.sterus.program.lab3.OptionShowable
import me.sterus.program.lab3.attributes.Attribute
import me.sterus.program.lab3.attributes.GenderCase
import me.sterus.program.lab3.attributes.PlaceAndDirections
import me.sterus.program.lab3.attributes.Size
import me.sterus.program.lab3.places.Place
import java.lang.StringBuilder
import java.util.Objects

class Pillar : OptionShowable {
    private val name: String
    private val place: Place
    private val attrs: ArrayList<Attribute>
    private val gender: GenderCase = GenderCase.MALE
    var hook: Hook? = null

    constructor(name: String, place: Place, attrs : ArrayList<Attribute>, hookNumber: Int){
        this.name = name
        this.place = place
        this.attrs = attrs
        this.hook = Hook(hookNumber, Size.BIG)
    }
    constructor(name: String, place: Place, attrs : ArrayList<Attribute>){
        this.name = name
        this.place = place
        this.attrs = attrs

    }
    constructor(name: String, place: Place, hookNumber: Int){
        this.name = name
        this.place = place
        attrs = ArrayList()
        this.hook = Hook(hookNumber, Size.BIG)
    }
    constructor(name: String, place: Place){
        this.name = name
        this.place = place
        attrs = ArrayList()
    }
    fun getName() = name

    override fun getDescription() : String {
        val description = StringBuilder()

        if (this.attrs.isEmpty()){
            return "Нет атрибутов"
        }
        for (i in this.attrs) {
            description.append(i.attr()).append(", ")
        }
        description.delete(description.length - 2, description.length)
        return description.toString()

    }

    fun stay(direct: PlaceAndDirections){
        println("Столб (%s), %s, стоял по местоположению: %s, у места: %s".format(name, gender.attr() + getDescription(), direct.attr(), place.name))
    }

    override fun hashCode(): Int {
        return Objects.hash(name, place, gender, attrs)
    }

    override fun toString(): String {
        return "{%s - name: %s, place: %s, attrs: %s, gender: %s}".format(javaClass, name, place.toString(), attrs.toString(), gender.toString())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (javaClass != other.javaClass) return false
        val otherObject = other as Pillar
        return this.name == otherObject.name
                && this.attrs == otherObject.attrs
                && this.gender == otherObject.gender
    }

    inner class Hook(val num: Int, val size: Size){
        fun printOwner(){
            println("Крюк под номером $num на столбе: $name")
        }
    }
}