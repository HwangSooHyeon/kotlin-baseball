package baseball.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseballServiceTest {
    private val baseballService = BaseballService()

    @Test
    fun `숫자 생성 함수 길이 테스트`() {
        assertThat(baseballService.makeNumbers()).hasSize(3)
    }

    @Test
    fun `숫자 생성 함수 원소 테스트`() {
        val testNumbers = baseballService.makeNumbers()
        for (testNumber in testNumbers) {
            assertThat(testNumber.also { println(it) }).isBetween(START, END)
        }
    }

    companion object {
        private const val START = 1
        private const val END = 9
    }
}