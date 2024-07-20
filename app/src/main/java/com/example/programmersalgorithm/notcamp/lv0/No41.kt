package com.example.programmersalgorithm.notcamp.lv0
// 머쓱이보다 키 큰 사람
class No41 {
    fun solution(array: IntArray, height: Int): Int {
        return array.count{ it > height }
    }
}