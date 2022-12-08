package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.Count

class Character(name: String, count: Count = Count.ALONE) : Creatures(name, count) {
    fun pickUpFlowers(forest: Forest){
        println("Он (%s) собирал цветы, они были:".format(name))
        for (i in forest.flowerList){
            pickUpFlower(i)
        }
    }
    private fun pickUpFlower(flower: Flower){
        print("\t")
        println(flower.getDescription())
    }
    fun missBeaut(){
        println("Он (%s) не замечал этой красоты".format(name))
    }

    fun count(countable: Countable){
        println("Он (%s) считал: %s".format(name, countable.getDef()))
    }

    fun mutter(text: String){
        println("Он (%s) бормотал: \"%s\"".format(name, text))
    }

}