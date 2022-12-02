package baseball.enums

enum class ErrorMessages(private val messages: String) {
    PREFIX("[ERROR]"),
    DIGIT_EXCEPTION("숫자가 아닙니다."),
    SIZE_EXCEPTION("갯수가 맞지 않습니다."),
    DISTINCT_EXCEPTION("중복이 있습니다."),
    CORRECT_EXCEPTION("올바른 숫자가 아닙니다.");

    override fun toString(): String = "${PREFIX.messages} $messages"
}