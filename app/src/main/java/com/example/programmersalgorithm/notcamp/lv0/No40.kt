package com.example.programmersalgorithm.notcamp.lv0

//중복된 숫자 개수
class No40 {
    fun solution(array: IntArray, n: Int): Int {
        return array.count { it == n }
    }
}