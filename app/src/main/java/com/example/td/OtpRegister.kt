package com.example.td

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class OtpRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_register)


        val verifyBtn = findViewById<Button>(R.id.verifyBtn)




        verifyBtn.setOnClickListener {
            startActivity(Intent(this, RegisterUser::class.java));
            finish()
        }

    }
}