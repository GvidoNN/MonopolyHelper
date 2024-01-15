package my.lovely.gamecounter.presentation.screens.balance

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import my.lovely.gamecounter.domain.screens.balance.BalanceViewIntents
import my.lovely.gamecounter.domain.screens.balance.BalanceViewState
import my.lovely.gamecounter.domain.usecase.ChangeBalanceUseCase
import my.lovely.gamecounter.domain.screens.base.BaseViewModel
import my.lovely.gamecounter.domain.screens.base.ViewIntent
import javax.inject.Inject

@HiltViewModel
class BalanceViewModel @Inject constructor(
    private val changeBalanceUseCase: ChangeBalanceUseCase
) : BaseViewModel<BalanceViewState>(
    BalanceViewState(
        currentMoney = changeBalanceUseCase.getCurrentBalance()
    )
) {
    override fun obtain(viewIntent: ViewIntent) {
        when(viewIntent){
            is BalanceViewIntents.MinusInBalance -> {
                reducerScope.launch {
                    changeBalanceUseCase.minusBalance(minusValue = viewIntent.money)
                }
            }

            is BalanceViewIntents.PlusInBalance -> {
                reducerScope.launch {
                    changeBalanceUseCase.plusBalance(plusValue = viewIntent.money)
                }
            }

            is BalanceViewIntents.ResetBalance -> {
                reducerScope.launch {
                    changeBalanceUseCase.resetBalance()
                }
            }
        }

        reducerScope.launch {
            updateState {
                copy(
                    currentMoney = changeBalanceUseCase.getCurrentBalance()
                )
            }
        }
    }


}