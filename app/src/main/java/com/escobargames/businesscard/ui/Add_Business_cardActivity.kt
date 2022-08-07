package com.escobargames.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.escobargames.businesscard.databinding.ActivityAddBusinessCardBinding

class Add_Business_cardActivity : AppCompatActivity() {
    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListerners()
    }
    private fun insertListerners(){
        binding.btnClose.setOnClickListener {
            finish()
        }
        binding.btnConfirma.setOnClickListener {

        }
    }
}