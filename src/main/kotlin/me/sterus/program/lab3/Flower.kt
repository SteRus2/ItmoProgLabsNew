package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.FlowerAttr
import java.lang.StringBuilder

class Flower(val name: String, private val options: List<FlowerAttr>) : OptionShowable, Countable {
    override fun getDescription(): String {
        return "Цветы (%s), которые обладали свойствами: %s".format(name, getOptions())
    }
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
}