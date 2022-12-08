package me.sterus.program.lab3

import me.sterus.program.lab3.attributes.*
import kotlin.math.sign

fun main(){
    val island = Island("Остров")
    val lawn = Lawn("Лужайка", island, ArrayList(listOf(Colors.GREEN, LawnAttr.FLAT)))
    lawn.spreadOut(PlaceAndDirections.CENTRAL)
    val bush = Bush("Кустарник", island, ArrayList(listOf(BushAttr.FLOWERING)))
    bush.surround(lawn)
    val mainGroup = Creatures("Хатифнатты")
    mainGroup.goingTo(PlaceAttr.SECRET, lawn, Time.ONCEAYEAR, Seasons.SUMMER)
    mainGroup.showUp(300)
    mainGroup.waitFor(450, NumberAttr.ABOUT)
    val grass = Grass("Трава", ArrayList(), lawn)
    mainGroup.walk(WalkAttr.SILENT, grass)
    mainGroup.bow(BowAttr.CEREMONIALLY)
    val pillar = Pillar("Столб", lawn, ArrayList(listOf(Size.HIGH, Colors.BLUE)))
    pillar.stay(PlaceAndDirections.CENTRAL)
    val barometer = Barometer("Барометр", ArrayList(listOf(Size.BIG)))
    barometer.bangle(pillar)
    mainGroup.bowTo(barometer, BowAttr.LOW)
    val hem = Character("Хемуль")
    val forest = Forest("Лес", ArrayList(listOf(Flower("Цветы", listOf(FlowerAttr.RARE, FlowerAttr.MOTTLED, FlowerAttr.NOTCOUNTY)), Flower("Соцветия", listOf(
        FlowerAttr.HEAVY, FlowerAttr.GLASS, FlowerAttr.WHITE)), Flower("Чудо-цветы", listOf(FlowerAttr.DICOTS, FlowerAttr.BLACK)), Flower("Венчики", listOf(
        FlowerAttr.MALINEBLACK, FlowerAttr.CROWN)))))
    hem.walk(forest)
    hem.pickUpFlowers(forest)
    hem.missBeaut()
    hem.count(Flower("Лепестки-тычинки", listOf(FlowerAttr.BEAUTIFUL)))
    hem.mutter("Это будет номер двести девятнадцать в моем гербарии")
    val pillar1 = Pillar("1234", forest, ArrayList(listOf(Size.BIG, Size.HIGH)))
    val pillar2 = Pillar("1234", forest, ArrayList(listOf(Size.BIG, Size.HIGH)))
    println(pillar1.hashCode())
    println(pillar2.hashCode())
    println(pillar1.equals(pillar2))
    println(pillar1.toString())
    println(forest.toString())
    println(hem.toString())
}
