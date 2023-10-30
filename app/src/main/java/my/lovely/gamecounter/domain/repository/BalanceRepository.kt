package my.lovely.gamecounter.domain.repository

interface BalanceRepository {

    fun getSharedPrefBalance(): Int

    fun setSharedPrefBalance(balance: Int)

}