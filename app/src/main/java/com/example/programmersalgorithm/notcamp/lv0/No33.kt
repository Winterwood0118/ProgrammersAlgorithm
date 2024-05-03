package com.example.programmersalgorithm.notcamp.lv0
// 콜라츠 수열 만들기
class No33 {
    fun solution(n: Int): IntArray {
        return collatz(n)
    }

    fun collatz(n: Int): IntArray{
        var num = n
        val mutableList = mutableListOf<Int>()
        while(num != 1){
            mutableList.add(num)
            if (num % 2 == 0) num /= 2
            else num = 3 * num + 1
        }
        return mutableList.toIntArray()
    }
}