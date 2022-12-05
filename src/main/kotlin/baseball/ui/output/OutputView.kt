package baseball.ui.output

import baseball.enums.GameMessages

class OutputView {
    fun printStart() = println(GameMessages.START.toString())

    fun printInputGameNumbers() = println(GameMessages.INPUT_GAME_NUMBERS.toString())

    fun printEnd() = println(GameMessages.END.toString())

    fun printInputStatusNumber() = println(GameMessages.INPUT_STATUS_NUMBER.toString())

    fun printCount(count: String) = println(count)
}