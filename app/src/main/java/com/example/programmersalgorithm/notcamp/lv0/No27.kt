package com.example.programmersalgorithm.notcamp.lv0

// 수 조작하기 2
class No27 {
    fun solution(numLog: IntArray): String {
        val answer = StringBuilder()
        var currentNum = numLog[0]
        for (i in 1..numLog.lastIndex) {
            answer.append(
                when (numLog[i] - currentNum) {
                    1 -> "w"
                    -1 -> "s"
                    10 -> "d"
                    -10 -> "a"
                    else -> ""
                }
            )
            currentNum = numLog[i]
        }
        return answer.toString()
    }
}