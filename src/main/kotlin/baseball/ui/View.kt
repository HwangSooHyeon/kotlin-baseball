package baseball.ui

import baseball.ui.input.InputView
import baseball.ui.output.OutputView

class View {

    private val inputView = InputView()
    private val outputView = OutputView()
    fun startView() = outputView.printStart()

    fun inputGameNumberView(): List<Int> = inputView.readGameNumbers(inputView.getNumbers())

    fun countView(count: String) = outputView.printCount(count)


}