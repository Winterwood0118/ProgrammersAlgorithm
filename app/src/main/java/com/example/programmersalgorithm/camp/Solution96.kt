package com.example.programmersalgorithm.camp

import java.util.Stack

fun main() {
    val fees = intArrayOf(180, 5000, 10, 600)
    val records = arrayOf(
        "05:34 5961 IN", // -> listOf( "05:34", "5961" , "IN")
        "06:00 0000 IN",
        "06:34 0000 OUT",
        "07:59 5961 OUT",
        "07:59 0148 IN",
        "18:59 0000 IN",
        "19:09 0148 OUT",
        "22:59 5961 IN",
        "23:00 5961 OUT"
    )

    val test = IntArray(6){ it } // -> (0, 1, ~~ ,5)
    test.map { it.toString() }.mapIndexed { index, s ->
        if (s == "4") s.toInt()
        else s.toInt() + index
    }



}

class Solution96 {
    fun solution(fees: IntArray, records: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val endTime = 24 * 60 - 1
        val record = records
            .map { it.split(" ") }
            .sortedBy { it[1] }
            .map { strings ->
                listOf(
                    strings[0].split(":").let { it[0].toInt() * 60 + it[1].toInt() }.toString(),
                    strings[1],
                    strings[2]
                )
            }.groupBy { it[1] }
        println(record)

        for (i in record) {
            val stack = Stack<Int>()
            var times = 0
            for (j in i.value) {
                if (j[2] == "IN") {
                    stack.add(j[0].toInt())
                } else {
                    times += j[0].toInt() - stack.pop()
                }
            }
            if (stack.size == 1) {
                times += endTime - stack.pop()
            }
            var charge = fees[1]
            if (times > fees[0]) {
                val timesCeil = (times - fees[0])
                charge += (if (timesCeil % fees[2] == 0) timesCeil / fees[2] * fees[3] else ((timesCeil / fees[2]) + 1) * fees[3])
            }
            answer += charge
        }
        return answer
    }
}