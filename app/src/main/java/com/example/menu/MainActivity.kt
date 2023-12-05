package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    // res 우클 > new > New Resource Directory Resource type : menu 으로 폴더 생성. -> 그 폴더에 menu activity 생성


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home -> Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            R.id.information -> Toast.makeText(this, "Information", Toast.LENGTH_SHORT).show()
            R.id.setting -> Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


}