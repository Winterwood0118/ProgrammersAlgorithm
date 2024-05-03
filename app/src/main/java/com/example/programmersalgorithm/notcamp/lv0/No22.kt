package com.example.programmersalgorithm.notcamp.lv0
//등차수열의 특정한 항만 더하기
class No22 {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        val sq = IntArray(included.size){ i -> a + i * d }

        sq.forEachIndexed{ i, c ->
            if(included[i]) answer += c
        }

        return answer
    }
}