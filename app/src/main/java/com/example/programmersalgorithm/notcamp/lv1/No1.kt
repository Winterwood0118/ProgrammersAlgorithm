package com.example.programmersalgorithm.notcamp.lv1

//추억 점수
class No1 {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val yearningMap = HashMap<String, Int>()
        for (i in name.indices) {
            yearningMap[name[i]] = yearning[i]
        }
        return photo.map { array ->
            array.sumOf { str ->
                yearningMap[str] ?: 0
            }
        }.toIntArray()
    }
}