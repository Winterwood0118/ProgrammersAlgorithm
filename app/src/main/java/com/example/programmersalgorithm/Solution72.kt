package com.example.programmersalgorithm


/*class Solution72 {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val answer = players.map { it }.toMutableList()

        for( i in callings ){
            val rank = answer.indexOf(i)
            answer[rank] = answer[rank-1]
            answer[rank-1] = i
        }

        return answer.toTypedArray()
    }
}*/
fun main() {
    val test = mutableMapOf<String, Int>()

    test["a"] = 1
    println(test)
}



class Solution72 {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val ranking = mutableMapOf<String, Int>()

        players.forEachIndexed { i, p ->
            ranking[p] = i
        }

        for (i in callings) {
            val rank = ranking[i] ?: 0
            val temp = players[rank - 1]
            ranking[i] = ranking[i]!! -1
            ranking[temp] = ranking[temp]!! + 1
            players[rank] = temp
            players[rank - 1] = i
        }
        return players
    }
}

class Solution72_1 {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        // 플레이어와 위치를 매핑하는 맵 생성
        val playerMap = mutableMapOf<String, Int>()
        players.forEachIndexed { index, player ->
            playerMap[player] = index
        }

        // 초기 당첨자의 인덱스 설정
        var winnerIndex = players.size - 1

        // 호출된 순서대로 반복
        for (calling in callings) {
            // 호출된 선수의 인덱스를 가져옴
            val callingIndex = playerMap[calling]!!

            // 당첨자와 호출된 선수의 인덱스를 교환
            val temp = players[winnerIndex]
            players[winnerIndex] = calling
            players[callingIndex] = temp

            // 새로운 당첨자의 인덱스 갱신
            winnerIndex = callingIndex
        }

        return players.copyOf() // 변경된 배열을 복사하여 반환
    }
}