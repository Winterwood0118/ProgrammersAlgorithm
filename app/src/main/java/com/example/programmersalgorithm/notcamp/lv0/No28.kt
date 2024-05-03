package com.example.programmersalgorithm.notcamp.lv0
// 수열과 구간 쿼리 3
class No28 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer: IntArray = arr
        queries.forEach {
            val current1 = arr[it[0]]
            val current2 = arr[it[1]]
            answer[it[0]] = current2
            answer[it[1]] = current1
        }
        return answer
    }
}