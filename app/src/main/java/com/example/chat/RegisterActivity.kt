package com.example.chat

import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import kotlinx.android.synthetic.main.activity_register.*
import kotlin.random.Random
import kotlin.random.Random as Random1

class RegisterActivity : AppCompatActivity() {

    var userAvatar = "ic_launcher"
    var avatartcolor = "[0.5,0.5,0.5,1]"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
    fun generateUserAvater(view: View){

        val random = java.util.Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(4)

        if(color == 0){
            userAvatar = "hinh$avatar"
        }
        else
        {
            userAvatar = "anh$avatar"
        }

        val resource = resources.getIdentifier(userAvatar,"drawable",packageName)
        var mBitmap = BitmapFactory.decodeResource(resources,resource)
        val round = RoundedBitmapDrawableFactory.create(resources,mBitmap)
        round.cornerRadius = 300f
        imgAvatarRegister.setImageDrawable(round)
    }
    fun generateBackgroundAvatar(view: View){
        val random = java.util.Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        imgAvatarRegister.setBackgroundColor(Color.rgb(r,g,b))

        val savedR = r.toDouble() / 255
        val saveG = g.toDouble() / 255
        val saveB = b.toDouble() / 255

        avatartcolor ="[$savedR,$saveG,$saveB,10]"
    }
    fun createUser(view: View){

    }
}
