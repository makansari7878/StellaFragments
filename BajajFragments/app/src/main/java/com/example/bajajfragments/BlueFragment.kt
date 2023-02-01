package com.example.bajajfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class BlueFragment : Fragment() {

    lateinit var resTextview : TextView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.blue_layout, container, false)
        resTextview = view.findViewById(R.id.textViewRes)
        var data = arguments?.getString("key")
        resTextview.setText(data)

        return view
    }
}