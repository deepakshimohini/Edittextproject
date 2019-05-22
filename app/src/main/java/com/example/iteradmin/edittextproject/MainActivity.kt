package com.example.iteradmin.edittextproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
        fun display(view: View){
    val editText= findViewById<EditText>(R.id.name)
            val s:String =editText.text.toString()
            Toast.makeText(applicationContext,s,Toast.LENGTH_LONG).show()

    }
}
