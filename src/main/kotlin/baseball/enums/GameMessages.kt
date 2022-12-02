package baseball.enums

enum class GameMessages(private val messages: String) {
    START("숫자 야구 게임을 시작합니다."),
    INPUT_GAME_NUMBERS("숫자를 입력해주세요 : "),
    END("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    INPUT_STATUS_NUMBER("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    override fun toString(): String = messages
}