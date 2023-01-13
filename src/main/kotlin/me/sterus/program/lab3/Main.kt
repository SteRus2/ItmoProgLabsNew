package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.*
import me.sterus.program.lab3.effects.Haze
import me.sterus.program.lab3.effects.Sun
import me.sterus.program.lab3.entities.*
import me.sterus.program.lab3.exceptions.NoHookException
import me.sterus.program.lab3.exceptions.OutOfBoundsPetalsValueExc
import me.sterus.program.lab3.places.*

fun main(){
    val mumiFather = Character("Муми-папа")
    val island = Island("Остров")
    mumiFather.angle(island)

    Sun.happen()
    Haze.happen()

    val lawn = Lawn("Лужайка", island, ArrayList(listOf(Colors.GREEN, LawnAttr.FLAT)))
    lawn.spreadOut(PlaceAndDirections.CENTRAL)

    val bush = Bush("Кустарник", lawn, ArrayList(listOf(BushAttr.FLOWERING)))
    bush.surround(lawn)

    val mainGroup = Creatures("Хатифнатты").apply {
        goingTo(PlaceAttr.SECRET, lawn, Time.ONCEAYEAR, Seasons.SUMMER)
    }
    mainGroup.showUp(300)
    mainGroup.waitFor(450, NumberAttr.ABOUT)

    val grass = Grass("Трава", ArrayList(), lawn)
    mainGroup.walk(WalkAttr.SILENT, grass)
    mainGroup.bow(BowAttr.CEREMONIALLY)

    val pillar = Pillar("Столб", lawn, ArrayList(listOf(Size.HIGH, Colors.BLUE)))
    pillar.stay(PlaceAndDirections.CENTRAL)
    Size.HIGH.ordinal
    val barometer = Barometer("Барометр", ArrayList(listOf(Size.BIG)))
    try {
        barometer.bangle(pillar)
    } catch (e: NoHookException){
        println("----Exception----: $e.message")
    }
    mainGroup.bowTo(barometer, BowAttr.LOW)

    val hem = Character("Хемуль")
    val forest = Forest("Лес", ArrayList(listOf(
        Flower("Цветы", listOf(FlowerAttr.RARE, FlowerAttr.MOTTLED, FlowerAttr.NOTCOUNTY), 3), Flower("Соцветия", listOf(
        FlowerAttr.HEAVY, FlowerAttr.GLASS, FlowerAttr.WHITE), 5), Flower("Чудо-цветы", listOf(FlowerAttr.DICOTS, FlowerAttr.BLACK), 1), Flower("Венчики", listOf(
        FlowerAttr.MALINEBLACK, FlowerAttr.CROWN), 6)
    )))

    hem.walk(forest)
    hem.pickUpFlowers(forest)
    hem.missBeaut()
    val mainFlower = Flower("Красивые цветы", listOf(FlowerAttr.BEAUTIFUL), 15)
    hem.count(object : Countable{
        override fun getDef(): String {
            return  "Цветы (Лепестки-тычинки), которые обладали свойствами: Красивые"
        }
    })
    try {
        mainFlower.flyAwayPetals(16)
    } catch (e: OutOfBoundsPetalsValueExc){
        println("----Exception----: $e.message")
    }
    println(mainFlower.getPetalsValue())
    hem.mutter("Это будет номер двести девятнадцать в моем гербарии")


    /*val pillar1 = Pillar("1234", forest, ArrayList(listOf(Size.BIG, Size.HIGH)))
    val pillar2 = Pillar("1234", forest, ArrayList(listOf(Size.BIG, Size.HIGH)))
    val bush1 = Bush("namw1", grass, ArrayList(listOf(Size.BIG)))
    val p1 = Flower("Лепестки-тычинки1", listOf(FlowerAttr.BEAUTIFUL), 20)
    val p2 = Flower("Лепестки-тычинки2", listOf(FlowerAttr.BEAUTIFUL), 15)
    println(pillar1.hashCode())
    println(pillar2.hashCode())
    println(pillar1 == pillar2)
    println(pillar1.toString())
    println(forest.toString())
    println(hem.toString())*/

}
