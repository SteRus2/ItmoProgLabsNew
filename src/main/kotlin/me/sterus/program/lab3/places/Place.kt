package me.sterus.program.lab3.places

import me.sterus.program.lab3.OptionShowable
import me.sterus.program.lab3.attributes.Attribute
import me.sterus.program.lab3.attributes.GenderCase
import java.lang.StringBuilder
import java.util.Objects

abstract class Place(
    val name: String,
    protected val gender: GenderCase = GenderCase.MALE,
    val attr: ArrayList<Attribute> = ArrayList()
) :
    OptionShowable {
    constructor(name: String, attr: ArrayList<Attribute>) : this(name) {
        this.attr.addAll(attr)
    }

    override fun getDescription(): String {
        class DescriptionBuilder(val attrs: ArrayList<Attribute>){
            val description = StringBuilder()
            fun buildDef() : String {
                for (i in this.attrs) {
                    description.append(i.attr()).append(", ")
                }
                description.delete(description.length - 2, description.length)
                return description.toString()
            }
        }
        if (this.attr.isEmpty()) {
            return "Нет атрибутов"
        }
        val mainBuilder = DescriptionBuilder(this.attr)
        return mainBuilder.buildDef()
    }

    fun bePlace(attr: Attribute) {
        print("%s - было %s место, где: ".format(name, attr.attr()))
    }

    fun getOptions(gender: GenderCase): String {
        return gender.attr() + getDescription()
    }

    override fun toString(): String {
        return "{%s - name: %s, gender: %s, attr: %s}".format(javaClass, name, gender.toString(), attr.toString())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (javaClass != other.javaClass) return false
        val otherObject = other as Place
        return this.name.equals(otherObject.name)
                && this.attr.equals(otherObject.attr)
                && this.gender.equals(otherObject.gender)
    }

    override fun hashCode(): Int {
        return Objects.hash(name, gender, attr)
    }
}