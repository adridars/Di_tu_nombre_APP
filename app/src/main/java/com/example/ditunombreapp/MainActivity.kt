package com.example.ditunombreapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import com.example.ditunombreapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ingresarButton.setOnClickListener { checkValue() }

    }

      private fun checkValue() {
      if(binding.etName.text.isNotEmpty()){
          val intent = Intent(this, ResultActivity :: class.java)
          intent.putExtra("INTENT_NAME", binding.etName.text.toString())
          startActivity(intent)
      }else{
          Toast.makeText(this,"haven't write your name yet!",Toast.LENGTH_SHORT).show()

      }
    }
}