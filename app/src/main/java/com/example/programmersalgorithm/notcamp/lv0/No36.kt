package com.example.programmersalgorithm.notcamp.lv0
// 주사위 게임 3

fun main() {
    val list = listOf(1, 1, 3, 1)
    print(list.groupBy { it }.maxBy { it.value.size }.key)
}

class No36 {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var answer: Int = 0
        val diceList = listOf(a, b, c, d).sorted()
        val dice1 = diceList[0]
        val dice2 = diceList[1]
        val dice3 = diceList[2]
        val dice4 = diceList[3]

        when{
            dice1 == dice4 -> {
                answer = dice1 * 1111
            }
            dice1 == dice3 -> {
                answer = (10 * dice1 + dice4) * (10 * dice1 + dice4)
            }
            dice2 == dice4 -> {
                answer = (10 * dice4 + dice1) * (10 * dice4 + dice1)
            }
            dice1 == dice2 && dice3 == dice4 -> {
                answer = Math.abs((dice1 * dice2) - (dice3 * dice4))
            }
            dice1 != dice2 && dice2 != dice3 && dice3 != dice4 ->{
                answer = dice1
            }
            else -> {
                val mode = diceList.groupBy { it }.maxByOrNull { it.value.size }?.key
                answer = diceList.filter { it != mode }.fold(1){ acc, i -> acc * i }
            }
        }

        return answer
    }
}