package com.example.programmersalgorithm.camp

//타겟 넘버
fun main() {
    val testArray = intArrayOf(1, 1, 1, 1, 1)
    val testTarget = 3

    Solution94().solution(testArray, testTarget)
}

class Solution94 {
    var answer = 0
    lateinit var number: IntArray
    lateinit var visit: BooleanArray
    fun solution(numbers: IntArray, target: Int): Int {
        number = numbers
        visit = BooleanArray(numbers.size) { true }
        for (i in number.indices) {
            dfs(i, target)
        }
        println(answer)
        return answer
    }

    fun dfs(now: Int, target: Int) {
        visit[now] = false

        for (i in now..number.lastIndex) {
            if (visit[i]) {
                dfs(i, target)
            }
        }

        if (now + 1 == number.size) {
            checkResult(target)
        }

        visit[now] = true

        if (now + 1 == number.size) {
            checkResult(target)
        }
    }

    fun checkResult(target: Int) {
        println(visit.toList())
        var result = 0
        for (i in number.indices) {
            if (visit[i]) result += number[i]
            else result -= number[i]
        }
        if (result == target) answer++
    }
}
