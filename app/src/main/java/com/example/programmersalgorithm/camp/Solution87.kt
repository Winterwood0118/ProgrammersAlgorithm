package com.example.programmersalgorithm.camp

import kotlin.math.max

//n^2 배열 자르기

fun main() {
    val testN = 3
    val testLeft = 2L
    val testRight = 5L

    Solution87().solution(4, 7, 14)
}

class Solution87 {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var low = (left / n).toInt() + 1
        var culumn = (left % n).toInt() + 1
        val gap = (right - left).toInt() + 1
        val answer = Array(gap) {
            if (culumn > n) {
                low++
                culumn = 1
            }
            culumn++
            max(low, culumn - 1)
        }.toIntArray()
        return answer
    }

}