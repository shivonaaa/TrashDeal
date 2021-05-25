package com.example.td

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bin.*
import kotlinx.android.synthetic.main.activity_more_information.*
import kotlinx.android.synthetic.main.activity_more_information.drawerLayout
import kotlinx.android.synthetic.main.activity_more_information.navView

class MoreInformation : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_information)

        val color: Int = getResources().getColor(R.color.colorPrimaryDark)
        val text1 = "Waste management has been a growing corncern in India as we are accumulated tons of waste every single day with no proper sytem to monitor this waste."
        val text2 = "TrashDeal is a small project done by the students of Shrimati Paravati Chowgule College to come up with a solution for such an issue."
        val text3 = "In this project, the user places trash in the bin and based on the weight and type of trash a certain amount of points are given to the user"
        val text4 = "These points are then converted into money and transferred into user's bank account."
        val text5 = "The trash collected is sent to industries for either manure manufacturing or for e-waste collection based on the type of waste delivered by the user."
        val text6 = "This project is a prototype that works for paper waste, in the future this project would be tested different wastes and on a large scale."

        val s1 = SpannableString(text1)
        val s2 = SpannableString(text2)
        val s3 = SpannableString(text3)
        val s4 = SpannableString(text4)
        val s5 = SpannableString(text5)
        val s6 = SpannableString(text6)
        val ssgreen = ForegroundColorSpan(color)

        s1.setSpan(ssgreen, 0, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s2.setSpan(ssgreen, 53, 87, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s3.setSpan(ssgreen, 101, 118, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s4.setSpan(ssgreen, 6, 12, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s5.setSpan(ssgreen, 53, 99, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        s6.setSpan(ssgreen, 99, 137, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        txtcol1.text = s1
        txtcol2.text = s2
        txtcol3.text = s3
        txtcol4.text = s4
        txtcol5.text = s5
        txtcol6.text = s6

        supportActionBar!!.title = "More Information"
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