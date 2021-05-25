package com.example.td

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.airbnb.lottie.LottieAnimationView
import pl.droidsonroids.gif.GifImageView

class GettingStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getting_started)
        val getstartedbtn =  findViewById<Button>(R.id.getstartedbtn)

        getstartedbtn.setOnClickListener {
            startActivity(Intent(this, IntroVideo::class.java));
            finish()
        }
    }
}