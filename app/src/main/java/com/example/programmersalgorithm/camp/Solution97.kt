package com.example.programmersalgorithm.camp

import kotlin.math.pow

// 모음 사전
fun main() {
    println(Solution97().solution("AAAAE"))
    //asd
}

class Solution97 {
    fun solution(word: String): Int = word
            .split("")
            .map {
                when (it) {
                    "A" -> 1
                    "E" -> 2
                    "I" -> 3
                    "O" -> 4
                    "U" -> 5
                    else -> 0
                }
            }
            .filter { it != 0 }
            .run {
                var answer = 0
                forEachIndexed { idx, value ->
                    var temp = 0
                    repeat(5 - idx) {
                        temp += 5.0.pow(it).toInt()
                    }
                    temp *= (value - 1)
                    answer += temp + 1
                }
                answer
            }
}