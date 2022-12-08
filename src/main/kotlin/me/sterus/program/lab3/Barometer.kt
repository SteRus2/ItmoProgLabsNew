package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.Attribute
import me.sterus.program.lab3.attributes.GenderCase
import java.lang.StringBuilder

class Barometer : OptionShowable, Bowable{
    val name: String
    private val attrs: ArrayList<Attribute>
    private val gender: GenderCase = GenderCase.MALE
    private var place: Pillar? = null
    constructor(name: String){
        this.name = name
        this.attrs = ArrayList()
    }
    constructor(
        name: String,
        attrs: ArrayList<Attribute>,
        place: Pillar
    ) {
        this.name = name
        this.attrs = attrs
        this.place = place
    }
    constructor(
        name: String,
        attrs: ArrayList<Attribute>,
    ) {
        this.name = name
        this.attrs = attrs
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
    fun bangle(pillar: Pillar){
        this.place = pillar
        println("Барометр (%s), %s, повис на столбе %s".format(name, gender.attr() + getDescription(), pillar.name))
    }

    override fun makeDefinition(): String {
        return name
    }

    override fun toString(): String {
        return "{%s - name: %s, place: %s, attr: %s, gender: %s}".format(javaClass, name, place.toString(), attrs.toString(), gender.toString())
    }

}