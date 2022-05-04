package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun generates_numbers() {
        val dice=Dice(6)
        val myRoll=dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", myRoll in 1..6)
    }
}
