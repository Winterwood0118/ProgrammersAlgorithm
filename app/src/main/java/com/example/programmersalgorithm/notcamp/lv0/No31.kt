package com.example.programmersalgorithm.notcamp.lv0

import androidx.core.text.isDigitsOnly

// 배열 만들기 2
class No31 {
    fun solution(l: Int, r: Int): IntArray {
        val answer = mutableListOf<Int>()
        for (i in l..r) {
            val numString = i.toString().replace("0", "").replace("5", "")
            if (numString.isEmpty()) answer.add(i)
        }
        if (answer.isEmpty()) answer.add(-1)
        return answer.toIntArray()
    }
    //all 사용하면 쉬운 문제였다.
}