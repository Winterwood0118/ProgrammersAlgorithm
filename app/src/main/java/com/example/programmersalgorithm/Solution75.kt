package com.example.programmersalgorithm

import kotlin.concurrent.thread
import kotlin.time.measureTime


fun main(){
/*    val testList = "-1 1 2 4 -5 6 9 777 8 2"
    //val test = Solution75()

    val runTime = measureTime {
        testList.split(" ").map { it.toInt() }.run {
            "${maxOf { it }} ${minOf { it }}"
        }
    }
    println(runTime)

    val letTime = measureTime {
        testList.split(" ").map { it.toInt() }.let {
            "${it.maxOf { it }} ${it.minOf { it }}"
        }
    }
    println(letTime)
    //println(test.solution(testList))*/
/*    thread1.start()
    thread2.start()*/
    val c = '4'
    println(c.toUpperCase())
}

val thread1 = thread(start = false){
    val letTime = measureTime {
        val testList = "-1 1 2 4 -5 6 9 777 8 2"
        testList.split(" ").map { it.toInt() }.let {
            "${it.maxOf { it }} ${it.minOf { it }}"
        }
    }
    println("let: $letTime")
}
val thread2 = thread(start = false){
    val runTime = measureTime {
        val testList = "-1 1 2 4 -5 6 9 777 8 2"
        testList.split(" ").map { it.toInt() }.run {
            "${maxOf { it }} ${minOf { it }}"
        }
    }
    println("run: $runTime")
}
class Solution75 {
    fun solution(s: String): String {
        var answer = ""
        answer = s.split(" ").map { it.toInt() }.run {
            "${maxOf{it}} ${minOf{it}}"
        }
        answer = s.split(" ").map { it.toInt() }.let {
            "${it.maxOf{it}} ${it.minOf{it}}"
        }
        return answer
    }
}