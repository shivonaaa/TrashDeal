package com.example.td

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TandC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tand_c)

        val acceptbtn =  findViewById<Button>(R.id.bt_accept)
        val declinebtn =  findViewById<Button>(R.id.bt_decline)

        acceptbtn.setOnClickListener {
            startActivity(Intent(this, MobnoRegister::class.java));
            finish()
        }
        declinebtn.setOnClickListener {
            startActivity(Intent(this, GettingStarted::class.java));
            finish()
        }
    }
}