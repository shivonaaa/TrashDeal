package com.example.td

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import kotlinx.android.synthetic.main.activity_bin.*
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_dashboard.drawerLayout
import kotlinx.android.synthetic.main.main_nav_drawer.*

class Dashboard : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        supportActionBar!!.title = "My Dashboard"
        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        naView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miItem1 ->  startActivity(Intent(this, Dashboard::class.java));
                R.id.miItem2 ->  startActivity(Intent(this, MyProfile::class.java));
                R.id.miItem4 ->  startActivity(Intent(this, PointsDetails::class.java));
                R.id.miItem6 ->  startActivity(Intent(this, TandC2::class.java));
                R.id.miItem3 ->  startActivity(Intent(this, Help::class.java));
                R.id.miItem8 ->  startActivity(Intent(this, MoreInformation::class.java));
            }
            true
        }
        val bin_btn = findViewById<Button>(R.id.buttonbin)

        bin_btn.setOnClickListener {
            startActivity(Intent(this, Bin::class.java));
            finish()
        }
        val points_btn = findViewById<Button>(R.id.buttonscore)

        points_btn.setOnClickListener {
            startActivity(Intent(this, Points::class.java));
            finish()
        }
        val bins_near = findViewById<Button>(R.id.buttonbinsnear)

        bins_near.setOnClickListener {
            startActivity(Intent(this, BinsNearMe::class.java));
            finish()
        }
        val trash_history = findViewById<Button>(R.id.buttonhistory)

        trash_history.setOnClickListener {
            startActivity(Intent(this, TrashHistory::class.java));
            finish()
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}

