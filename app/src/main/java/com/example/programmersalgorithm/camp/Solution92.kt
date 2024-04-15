package com.example.programmersalgorithm.camp

//프로세스

fun main() {
    val testSol = Solution92()
    val testArray = intArrayOf(1,1,9,1,1,1)
    val testLocation = 0

    println(testSol.solution(testArray, testLocation))
}
class Solution92 {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val prioritiesList = priorities.mapIndexed{ i, c ->
            i to c
        }.toMutableList()

        var max = prioritiesList.maxOf { it.second }

        while (true) {
            if (prioritiesList[0].second == max) {
                if (prioritiesList[0].first == location) {
                    answer++
                    break
                } else {
                    answer++
                    prioritiesList.removeAt(0)
                    max = prioritiesList.maxOf { it.second }
                }
            } else {
                prioritiesList.add(prioritiesList[0])
                prioritiesList.removeAt(0)
            }
        }

        return answer
    }
}