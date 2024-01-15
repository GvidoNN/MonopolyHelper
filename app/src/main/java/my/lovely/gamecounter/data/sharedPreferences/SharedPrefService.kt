package my.lovely.gamecounter.data.sharedPreferences

import my.lovely.gamecounter.domain.sharedPreferences.SharedPreferencesContract

object SharedPrefService: BaseSharedPreferenceService(),SharedPreferencesContract {
    override fun putMoneyAmount(value: Int) {
        SharedPrefService.putInt(key = "MONEY_AMOUNT",value = value)
    }

    override fun getMoneyAmount(): Int? =
        SharedPrefService.getInt(key = "MONEY_AMOUNT")

}