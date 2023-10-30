package my.lovely.gamecounter.presentation.screens.balance

sealed class BalanceViewIntents {

    data class MinusInBalance(val money: Int): BalanceViewIntents()

    data class PlusInBalance(val money: Int): BalanceViewIntents()

    object ResetBalance: BalanceViewIntents()

}