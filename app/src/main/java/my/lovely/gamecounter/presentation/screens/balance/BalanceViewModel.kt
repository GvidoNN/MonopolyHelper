package my.lovely.gamecounter.presentation.screens.balance

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import my.lovely.gamecounter.domain.usecase.ChangeBalanceUseCase
import javax.inject.Inject

@HiltViewModel
class BalanceViewModel @Inject constructor(
    private val changeBalanceUseCase: ChangeBalanceUseCase
) : ViewModel() {

}