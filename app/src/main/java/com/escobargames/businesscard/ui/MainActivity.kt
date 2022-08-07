package com.escobargames.businesscard.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.escobargames.businesscard.R
import com.escobargames.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }
    private fun insertListeners(){
        binding.fab.setOnClickListener {
            val intent = Intent(this@MainActivity,Add_Business_cardActivity::class.java)
            startActivity(intent)
        }
    }
}