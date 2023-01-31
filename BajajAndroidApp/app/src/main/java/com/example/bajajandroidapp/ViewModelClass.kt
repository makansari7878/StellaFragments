package com.example.bajajandroidapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelClass : ViewModel() {
    val liveFacts = MutableLiveData<String>("this is the current fact")

    fun myUpdateLiveData(){
        liveFacts.value = "THIS IS THE NEW FACT"
    }
}