package com.example.bajajnavfrag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DagActrivity : AppCompatActivity() {

    @Inject
    lateinit var car : Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dag_actrivity)
        car.getCar()
    }
}