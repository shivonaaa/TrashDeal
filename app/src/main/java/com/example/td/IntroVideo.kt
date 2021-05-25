package com.example.td

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView

class IntroVideo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_intro_video)
        val videoView = findViewById<VideoView>(R.id.videoView)
        val skipBtn =  findViewById<TextView>(R.id.skipBtn)
        val video = Uri.parse("android.resource://" + packageName + "/" + R.raw.video)
        videoView.setVideoURI(video)
        videoView.setOnCompletionListener(MediaPlayer.OnCompletionListener {
            startActivity(Intent(applicationContext, TandC::class.java))
            finish()
        })
        videoView.start()
        skipBtn.setOnClickListener {
            startActivity(Intent(this, TandC::class.java));
            finish()
        }
    }
}

