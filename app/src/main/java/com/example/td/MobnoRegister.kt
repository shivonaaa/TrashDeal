package com.example.td

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.hbb20.CountryCodePicker

class MobnoRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobno_register)

        val ccp = findViewById<CountryCodePicker>(R.id.ccp).selectedCountryCode.toString()
        val phoneNo = findViewById<EditText>(R.id.phone)
        val nextBtn = findViewById<Button>(R.id.getOtpBtn)
        val backbtn = findViewById<ImageView>(R.id.backimg)




        nextBtn.setOnClickListener {
            startActivity(Intent(this, OtpRegister::class.java));
            finish()
        }

    }
}