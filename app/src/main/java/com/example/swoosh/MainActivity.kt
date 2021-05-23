package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedBtn.setOnClickListener {
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)

            // an intent is an object that lets you interact with other applications as well as your own.
            // for eg: an intent can enable you to open the camera app.
            // there are 2 types of intents - explicit and implicit
            // explicit specifies exactly which app to open (Target class). Like we have done
            // implicit will redirect to the app which is capable of performing the activity. for eg: if you want the btn to open
            // a browser. implicit intent will list down all the apps that are capable to open the webpage.


        }
    }
}