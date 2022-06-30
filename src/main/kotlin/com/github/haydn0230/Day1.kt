package com.github.haydn0230

class Day1(val input: List<Int>) {
    fun findMatch(){
        input.associateBy { 2020 - it  }
            .map { if(it.key + it.value == 2020) println(it) }

    }

}
