package com.example.schuleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
     lateinit var intenet:Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun recfa(view: View) {
      intenet=Intent(this,Foctur :: class.java)
        Log.i("warum", "recfa: "+"new")
      startActivity(intenet)

    }
    fun add(view: View) {
       intenet=Intent(this,Adieren :: class.java)
        startActivity(intenet)
    }
}