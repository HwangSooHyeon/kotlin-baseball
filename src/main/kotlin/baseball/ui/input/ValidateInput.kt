package baseball.ui.input

import baseball.enums.ErrorMessages

class ValidateInput {

    fun validateGameNumbers(numbers: String) {
        checkDigit(numbers)
        checkSize(numbers)
        checkDistinct(numbers)
    }

    fun validateStatusNumber(number: String) {
        checkDigit(number)
        checkCorrect(number)
    }

    private fun checkDigit(numbers: String) {
        require(numbers.all { it.isDigit() }) {
            ErrorMessages.DIGIT_EXCEPTION.toString()
        }
    }

    private fun checkSize(numbers: String) {
        require(numbers.length == 3) {
            ErrorMessages.SIZE_EXCEPTION.toString()
        }
    }

    private fun checkDistinct(numbers: String) {
        val slicedNumbers = numbers.toList()
        require(slicedNumbers.distinct().count() == slicedNumbers.size) {
            ErrorMessages.DISTINCT_EXCEPTION.toString()
        }
    }

    private fun checkCorrect(number: String) {
        require((number == "1") or (number == "2")) {
            ErrorMessages.CORRECT_EXCEPTION.toString()
        }
    }
}