package com.example.programmersalgorithm.camp

// 의상
class Solution90 {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val clothesGroup = clothes.groupBy { it[1] }

        // <상의, (빨간 티, 파란 티, x)>, <하의, (청바지, 슬랙스, x)>

        for (i in clothesGroup) {
            answer *= i.value.size + 1
        }
        answer -= 1
        return answer
    }


    fun solution2(clothes: Array<Array<String>>) = clothes
        .groupBy { it[1] }.values   // group by type of clothes, keep only names of clothes
        .map { it.size + 1 }        // number of things to wear in a group (including wearing nothing)
        .reduce(Int::times)         // combine
        .minus(1)                   // remove the case where the spy wears nothing
}