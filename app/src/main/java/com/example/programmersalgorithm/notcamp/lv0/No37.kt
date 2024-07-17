package com.example.programmersalgorithm.notcamp.lv0
// 글자 이어 붙여 문자열 만들기
class No37 {
    fun solution(my_string: String, index_list: IntArray): String {
        val answer: StringBuilder = StringBuilder()
        for (i in index_list){
            answer.append(my_string[i])
        }
        return answer.toString()
    }
}