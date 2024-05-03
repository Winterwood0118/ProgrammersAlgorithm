package com.example.programmersalgorithm.notcamp.lv0
// 수 조작하기 1
class No26 {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        control.map{ it }.forEach{
            when(it){
                'w' -> answer += 1
                's' -> answer -= 1
                'd' -> answer += 10
                'a' -> answer -= 10
            }
        }

        return answer
    }
}