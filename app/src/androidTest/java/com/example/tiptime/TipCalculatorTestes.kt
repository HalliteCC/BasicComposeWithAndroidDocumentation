package com.example.tiptime

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTestes {

    @Test
    fun calculateTip_20PercentNoRoundUp(){
        val amout = 10.00
        val tip = 20.00

        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amout, tip, false)
        assertEquals(expectedTip, actualTip)
    }
}