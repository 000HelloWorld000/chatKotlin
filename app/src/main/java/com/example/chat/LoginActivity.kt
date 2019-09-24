package com.example.chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginCreateUserClicked(view : View){

    }
    fun registerCreaterUserClicked(view: View){
        val createUser = Intent(this,RegisterActivity::class.java)
        startActivity(createUser)
    }
}
