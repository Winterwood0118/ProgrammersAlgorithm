package com.example.programmersalgorithm.notcamp.lv0
// 문자열 겹쳐쓰기
class No10 {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        answer = my_string.substring(0 until s) + overwrite_string + my_string.substring(s + overwrite_string.length)
        return answer
    }
}