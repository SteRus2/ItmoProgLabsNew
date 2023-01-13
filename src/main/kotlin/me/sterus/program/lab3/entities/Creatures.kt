package me.sterus.program.lab3.entities

import me.sterus.program.lab3.Amountable
import me.sterus.program.lab3.Bowable
import me.sterus.program.lab3.attributes.Dictionary
import me.sterus.program.lab3.attributes.*
import me.sterus.program.lab3.places.Place

open class Creatures(private val name: String, private val count: Count = Count.MANY) : Amountable {

    fun getName() = name
    fun goingTo(attr: PlaceAttr, place: Place, time: Time, season: Seasons){
        println("%s (%s) %s с частотой: %s, в сезон: %s в месте: %s, которое было: %s".format(getAmount(), name,
            Dictionary.getState(0, count),time.attr(), season.attr(),place.name, attr.attr()))
    }
    fun showUp(number: Int){
        println("%s %s уже в количестве: %d".format(getAmount(), Dictionary.getState(1, count),number))
    }
    fun waitFor(number: Int, numberAttr: NumberAttr){
        println("%s %s еще %s %d".format(getAmount(), Dictionary.getState(2, count),numberAttr.attr(), number))
    }
    fun walk(walkAttr: WalkAttr, place: Place){
        println("%s (%s) %s %s по месту: %s".format(getAmount(), name, walkAttr.attr(),
            Dictionary.getState(3, count), place.name))
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

    override fun toString(): String {
        return "{%s - name: %s, count: %s}".format(javaClass, name, count.toString())
    }

    override fun hashCode(): Int {
        return 117 * name.hashCode() + 17 * count.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null) return false
        if (javaClass != other.javaClass) return false
        val otherObject = other as Creatures
        return this.name.equals(otherObject.name)
                &&count.equals(otherObject.count)
    }

}