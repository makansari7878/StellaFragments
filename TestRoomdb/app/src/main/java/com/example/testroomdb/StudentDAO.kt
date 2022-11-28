package com.example.testroomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDAO {

   @Insert
   suspend fun insertStudent(student: Student)

   @Delete
   suspend fun deleteStudent(student: Student)

   @Query("select * from student")
   suspend fun getAllStudent(): List<Student>
}
