package my.lovely.gamecounter.data.sharedPreferences

import android.content.Context
import android.content.SharedPreferences
import my.lovely.gamecounter.app.App

abstract class BaseSharedPreferenceService {

    private val appSharedPreference: SharedPreferences =
        App.INSTANCE.getSharedPreferences(App.INSTANCE.packageName, Context.MODE_PRIVATE)

    fun getString(key: String): String? = appSharedPreference.getString(key, null)
    fun putString(key: String, value: String?) =
        appSharedPreference.edit().putString(key, value).apply()

    fun getInt(key: String): Int? =
        when (val value = appSharedPreference.getInt(key, Int.MIN_VALUE)) {
            Int.MIN_VALUE -> null
            else -> value
        }

    fun putInt(key: String, value: Int?) =
        appSharedPreference.edit().putInt(key, value ?: Int.MIN_VALUE).apply()

    fun getBool(key: String): Boolean? =
        when (appSharedPreference.getInt(key, 2)) {
            0 -> false
            1 -> true
            else -> null
        }

    fun putBool(key: String, value: Boolean?) = appSharedPreference.edit().putInt(
        key, when (value) {
            false -> 0
            true -> 1
            else -> 2
        }
    ).apply()

    fun putFloat(key: String, value: Float?) = appSharedPreference.edit().putFloat(key, value ?: Float.MIN_VALUE).apply()

    fun getFloat(key: String): Float? =
        when (val value = appSharedPreference.getFloat(key, Float.MIN_VALUE)) {
            Float.MIN_VALUE -> null
            else -> value
        }

}