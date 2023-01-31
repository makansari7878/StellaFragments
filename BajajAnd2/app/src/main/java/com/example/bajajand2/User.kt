package com.example.bajajand2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(var uname : String, var pwd : String) : Parcelable {
}