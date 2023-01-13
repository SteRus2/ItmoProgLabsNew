package me.sterus.program.lab3.places

import me.sterus.program.lab3.attributes.Attribute

class Grass(name: String, attrs: ArrayList<Attribute>, val parent: Lawn) : Greens(name, attrs){
    override fun toString(): String {
        return "{%s - name: %s, attr: %s, parent: %s, gender: %s}".format(javaClass, name, attr.toString(),  parent.toString() ,gender.toString())
    }
    // TODO
    override fun hashCode(): Int {
        return name.hashCode() + attr.hashCode() + parent.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (javaClass != other.javaClass) return false
        val otherObject = other as Grass
        return this.name.equals(otherObject.name)
                && this.attr.equals(otherObject.attr)
    }
}