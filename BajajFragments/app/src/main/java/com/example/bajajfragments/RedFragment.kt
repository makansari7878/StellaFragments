package com.example.bajajfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlin.concurrent.fixedRateTimer

class RedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.red_layout, container, false )
        var sendButton = view.findViewById<Button>(R.id.buttonSend)
        sendButton.setOnClickListener {

            var blueFrag = BlueFragment()
                var bundle = Bundle()
                bundle.putString("key", "ANSARI")
                blueFrag.arguments = bundle

            fragmentManager?.beginTransaction()?.replace(R.id.myconstrainlayout,blueFrag )?.addToBackStack(null)?.commit()

        }
        return view
    }
}