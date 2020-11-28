package com.example.schuleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Adieren : AppCompatActivity() {
       lateinit var edittext:EditText
       lateinit var output:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adieren)
        edittext=findViewById(R.id.inputzahl)
        output=findViewById(R.id.output)


    }

    fun addieen(view: View) {
        if(output.text!=null){
            output.setText(adieren(Integer.parseInt(edittext.text.toString()!!)).toString())
        }else{
            Toast.makeText(this,"plase gebe was",Toast.LENGTH_LONG).show()
        }



    }

    fun  adieren(zahl:Int):Int{
        if(zahl==1){
            return 1
        }else{
            return zahl+adieren(zahl-1)
        }
    }


}