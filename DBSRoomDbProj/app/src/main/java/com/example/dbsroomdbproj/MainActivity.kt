package com.example.dbsroomdbproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var database: StudentDatabase
    lateinit var stu : Student
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(this, StudentDatabase::class.java, "stu_db").fallbackToDestructiveMigration().build()

        var usernameEd = findViewById<EditText>(R.id.editTextUsername)
        var passwordEd = findViewById<EditText>(R.id.editTextPassword)

        var saveButton = findViewById<Button>(R.id.buttonSave)
        var showButton = findViewById<Button>(R.id.buttonShow)

        saveButton.setOnClickListener {
            var username = usernameEd.text.toString()
            var pwd = passwordEd.text.toString()

            Thread{
                stu = Student()
               // stu.id = 129
                stu.username = username
                stu.password = pwd
                database.studentDAO().insertStudent(stu)
            }.start()




        }

        showButton.setOnClickListener {

            Thread {
                database.studentDAO().readStudent().forEach {
                    var result =
                        "id is ${it.id} and username is ${it.username} and pwd is ${it.password}"
                    Log.i("mytag", result)
                }
            }.start()



                    //database.studentDAO().readStudent().observe(applicationContext, {Log.i("mytag","{it}")})


        }
    }
}
