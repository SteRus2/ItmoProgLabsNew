package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.Count
import java.util.ArrayList

object Dictionary{
    private val statementsAlone = ArrayList(listOf("собирался", "явился", "ожидал", "ходил", "расскланивался", "кланялся"))
    private val statementsMany = ArrayList(listOf("собирались", "явились", "ожидали", "ходили", "расскланивались", "кланялись"))
    fun getState(number: Int, count: Count) : String{
        return when (count){
            Count.ALONE -> statementsAlone[number]
            Count.MANY -> statementsMany[number]
        }
    }
}