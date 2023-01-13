package me.sterus.program.lab3.exceptions

import me.sterus.program.lab3.entities.Pillar

class NoHookException(pillar: Pillar, text: String = "No hook on pillar: ${pillar.getName()}") : Exception(text)