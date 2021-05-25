package com.example.td

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ForegroundColorSpan
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_more_information.*

class Help : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val gmailLink: TextView = findViewById<View>(R.id.txtcol5) as TextView
        gmailLink.setMovementMethod(LinkMovementMethod.getInstance())

        val phoneLink: TextView = findViewById<View>(R.id.txtcol7) as TextView
        phoneLink.setMovementMethod(LinkMovementMethod.getInstance())

        val color: Int = getResources().getColor(R.color.colorPrimaryDark)
        val text1 = "Welcome to TrashDeal, a unique system developed for the management of waste systematically. We're dedicated to providing you the very best of services in an easy and convenient manner, with an emphasis on technical comfort, privacy of data and the best user experience."
        val text2 = "We the support staff of TrashDeal are here to guide you and answer your questions."
        val text3 = "We hope you enjoy our services as much as we enjoy offering them to you. If you have any questions or comments, please don't hesitate to contact us."
        val text4 = "You can email us your enquiries here at:"
        val text6 = "Or give us a call on:"

        val s1 = SpannableString(text1)
        val s2 = SpannableString(text2)
        val s3 = SpannableString(text3)
        val s4 = SpannableString(text4)
        val s6 = SpannableString(text6)
        val ssgreen = ForegroundColorSpan(color)

        s1.setSpan(ssgreen, 204, 269, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s2.setSpan(ssgreen, 7, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s3.setSpan(ssgreen, 137, 148, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s4.setSpan(ssgreen, 8, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s6.setSpan(ssgreen, 13, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        txtcol1.text = s1
        txtcol2.text = s2
        txtcol3.text = s3
        txtcol4.text = s4
        txtcol6.text = s6

        supportActionBar!!.title = "Help"
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miItem1 -> startActivity(Intent(this, Dashboard::class.java));
                R.id.miItem2 -> startActivity(Intent(this, MyProfile::class.java));
                R.id.miItem4 -> startActivity(Intent(this, PointsDetails::class.java));
                R.id.miItem6 -> startActivity(Intent(this, TandC2::class.java));
                R.id.miItem3 -> startActivity(Intent(this, Help::class.java));
                R.id.miItem8 -> startActivity(Intent(this, MoreInformation::class.java));
            }
            true
        }


    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
