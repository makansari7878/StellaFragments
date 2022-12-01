package com.example.dbsroomdbproj

import androidx.room.Database
import androidx.room.RoomDatabase

@Database (entities = [Student::class], version = 4)
abstract class StudentDatabase : RoomDatabase() {

    abstract  fun studentDAO() : StudentDAO
}