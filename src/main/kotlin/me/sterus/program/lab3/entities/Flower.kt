package me.sterus.program.lab3.entities

import me.sterus.program.lab3.Countable
import me.sterus.program.lab3.OptionShowable
import me.sterus.program.lab3.attributes.Colors
import me.sterus.program.lab3.attributes.FlowerAttr
import me.sterus.program.lab3.exceptions.OutOfBoundsPetalsValueExc
import java.lang.StringBuilder
import java.util.Objects

class Flower(private val name: String, private val options: List<FlowerAttr>, private val petalsValue: Int) : OptionShowable, Countable {
    private val ownPetals = Petals(petalsValue)
    override fun getDescription(): String {
        return "Цветы (%s), которые обладали свойствами: %s".format(name, getOptions())
    }
    fun flyAwayPetals(k: Int){
        if (k > ownPetals.num){
            ownPetals.resumePetals()
            throw OutOfBoundsPetalsValueExc(this, k)
        }
        ownPetals.flyAway(k)
    }
    fun getPetalsValue() = ownPetals.num

    fun getName() = name
    private fun getOptions() : String{
        if (options.isEmpty()){
            return "Нет свойств"
        }
        val local = StringBuilder()
        for (i in options) {
            local.append(i.attr() + ", ")
        }
        local.delete(local.length - 2, local.length)
        return local.toString()
    }

    override fun getDef(): String {
        return getDescription()
    }

    override fun toString(): String {
        return "{%s - name: %s, options: %s".format(javaClass, name, options.toString())
    }

    override fun hashCode(): Int {
        return Objects.hash(name, options)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (javaClass != other.javaClass) return false
        val otherObject = other as Flower
        return this.name.equals(otherObject.name)
                && this.options.equals(otherObject.options)
    }

    class Petals(var num: Int){
        fun flyAway(k: Int){
            println("Где-то улетел лепесток...(и не один)")
            num -= k

        }
        fun resumePetals(){
            num = 0
        }
    }
}