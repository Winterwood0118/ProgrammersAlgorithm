package com.example.programmersalgorithm.camp

// 귤 고르기
class Solution83 {
    /*    fun solution(k: Int, tangerine: IntArray): Int {
            var answer: Int = 0
            val tangerineGroup =
                tangerine.groupBy { it }.map { it.key to it.value.size }.sortedBy { it.second }
                    .reversed()
            var count = 0
            do {
                count += tangerineGroup[answer].second
                answer++
            } while (count < k)
            println(answer)
            return answer
        }*/
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var count = 0
        tangerine.groupBy { it }
            .map { it.key to it.value.count() }
            .sortedBy { it.second }
            .reversed()
            .forEach {
                count += it.second
                answer++
                if (count >= k) return answer
            }
        return answer
    }
}


fun main() {
    val test = intArrayOf(
        3, 5, 6, 7, 1, 1, 1
    )
    Solution83().solution(4, test)
}