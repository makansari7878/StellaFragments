package com.example.testroomdb
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Student::class],version = 1)
abstract class StudentDB : RoomDatabase() {

   abstract fun studentDao() : StudentDAO
}
