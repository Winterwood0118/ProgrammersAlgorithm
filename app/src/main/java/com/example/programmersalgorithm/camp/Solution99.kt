package com.example.programmersalgorithm.camp

fun main() {
    val testArray = intArrayOf(1, 2, 1, 3, 1, 4, 1, 2) //최대 1000000

    println(Solution99().solution(testArray))
}

class Solution99 {
    /*    fun solution(topping: IntArray): Int {
            var answer: Int = 0

            for (i in 1..topping.size -2){
                val left = topping.slice(0..i).toSet()
                val right = topping.slice(i+1..topping.lastIndex)
                println(left.toList())
                println(right.toList())
                if (left.size == right.size) {
                    answer ++
                }
            }
            return answer
        }*/

    fun solution(topping: IntArray): Int {
        var answer: Int = 0
        val arr1 = IntArray(topping.size) { 0 }
        val arr2 = IntArray(topping.size) { 0 }
        val menuCount = mutableSetOf<Int>()

        for (i in topping.indices) {
            menuCount.add(topping[i])
            arr1[i] = menuCount.size
        }

        menuCount.clear()

        for (i in topping.size - 1 downTo 0) {
            menuCount.add(topping[i])
            arr2[i] = menuCount.size
        }

        for (i in 0 until topping.size - 1) {
            if (arr1[i] == arr2[i + 1]) answer++
        }

        return answer
    }
}
