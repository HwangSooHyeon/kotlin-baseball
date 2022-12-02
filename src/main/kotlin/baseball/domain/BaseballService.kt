package baseball.domain

import camp.nextstep.edu.missionutils.Randoms

class BaseballService {

    fun makeNumbers(): List<Int> {
        val computer: MutableList<Int> = mutableListOf()
        while (computer.size < SIZE_LIMIT) {
            val randomNumber = Randoms.pickNumberInRange(LOW_BOUNDARY, HIGH_BOUNDARY)
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber)
            }
        }
        return computer
    }

    companion object {
        private const val SIZE_LIMIT = 3
        private const val LOW_BOUNDARY = 1
        private const val HIGH_BOUNDARY = 9
    }
}