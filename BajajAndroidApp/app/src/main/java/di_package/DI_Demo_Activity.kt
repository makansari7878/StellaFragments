package di_package

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bajajandroidapp.R

class DI_Demo_Activity : AppCompatActivity() {

    lateinit var baseApp : BaseApplication
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_di_demo)

        baseApp = BaseApplication()
        baseApp.car.getCar()
    }
}