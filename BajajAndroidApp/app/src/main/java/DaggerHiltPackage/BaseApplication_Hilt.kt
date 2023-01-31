package DaggerHiltPackage

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication_Hilt : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}