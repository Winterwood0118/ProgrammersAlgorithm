package com.example.programmersalgorithm.notcamp.lv0
// 문자열 여러번 뒤집기
class No43 {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        for(i in queries){
            val reversedSubstring = answer.substring(i[0], i[1] + 1).reversed()
            answer = answer.replaceRange(i[0]..i[1], reversedSubstring)
        }
        return answer
    }
}