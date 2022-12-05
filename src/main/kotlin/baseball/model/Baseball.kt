package baseball.model

class Baseball(private val numbers: List<Int>) {

    fun compare(others: Baseball): String {
        if (equal(others))
            return "3스트라이크"
        val (ball, strike) = count(others)
        return sendResult(ball to strike)
    }

    private fun sendResult(result: Pair<Int, Int>): String {
        val (ball, strike) = result
        if ((ball == 0) and (strike == 0))
            return "낫싱"
        if ((ball == 0))
            return "${strike}스트라이크"
        if ((strike == 0))
            return "${ball}볼"
        return "${ball}볼 ${strike}스트라이크"
    }

    private fun equal(others: Baseball): Boolean {
        for (i in numbers.indices) {
            if (numbers[i] != others.numbers[0])
                return false
        }
        return true
    }

    private fun count(others: Baseball): Pair<Int, Int> {
        var (ball, strike) = 0 to 0
        for (i in others.numbers.indices) {
            if (numbers[i] == others.numbers[i]) {
                strike += 1
                continue
            }
            ball = ballCount(others.numbers[i], ball)
        }
        return ball to strike
    }

    private fun ballCount(other: Int, ball: Int): Int {
        if (numbers.contains(other)) {
            return ball + 1
        }
        return ball
    }
}
