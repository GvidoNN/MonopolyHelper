package my.lovely.gamecounter.domain.screens.balance

import my.lovely.gamecounter.domain.screens.base.ViewIntent

sealed class BalanceViewIntents: ViewIntent {

    data class MinusInBalance(val money: Int): BalanceViewIntents()

    data class PlusInBalance(val money: Int): BalanceViewIntents()

    object ResetBalance: BalanceViewIntents()

}