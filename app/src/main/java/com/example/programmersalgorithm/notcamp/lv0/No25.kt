package com.example.programmersalgorithm.notcamp.lv0
// 이어 붙인 수
class No25 {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var even = ""
        var odd = ""
        num_list.forEachIndexed{ i, c ->
            if(i % 2 == 0) even += c.toString()
            else odd += c.toString()
        }
        answer = even.toInt() + odd.toInt()
        return answer
    }
}