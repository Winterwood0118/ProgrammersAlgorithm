package com.example.programmersalgorithm.notcamp.lv0
// 수열과 구간 쿼리 4
class No30 {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        queries.forEach { q ->
            (q[0]..q[1]).forEach {
                if (it % q[2] == 0) arr[it] ++
            }
        }
        return arr
    }
}