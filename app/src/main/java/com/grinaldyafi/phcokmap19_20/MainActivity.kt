package com.grinaldyafi.phcokmap19_20


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

fun phco(view : View) {

    val intent = Intent(this, mainlist::class.java)
       startActivity(intent)
 }

    fun abouts(view: View) {
        val abouts = Intent(this, About::class.java)
        startActivity(abouts)
    }


}

