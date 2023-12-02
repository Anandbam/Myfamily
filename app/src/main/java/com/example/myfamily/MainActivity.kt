package com.example.myfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        

        val bottonBar = findViewById<BottomNavigationView>(R.id.botton_bar )

        bottonBar.setOnItemSelectedListener {menuItem ->


            when (menuItem.itemId) {
                R.id.nav_home -> {
                    inflateFragment(HomeFragment.newInstance())
                }
                R.id.nav_Dashboard -> {
                    inflateFragment(DashboardFragment.newInstance())
                }
                R.id.nav_guard -> {
                    inflateFragment(GuardFragment.newInstance())
                }
                R.id.nav_profile -> {
                    inflateFragment(ProfileFragment.newInstance())
                }
            }


        
            true

        }
        bottonBar.selectedItemId = R.id.nav_home
    }

    private fun inflateFragment(newInstance:Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newInstance)
        transaction.commit()
    }

}
