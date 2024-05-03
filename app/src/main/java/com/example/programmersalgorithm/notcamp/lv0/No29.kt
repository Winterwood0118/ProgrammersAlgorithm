package com.example.programmersalgorithm.notcamp.lv0

// 수열과 구간 쿼리 2
class No29 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        queries.forEach { c ->
            val sliced = arr.slice(c[0]..c[1])
            answer += sliced.sorted().firstOrNull { it > c[2] } ?: -1
        }
        return answer
    }
}