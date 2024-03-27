package com.example.programmersalgorithm.camp


// 카펫

fun main() {
    println(Solution79().solution2(10, 2).toList())
}
class Solution79 {
    fun solution(brown: Int, yellow: Int): IntArray {
        val area = brown + yellow
        val measureList = mutableListOf<Pair<Int, Int>>()
        for (i in 1..Math.sqrt(area.toDouble()).toInt()) {
            if (area % i == 0) {
                measureList.add(i to area / i)
            }
        }
        return measureList.first { 2 * (it.first + it.second - 2) == brown }.run {
            intArrayOf(second, first)
        }
    }

    fun solution2(brown: Int, yellow: Int): IntArray {
        val area = brown + yellow
        return (1..area)
            .first { area % it == 0 && 2 * (area / it + it - 2) == brown }
            .let { intArrayOf(area / it, it) }
    }
}