package com.example.stellafragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class BlueFragment : Fragment() {
lateinit var resultTextView : TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.blue_fragment, container, false)

         resultTextView = view.findViewById<TextView>(R.id.textViewResult)
        var data = arguments?.getString("mykey")
        resultTextView.setText(data)
        return view
    }

    fun myMethod(mydata : String ){
        resultTextView.setText(mydata)
    }
}