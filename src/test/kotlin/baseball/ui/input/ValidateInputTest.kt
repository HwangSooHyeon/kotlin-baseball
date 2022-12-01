package baseball.ui.input

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class ValidateInputTest {

    private val validateInput = ValidateInput()

    @ParameterizedTest
    @CsvSource(DIGIT_EXCEPTION, SIZE_EXCEPTION)
    fun `게임 숫자 예외 처리 함수 테스트`(numbers: String) {
        assertThrows<IllegalArgumentException> { validateInput.validateGameNumbers(numbers) }
    }

    companion object {
        private const val DIGIT_EXCEPTION = "12a"
        private const val SIZE_EXCEPTION = "1234"
    }
}