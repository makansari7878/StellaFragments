package com.example.bajajbr

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bajajbr.databinding.ActivitySharedPrefBinding

class SharedPrefAct : AppCompatActivity() {

    lateinit var mylayout : ActivitySharedPrefBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_pref)

        mylayout = ActivitySharedPrefBinding.inflate(layoutInflater)
        setContentView(mylayout.root)

        var sp = getSharedPreferences("myfile", MODE_PRIVATE)

        mylayout.editTextusername.setText(sp.getString("un", ""))

        mylayout.buttonSubmit.setOnClickListener {
            var username = mylayout.editTextusername.text.toString()
            var editor  = sp.edit()
            editor.putString("un", username)
            editor.commit()

            mylayout.editTextusername.setText("")
        }
    }
}