package com.example.td

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bin.*
import kotlinx.android.synthetic.main.activity_bin.drawerLayout
import kotlinx.android.synthetic.main.activity_bin.navView
import kotlinx.android.synthetic.main.activity_mobno_register.*
import kotlinx.android.synthetic.main.activity_more_information.*

class TandC2 : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tand_c2)



        supportActionBar!!.title = "Terms and Conditions"
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