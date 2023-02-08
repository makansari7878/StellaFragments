package com.example.bajajbr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bajajbr.databinding.ItemLayoutBinding

class MyAdapter(var mylist : ArrayList<Users>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(var binding : ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){


        fun myBindingViews(user : Users){
            /*var usernameTextView = itemView.findViewById<TextView>(R.id.textViewUsername)
            var passwordTextView = itemView.findViewById<TextView>(R.id.textViewPassword)*/
                binding.textViewUsername.setText(user.username)
                binding.textViewPassword.setText(user.password)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //var view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        var view = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.myBindingViews(mylist[position])
    }

    override fun getItemCount(): Int {
        return mylist.size
    }
}