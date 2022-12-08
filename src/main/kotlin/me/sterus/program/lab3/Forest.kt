package me.sterus.program.lab3

class Forest(name: String) : Place(name) {
    val flowerList = ArrayList<Flower>()
    constructor(name: String, flowerList: ArrayList<Flower>) : this(name){
        this.flowerList.addAll(flowerList)
    }

}