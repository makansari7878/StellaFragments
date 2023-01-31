package di_package

import android.app.Application

class BaseApplication : Application() {

    var car = Car(Engine(), Wheels())
}