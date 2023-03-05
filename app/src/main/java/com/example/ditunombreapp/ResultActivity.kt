package com.example.ditunombreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ditunombreapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getAndShowName()
        binding.btnBack.setOnClickListener { onBackPressedDispatcher.onBackPressed() }

    }
     private fun getAndShowName (){
        val bundle = intent.extras
        val name = bundle?.getString("INTENT_NAME")
        binding.tVGreetings.text = "Hola $name"
    }
}

