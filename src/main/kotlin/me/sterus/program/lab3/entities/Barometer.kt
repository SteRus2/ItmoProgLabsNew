package me.sterus.program.lab3.entities

import me.sterus.program.lab3.Bowable
import me.sterus.program.lab3.OptionShowable
import me.sterus.program.lab3.attributes.Attribute
import me.sterus.program.lab3.attributes.GenderCase
import me.sterus.program.lab3.exceptions.NoHookException
import java.lang.StringBuilder
import kotlin.jvm.Throws

class Barometer : OptionShowable, Bowable {
    private val name: String
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
    @Throws(NoHookException::class)
    fun bangle(pillar: Pillar){
        if (pillar.hook == null){
            throw NoHookException(pillar)
        }
        this.place = pillar
        println("Барометр (%s), %s, повис на столбе %s".format(name, gender.attr() + getDescription(), pillar.getName()))
    }

    override fun makeDefinition(): String {
        return name
    }

    override fun toString(): String {
        return "{%s - name: %s, place: %s, attr: %s, gender: %s}".format(javaClass, name, place.toString(), attrs.toString(), gender.toString())
    }

}