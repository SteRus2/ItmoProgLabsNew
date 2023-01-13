package me.sterus.program.lab3.exceptions

import me.sterus.program.lab3.entities.Flower

class OutOfBoundsPetalsValueExc(val causeFl: Flower, val testCount: Int, text : String = "Flower (${causeFl.getName()}) does not have enough petals: $testCount") : RuntimeException(text)