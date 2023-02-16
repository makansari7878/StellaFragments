package com.example.stellafragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class RedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.red_fragments, container, false  )
        var myRedDataButton = view.findViewById<Button>(R.id.buttonRedData)
        myRedDataButton.setOnClickListener {
           /* var blueFrag = BlueFragment()
            var bundle = Bundle()
            bundle.putString("mykey","ANSARI")
            blueFrag.arguments = bundle

            fragmentManager?.beginTransaction()?.
            replace(R.id.myconstrlayout, blueFrag)?.addToBackStack(null)?.commit()*/
            var dataInterface = activity as DataInterface
            dataInterface.saveData("ANSARI")
        }
        return view
    }
}