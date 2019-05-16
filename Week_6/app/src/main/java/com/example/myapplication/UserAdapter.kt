package com.example.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.room.User
import kotlinx.android.synthetic.main.item_user.view.*


class UserAdapter(var items: ArrayList<User>, val context: Context) : RecyclerView.Adapter<UserViewHolder>(){
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): UserViewHolder {
        return UserViewHolder(LayoutInflater.from(context).inflate(R.layout.item_user,parent, false ))
    }

    override fun onBindViewHolder(userViewHolder: UserViewHolder, position: Int) {
        userViewHolder.tvUser.text = " $position  ${items[position].name}"
    }

    fun appenData(newUserAdded: User){
        this.items.add(newUserAdded)
        notifyItemInserted(items.size-1)
    }

}

class UserViewHolder(view: View) : RecyclerView.ViewHolder(view){
    var tvUser = view.tvUser
}