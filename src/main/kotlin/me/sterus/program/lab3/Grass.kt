package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.Attribute

class Grass(name: String, attrs: ArrayList<Attribute>, val parent: Lawn) : Greens(name, attrs)