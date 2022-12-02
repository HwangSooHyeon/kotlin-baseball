package baseball.ui.input

class InputView {

    private val validateInput = ValidateInput()

    fun readGameNumbers(numbers: String): List<Int> {
        return try {
            validateInput.validateGameNumbers(numbers)
            numbers.map { it.digitToInt() }
        } catch (e: IllegalArgumentException) {
            println(e.message)
            readGameNumbers(numbers)
        }
    }

    fun readStatusNumber(number: String): Int {
        return try {
            validateInput.validateStatusNumber(number)
            number.toInt()
        } catch (e: IllegalArgumentException) {
            println(e.message)
            readStatusNumber(number)
        }
    }
}