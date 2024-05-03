package com.example.programmersalgorithm.camp

class Solution100 {
    var end = 0
    var add = 0
    fun solution(x: Int, y: Int, n: Int): Int {
        end = y
        add = n
        val answer = bfs(x, 0)
        return if(answer == Int.MAX_VALUE) -1 else answer
    }

    fun bfs(x: Int, count: Int): Int {
        if (x == end) return count

        val result1 = x * 2
        val result2 = x * 3
        val result3 = x + add
        val newCount = count + 1

        return minOf(
            if (result1 <= end) bfs(result1, newCount) else Int.MAX_VALUE,
            if (result2 <= end) bfs(result2, newCount) else Int.MAX_VALUE,
            if (result3 <= end && add != 0) bfs(result3, newCount) else Int.MAX_VALUE
        )
    }
}
