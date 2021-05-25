package com.example.td

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import kotlinx.android.synthetic.main.activity_more_information.*

class TrashHistory : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trash_history)


        supportActionBar!!.title = "Trash History"
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