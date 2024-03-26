package com.example.programmersalgorithm.notcamp.lv0

import kotlin.math.max

// 더 크게 합치기
class No14 {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val ab = (a.toString() + b.toString()).toInt()
        val ba = (b.toString() + a.toString()).toInt()
        answer = max(ab, ba)
        return answer
    }
}
// 참조 기억하자
/*
class Solution {
    fun solution(a: Int, b: Int): Int {
        return max("$a$b".toInt(), "$b$a".toInt())
    }
}*/
