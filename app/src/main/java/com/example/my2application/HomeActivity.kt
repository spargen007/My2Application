package com.example.my2application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup



class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    fun linearactivity(view:View){
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    fun relativeactivity(view:View){
        val intent= Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
    fun constraintactivity(view:View){
        val intent= Intent(this,MainActivity3::class.java)
        startActivity(intent)
    }
}