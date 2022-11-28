package com.example.testroomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var database: StudentDB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var saveButton = findViewById<Button>(R.id.buttonsave)
        var showButton = findViewById<Button>(R.id.buttonshow)

       // database =  Room.databaseBuilder(applicationContext, StudentDB::class.java, "mystudent_db").build()

        saveButton.setOnClickListener {
            GlobalScope.launch {       database.studentDao().insertStudent(Student(1,"ansari",44))
            }
        }

        showButton.setOnClickListener {
            var res : String? = null
            GlobalScope.launch {

                database.studentDao().getAllStudent().forEach {
                    res = "id is ${it.id} and name is ${it.name} and age is ${it.age}"
                    Log.i("mytag", "$res")}
            }
        }
    }
}