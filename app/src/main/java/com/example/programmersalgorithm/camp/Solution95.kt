package com.example.programmersalgorithm.camp

import kotlin.math.sqrt

fun main() {
    val test = 437674
    val k = 3

    println(test.toString(k)
        .split("0")
        .filter { it != "" }
        .map { sqrt(it.toDouble()).toLong() })
    println(test.toString(k)
        .split("0")
        .filter { it != "" }
        .map { it.toLong() }
        .map { long1 ->
            (2..sqrt(long1.toDouble()).toLong()).count { long1 % it == 0L }
        })
}

class Solution95 {
    fun solution(n: Int, k: Int): Int = n.toString(k)
        .split("0")
        .filter { it != "" }
        .filter { it != "1" }
        .map { it.toLong() }
        .count { long1 ->
            (2..sqrt(long1.toDouble()).toLong()).count { long1 % it == 0L } == 0
        }
}

