package my.lovely.gamecounter.domain.usecase

import my.lovely.gamecounter.data.sharedPreferences.SharedPrefService
import my.lovely.gamecounter.domain.repository.BalanceRepository
import javax.inject.Inject

class ChangeBalanceUseCase @Inject constructor(private val balanceRepository: BalanceRepository) {

    fun getCurrentBalance(): Int? =
        balanceRepository.getSharedPrefBalance()

    fun minusBalance(minusValue: Int){
        val currentMoney = SharedPrefService.getMoneyAmount()
        balanceRepository.setSharedPrefBalance(balance = currentMoney?.minus(minusValue) ?: 1500)
    }

    fun plusBalance(plusValue: Int){
        val currentMoney = SharedPrefService.getMoneyAmount()
        balanceRepository.setSharedPrefBalance(balance = currentMoney?.plus(plusValue) ?: 1500)
    }

    fun resetBalance(){
        balanceRepository.setSharedPrefBalance(balance = 1500)
    }


}