package com.example.programmersalgorithm.camp

class Solution76 {
    fun solution(s: String): String = s.split(" ").map {
        it.map { it }.mapIndexed { i, c ->
            if (i == 0) c.toUpperCase()
            else c.toLowerCase()
        }.joinToString("")
    }.joinToString(" ")
}