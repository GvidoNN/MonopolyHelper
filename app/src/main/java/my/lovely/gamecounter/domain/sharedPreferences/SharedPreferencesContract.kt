package my.lovely.gamecounter.domain.sharedPreferences

interface SharedPreferencesContract {


    fun putMoneyAmount(value: Int)

    fun getMoneyAmount(): Int?
}