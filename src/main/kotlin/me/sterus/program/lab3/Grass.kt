package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.Attribute

class Grass(name: String, attrs: ArrayList<Attribute>, val parent: Lawn) : Greens(name, attrs){
    override fun toString(): String {
        return "{%s - name: %s, attr: %s, parent: %s, gender: %s}".format(javaClass, name, attr.toString(),  parent.toString() ,gender.toString())
    }
}