package com.example.bajajbr

import android.content.IntentFilter
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var usersList : ArrayList<Users>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myReccylerView = findViewById<RecyclerView>(R.id.myrecycleview)
        myReccylerView.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL, false)

        usersList = ArrayList<Users>()
        myReccylerView.adapter = MyAdapter(usersList)


        gettingData()



       /* var intetnFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")
        var myRecevier = MyRecevier()
        registerReceiver(myRecevier, intetnFilter)


        if(ActivityCompat.checkSelfPermission
                (this, android.Manifest.permission.RECEIVE_SMS)== PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "PERMISSION GRANTED", Toast.LENGTH_LONG).show()

        }
        else
        {
            ActivityCompat.requestPermissions(this,
                arrayOf(android.Manifest.permission.RECEIVE_SMS),123)
        }
    */
    }

    private fun gettingData() {

        var user1 = Users("Anari", "123456")
        usersList.add(user1)
        var user2 = Users("Kallem", "34343")
        usersList.add(user2)
        var user3= Users("Ravi", "12334343456")
        usersList.add(user3)
        var user4 = Users("Suresh", "123433456")
        usersList.add(user4)
        var user5 = Users("divesh", "555123456")
        usersList.add(user5)
        var user6 = Users("Ramesh", "142344456")
        usersList.add(user6)
        var user7 = Users("Kumar", "123444456")
        usersList.add(user7)
    }
}