package my.lovely.gamecounter.presentation.screens.balance

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import my.lovely.gamecounter.domain.usecase.ChangeBalanceUseCase
import my.lovely.gamecounter.presentation.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class BalanceViewModel @Inject constructor(
    private val changeBalanceUseCase: ChangeBalanceUseCase
) : BaseViewModel<BalanceViewState>(
    BalanceViewState(
        currentMoney = 0
    )
) {

    init {
        reducerScope.launch {
            delay(100)
        }
    }



}