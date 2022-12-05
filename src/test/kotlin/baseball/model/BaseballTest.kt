package baseball.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseballTest {

    @Test
    fun `생성한 숫자와 입력 받은 숫자 유사도 확인 테스트 - 3스트라이크`() {
        val testNumbers = THREE_STRIKE
        assertThat(testNumbers.compare(THREE_STRIKE)).isEqualTo("3스트라이크")
    }

    @Test
    fun `생성한 숫자와 입력 받은 숫자 유사도 확인 테스트 - 1볼 1스트라이크`() {
        val testNumbers = THREE_STRIKE
        assertThat(testNumbers.compare(ONE_BALL_ONE_STRIKE)).isEqualTo("1볼 1스트라이크")
    }

    @Test
    fun `생성한 숫자와 입력 받은 숫자 유사도 확인 테스트 - 낫싱`() {
        val testNumbers = THREE_STRIKE
        assertThat(testNumbers.compare(NOTHING)).isEqualTo("낫싱")
    }

    companion object {
        private val THREE_STRIKE = Baseball(listOf<Int>(1, 2, 3))
        private val ONE_BALL_ONE_STRIKE = Baseball(listOf<Int>(2, 4, 3))
        private val NOTHING = Baseball(listOf<Int>(4, 5, 6))
    }
}