package com.example.programmersalgorithm.camp

fun main() {
    val park = arrayOf("OOO", "OSO", "OOO", "OOO")
    val routes = arrayOf("N 2", "S 2")
    println(Solution73().solution(park, routes).toList())

}

class Solution73 {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        val parkList = park.map { it.map { it.toString() } }
        val routeList = routes.map { it.split(" ") }.map { it[0] to it[1].toInt() }
        val maxX = parkList[0].lastIndex
        val maxY = parkList.lastIndex
        var x: Int = parkList.filter { it.contains("S") }[0].indexOf("S")
        var y: Int = parkList.indexOfFirst { it.contains("S") }

        for (i in routeList) {
            when (i.first) {
                "E" -> {
                    if (x + i.second > maxX || parkList[x].slice(x..x + i.second)
                            .contains("X")
                    ) continue
                    else x += i.second
                }

                "W" -> {
                    if (x - i.second < 0 || parkList[x].slice(x downTo x - i.second)
                            .contains("X")
                    ) continue
                    else x -= i.second
                }

                "S" -> {
                    if (y + i.second > maxY || parkList.map { it[x] }.slice(y..y + i.second).contains("X")) continue
                    else y += i.second

                }

                "N" -> {
                    if (y - i.second < 0 || parkList.map { it[x] }.slice(y downTo y - i.second).contains("X")) continue
                    else y -= i.second
                }
            }
        }

        return intArrayOf(y, x)
    }
}
