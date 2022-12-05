package baseball.ui

import baseball.ui.input.InputView
import baseball.ui.output.OutputView

class View {

    private val inputView = InputView()
    private val outputView = OutputView()
    fun startView() = outputView.printStart()

    fun inputGameNumbersView(): List<Int> {
        outputView.printInputGameNumbers()
        return inputView.readGameNumbers(inputView.getNumbers())
    }

    fun countView(count: String) = outputView.printCount(count)

    fun inputStatusNumberView(): Int {
        outputView.printEnd()
        outputView.printInputStatusNumber()
        return inputView.readStatusNumber(inputView.getNumbers())
    }
}