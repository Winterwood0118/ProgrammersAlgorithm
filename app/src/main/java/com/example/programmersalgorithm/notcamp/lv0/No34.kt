package com.example.programmersalgorithm.notcamp.lv0
// 배열 만들기 4

import java.util.Stack

class No34 {
    fun solution(arr: IntArray): IntArray {
        val stk = Stack<Int>()
        var i = 0
        while (arr.size > i) {
            if (stk.isEmpty()) {
                stk.add(arr[i])
                i ++
            }
            else if (stk.last() < arr[i]) {
                stk.add(arr[i])
                i ++
            }else {
                stk.pop()
            }
        }

        return stk.toIntArray()
    }
}