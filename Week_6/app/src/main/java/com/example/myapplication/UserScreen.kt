package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import kotlinx.android.synthetic.main.user_screen.*
import android.widget.ImageView
import android.graphics.drawable.Drawable
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.room.Task
import com.example.myapplication.room.User
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.user_screen.*


class UserScreen : AppCompatActivity() {
    var Users: ArrayList<User> = ArrayList()
    lateinit var userAdapter: UserAdapter
    var user = User("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.user_screen)

        setupRecyclerView()

        btnAdd.setOnClickListener{
            // db1 = AppDatabase.invoke(this)
            user.name = edtUserID.text.toString()
            userAdapter.appenData(user)

        }
    }
    private fun setupRecyclerView(){
        rvUser.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
        userAdapter = UserAdapter(Users, this)
        rvUser.adapter = userAdapter

    }

}