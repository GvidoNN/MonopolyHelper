package my.lovely.gamecounter.data.repository

import my.lovely.gamecounter.data.sharedPreferences.SharedPrefService
import my.lovely.gamecounter.domain.repository.BalanceRepository


class BalanceRepositoryImpl: BalanceRepository {

    override fun getSharedPrefBalance(): Int? =
        SharedPrefService.getMoneyAmount()


    override fun setSharedPrefBalance(balance: Int) {
        SharedPrefService.putMoneyAmount(value = balance)
    }

}