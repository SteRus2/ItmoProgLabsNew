package me.sterus.program.lab3.entities

import me.sterus.program.lab3.Countable
import me.sterus.program.lab3.attributes.Count
import me.sterus.program.lab3.places.Forest
import me.sterus.program.lab3.places.Place

class Character(name: String, count: Count = Count.ALONE) : Creatures(name, count) {
    fun pickUpFlowers(forest: Forest){
        println("Он (%s) собирал цветы, они были:".format(getName()))
        for (i in forest.flowerList){
            pickUpFlower(i)
        }
    }
    private fun pickUpFlower(flower: Flower){
        print("\t")
        println(flower.getDescription())
    }
    fun missBeaut(){
        println("Он (%s) не замечал этой красоты".format(getName()))
    }

    fun count(countable: Countable){
        println("Он (%s) считал: %s".format(getName(), countable.getDef()))
    }

    fun mutter(text: String){
        println("Он (%s) бормотал: \"%s\"".format(getName(), text))
    }
    fun angle(place: Place){
        println("Он (${getName()}) устроился на месте: (${place.name}), чтобы поудить")
    }
}