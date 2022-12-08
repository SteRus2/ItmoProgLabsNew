package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.Attribute
import me.sterus.program.lab3.attributes.GenderCase
import java.lang.StringBuilder

abstract class Place(val name: String, protected val gender: GenderCase = GenderCase.MALE) : OptionShowable {
    private val attr = ArrayList<Attribute>()
    constructor(name: String, attr: ArrayList<Attribute>) : this(name) {
        this.attr.addAll(attr)
    }
    override fun getDescription() : String {
        if (this.attr.isEmpty()){
            return "Нет атрибутов"
        }
        val description = StringBuilder()
        for(i in this.attr){
            description.append(i.attr()).append(", ")
        }
        description.delete(description.length - 2, description.length)
        return description.toString()
    }
    fun bePlace(attr: Attribute){
        print("%s - было %s место, где: ".format(name, attr.attr()))
    }

    fun getOptions(gender: GenderCase): String {
        return gender.attr() + getDescription()
    }
}