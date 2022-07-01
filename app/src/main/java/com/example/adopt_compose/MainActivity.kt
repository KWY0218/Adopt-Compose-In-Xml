package com.example.adopt_compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adopt_compose.databinding.ActivityMainBinding
import com.example.adopt_compose.presentation.ui.RuleList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainCp.setContent { RuleList() }
    }
}
