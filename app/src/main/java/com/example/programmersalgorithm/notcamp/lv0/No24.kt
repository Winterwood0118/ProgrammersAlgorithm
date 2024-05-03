package com.example.programmersalgorithm.notcamp.lv0
// 원소들의 곱과 합
class No24 {
    fun solution(num_list: IntArray): Int {
        return if(num_list.fold(1){ acc, num -> acc * num } < num_list.sumOf{ it } * num_list.sumOf{ it }) 1
        else 0
    }
}