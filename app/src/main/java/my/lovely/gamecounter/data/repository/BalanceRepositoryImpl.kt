package my.lovely.gamecounter.data.repository

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import my.lovely.gamecounter.app.App
import my.lovely.gamecounter.domain.repository.BalanceRepository


const val balanceKey = "BALANCE"
class BalanceRepositoryImpl: BalanceRepository {

    private val appSharedPreference: SharedPreferences =
        App.INSTANCE.getSharedPreferences(App.INSTANCE.packageName, Context.MODE_PRIVATE)

    override fun getSharedPrefBalance(): Int =
        appSharedPreference.getInt(balanceKey, 1500)


    override fun setSharedPrefBalance(balance: Int) {
        appSharedPreference.edit().putInt(balanceKey, balance).apply()
    }

}