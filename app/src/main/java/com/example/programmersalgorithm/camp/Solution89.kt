package com.example.programmersalgorithm.camp

// 할인 행사
class Solution89 {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        val wantMap = mutableMapOf<String, Int>()
        for (i in want.indices) {
            wantMap[want[i]] = number[i]
        }

        for (i in 0..discount.lastIndex - 9) {
            val slicedArray = discount.slice(i..i + 9)
            var canBuy = true
            for (j in wantMap) {
                if (slicedArray.count { it == j.key } < j.value) {
                    canBuy = false
                    break
                }
            }

            if (canBuy) answer++
        }


        return answer
    }













    fun solution2(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        val wantMap = mutableMapOf<String, Int>()

        repeat(discount.size) { // discount 크기만큼 반복하며 wantMap을 초기화한다.
            wantMap.clear()
            repeat(want.size) { wantMap[want[it]] = number[it] }
            var num = 0 //
            for(i in it until discount.size) {
                val food = discount[i] // 할인 품목을 food에 저장
                if(!wantMap.containsKey(food)) break // wantMap에 food가 없으면 검사 반복문 break
                if(wantMap[food] == 0) break // 해당 푸드의 필요한 양이 0이면 break
                wantMap[food] = wantMap[food]!! - 1 // 둘다 아니면 필요한 양을 -1, num++
                num ++
            }
            if (num == 10) answer ++
        }

        return answer
    }
}
