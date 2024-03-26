package com.example.programmersalgorithm.notcamp.lv0

// 문자열 섞기
import java.lang.StringBuilder

fun main() {
    val str1 = "aaaaaaaaa"
    val str2 = "bbbbbb"
    val sb = StringBuilder()
    repeat(4) {
        sb.append('c')
    }
    println(str1.zip(sb))
    // zip은 CharSequence, 간단하게 String, StringBuilder 등 문자열에 대해서 a.zip(b)를 했을 때 길이가 짧은 쪽에 맞춰서 List<Pair<Char, Char>>형태로 반환해 주는 메서드이다.
}

class No11 {
    fun solution(str1: String, str2: String): String {
        val answer = StringBuilder()

        for (i in str1.indices) {
            answer.append(str1[i])
            answer.append(str2[i])
        }

        return answer.toString()
    }

    //    fun solution(str1: String, str2: String) = str1.zip(str2).joinToString("") { (a, b) -> "$a$b" }
}