package com.example.rem_digits_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rem_digits_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.training.setOnClickListener{
            startActivity(Intent(this, TrainingActivity::class.java))
        }

        binding.challenge.setOnClickListener{
            startActivity(Intent(this, ChallengeActivity::class.java))
        }
    }
}