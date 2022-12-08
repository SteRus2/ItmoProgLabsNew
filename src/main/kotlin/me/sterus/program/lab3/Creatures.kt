package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.*

open class Creatures(val name: String, private val count: Count = Count.MANY) : Amountable {

    fun goingTo(attr: PlaceAttr, place: Place, time: Time, season: Seasons){
        println("%s (%s) %s с частотой: %s, в сезон: %s в месте: %s, которое было: %s".format(getAmount(), name, Dictionary.getState(0, count),time.attr(), season.attr(),place.name, attr.attr()))
    }
    fun showUp(number: Int){
        println("%s %s уже в количестве: %d".format(getAmount(), Dictionary.getState(1, count),number))
    }
    fun waitFor(number: Int, numberAttr: NumberAttr){
        println("%s %s еще %s %d".format(getAmount(), Dictionary.getState(2, count),numberAttr.attr(), number))
    }
    fun walk(walkAttr: WalkAttr, place: Place){
        println("%s (%s) %s %s по месту: %s".format(getAmount(), name, walkAttr.attr(), Dictionary.getState(3, count), place.name))
    }
    fun walk(place: Place){
        println("%s (%s) %s по месту: %s".format(getAmount(), name, Dictionary.getState(3, count), place.name))
    }
    fun bow(type: BowAttr){
        println("%s (%s) %s %s друг с другом".format(getAmount(), name, type.attr(), Dictionary.getState(4, count)))
    }
    fun bowTo(bowable: Bowable){
        println("%s (%s) %s объекту %s".format(getAmount(), name, Dictionary.getState(5, count), bowable.makeDefinition()))
    }
    fun bowTo(target: Bowable, type: BowAttr){
        println("%s (%s) %s %s объекту %s".format(getAmount(), name, type.attr(), Dictionary.getState(5, count), target.makeDefinition()))
    }

    override fun getAmount(): String {
        return if (count == Count.MANY) Pronouns.PRONOUN1 else Pronouns.PRONOUN2
    }

}