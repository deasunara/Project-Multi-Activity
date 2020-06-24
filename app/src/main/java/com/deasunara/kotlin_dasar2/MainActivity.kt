package com.deasunara.kotlin_dasar2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pressButton1 (view: View){
        val intent = Intent (this@MainActivity, Main2Activity::class.java)
        intent.putExtra("nama", edittxt1.text.toString())
        startActivity(intent)

    }

}
