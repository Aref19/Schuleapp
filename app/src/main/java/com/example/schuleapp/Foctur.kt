package com.example.schuleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Foctur : AppCompatActivity() {
    lateinit var edittext:EditText
    lateinit var output:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foctur)
        edittext=findViewById(R.id.inputzahlmu)
        output=findViewById(R.id.outputmu)
    }

    fun fact(view: View) {
        if(edittext.text!=null){

     output.setText(factur(Integer.parseInt( edittext.text.toString())).toString())
        }

    }
     fun factur(zahl:Int):Int{
    if(zahl==1){
        return 1
    }else{
     return zahl*factur(zahl-1)
    }}


}