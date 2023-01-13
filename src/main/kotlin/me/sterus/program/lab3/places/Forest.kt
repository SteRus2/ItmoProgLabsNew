package me.sterus.program.lab3.places

import me.sterus.program.lab3.entities.Flower

class Forest(name: String) : Place(name) {
    val flowerList = ArrayList<Flower>()
    constructor(name: String, flowerList: ArrayList<Flower>) : this(name){
        this.flowerList.addAll(flowerList)
    }

    override fun toString(): String {
        return "{%s - name: %s, attr: %s, gender: %s, flowerList: %s}".format(javaClass, name, attr.toString(), gender.toString(), flowerList.toString())
    }

}