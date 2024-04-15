package com.example.programmersalgorithm.camp

//기능개발

fun main() {
    val testSol = Solution91()
    val testPro = intArrayOf(90, 90, 90, 90)
    val testSpeed = intArrayOf(30, 1, 1, 1)

    println(testSol.solution(testPro, testSpeed).toList())
}

class Solution91 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        val progressesList = progresses.toMutableList()
        val speedsList = speeds.toMutableList()
        var count = 0
        while (progressesList.size != 0) {
            for (i in progressesList.indices) {
                progressesList[i] += speedsList[i]
            }
            if (progressesList[0] >= 100) {
                progressesList.removeAt(0)
                speedsList.removeAt(0)
                answer += 1
                if (progressesList.size == 0) break
                while (progressesList[0] >= 100) {
                    progressesList.removeAt(0)
                    speedsList.removeAt(0)
                    answer[count]++
                    if (progressesList.size == 0) break
                }
                count++
            }
        }
        return answer
    }

    fun solution2(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()

        var lastDay = 0
        var cnt = 0
        progresses
            .mapIndexed {idx, progress -> Pair(progress, speeds[idx].toDouble())}
            .map { (100 - it.first) / it.second }
            .map { Math.ceil(it) }
            .map { it.toInt() }
            .asSequence()
            .forEach { curDay ->
                if (lastDay >= curDay) {
                    cnt++
                } else {
                    if (lastDay != 0)
                        answer = answer.plus(cnt)
                    lastDay = curDay
                    cnt = 1
                }
            }
        answer = answer.plus(cnt)

        return answer
    }
}