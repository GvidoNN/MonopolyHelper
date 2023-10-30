package my.lovely.gamecounter.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App: Application() {

    override fun onCreate() {
        super.onCreate()
        _INSTANCE = this
    }

    companion object {
        private var _INSTANCE: App? = null
        val INSTANCE: App get() = _INSTANCE!!
    }
}