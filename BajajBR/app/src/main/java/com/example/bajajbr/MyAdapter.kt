package com.example.bajajbr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var mylist : ArrayList<Users>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        fun myBindingViews(user : Users){
            var usernameTextView = itemView.findViewById<TextView>(R.id.textViewUsername)
            var passwordTextView = itemView.findViewById<TextView>(R.id.textViewPassword)

            usernameTextView.setText(user.username)
            passwordTextView.setText(user.password)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.myBindingViews(mylist[position])
    }

    override fun getItemCount(): Int {
        return mylist.size
    }
}