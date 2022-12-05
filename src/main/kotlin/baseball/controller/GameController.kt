package baseball.controller

import baseball.domain.BaseballService
import baseball.model.Baseball
import baseball.ui.View

class GameController {

    private val view = View()
    private val baseballService = BaseballService()

    fun play() {
        do {
            val createdNumbers = start()
        } while (inGame(createdNumbers))
    }

    private fun start(): Baseball {
        view.startView()
        return Baseball(baseballService.makeNumbers())
    }

    private fun inGame(createdNumbers: Baseball): Boolean {
        do {
            val inputNumbers = Baseball(view.inputGameNumbersView())
            val count = createdNumbers.compare(inputNumbers)
            view.countView(count)
        } while (end(count))
        return restart()
    }

    private fun end(count: String): Boolean {
        if (count == "3스트라이크")
            return false
        return true
    }

    private fun restart(): Boolean {
        val statusNumber = view.inputStatusNumberView()
        if (statusNumber == 1) {
            return true
        }
        return false
    }
}