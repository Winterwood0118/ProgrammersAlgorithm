package com.example.programmersalgorithm.camp

import kotlin.math.min

//H-index

fun main() {
    val sol = Solution86()
    val test = intArrayOf(3, 0, 6, 1, 5)
    val test2 = intArrayOf(1, 10, 11)
    val test3 = intArrayOf(0, 0, 0, 0, 0)
    println(sol.solution(test3))
}


class Solution86 {
    fun solution(citations: IntArray): Int {
        var answer = 0

        val citationsGroup = citations
            .groupBy { it }
            .map { (k, v) -> k to v.count() }
            .sortedByDescending { it.first }

        for (i in citationsGroup){
            answer += i.second
            if(answer > i.first) {
                answer -= i.second
                break
            }
        }

        return answer
    }
}