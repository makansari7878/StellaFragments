package com.example.bajajjetpackcomp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelClass :ViewModel() {

    var factsLiveData = MutableLiveData<String>("my fact 1")

    fun updateLiveData(){
        factsLiveData.value = "NEW FACT 2"
    }
}