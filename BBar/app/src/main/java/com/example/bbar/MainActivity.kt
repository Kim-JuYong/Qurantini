package com.example.bbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewFinal()
    }
    fun initViewFinal() {
        setSupportActionBar(main_toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.search_icon_white)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val host = nav_host_fragment as NavHostFragment
        val navController = host.navController
        main_toolbar.title=""
        navController.addOnDestinationChangedListener{_, destination, _ ->
            // 화면이 바뀔때 키보드 무조건 숨김
            val dest: String = try{
                resources.getResourceName(destination.id)
            } catch (e: Exception){
                return@addOnDestinationChangedListener
            }
            handleToolbar(destination)
        }
    }

    private fun handleToolbar(destination: NavDestination) {
        when (destination.id) {
            R.id.navMainFragment -> {
                main_toolbar.title = ""
                main_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                supportActionBar?.show()
            }
            R.id.navCartMainFragment -> {
                main_toolbar.title = ""
                main_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                supportActionBar?.hide()
            }
            R.id.navFavoriteMainFragment -> {
                main_toolbar.title = ""
                main_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                supportActionBar?.hide()
            }
            R.id.navMainFragment2 -> {
                main_toolbar.title = ""
                main_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                supportActionBar?.hide()
            }
            R.id.navSearchFragment -> {
                main_toolbar.title = ""
                main_drawer_layout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
                supportActionBar?.hide()
            }
        }
    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.main_toolbar, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when(item.itemId){
                android.R.id.home -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.navSearchFragment)
                    return true
                }
                R.id.menu_setting_cart -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.navCartMainFragment)
                    return true
                }
                R.id.menu_setting_favorite -> {
                    findNavController(R.id.nav_host_fragment).navigate(R.id.navFavoriteMainFragment)
                    return true
                }
                else -> return super.onOptionsItemSelected(item)
            }
        }


}