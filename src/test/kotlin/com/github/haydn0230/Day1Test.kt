package com.github.haydn0230

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.lang.Integer.sum

internal class Day1Test {
    @Test
    fun `check that numbers returned equal 2020`() {
        val input = listOf(
            1721, 979, 366, 299, 675, 1456,
        )


        Day1(input).findMatch()
    }
}
