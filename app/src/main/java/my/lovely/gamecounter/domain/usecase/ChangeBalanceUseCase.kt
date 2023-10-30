package my.lovely.gamecounter.domain.usecase

import my.lovely.gamecounter.domain.repository.BalanceRepository
import javax.inject.Inject

class ChangeBalanceUseCase @Inject constructor(private val balanceRepository: BalanceRepository) {

    fun minusBalance(){

    }

    fun plusBalance(){}

    fun resetBalance(){}


}