package com.example.programmersalgorithm.notcamp.lv0

import kotlin.math.max

// 두 수의 연산 값 비교하기(14번과 비슷한 문제)
class No15 {
    fun solution(a: Int, b: Int): Int = max("$a$b".toInt(), 2*a*b)
}