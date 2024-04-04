package com.example.programmersalgorithm.camp
//연속 부분 수열의 합의 개수


fun main() {
    val sol = Solution85()
    val test = intArrayOf(7, 9, 1, 1, 4)

    println(sol.solution(test))
}

class Solution85 {
    fun solution(elements: IntArray): Int {
        val answer = mutableSetOf<Int>()
        val elementsList = elements.toMutableList()
        elementsList.addAll(elementsList)
        for (i in elements.indices) {// 시작 지점 설정
            for (j in 0..elements.lastIndex) { // 길이 설정
                val subsequence = elementsList.subList(i, i + j)
                answer.add(subsequence.sumOf { it })
            }
        }
        return answer.size
    }
}