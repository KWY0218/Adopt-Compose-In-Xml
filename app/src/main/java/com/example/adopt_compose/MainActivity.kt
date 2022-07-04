package com.example.adopt_compose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.adopt_compose.databinding.ActivityMainBinding
import com.example.adopt_compose.presentation.ui.RuleList
import com.example.adopt_compose.presentation.ui.pentagon.GetPentagon

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainCp.setContent { RuleList() }
        binding.mainCp2.setContent { GetPentagon() }
        binding.mainChargeTv.setTextColor(ContextCompat.getColor(this, R.color.back_gray))

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.test1 -> {
                    binding.bottomNavigationView.background = ContextCompat.getDrawable(this, R.drawable.bottom_shape)
                    true
                }
                R.id.test2 -> {
                    binding.bottomNavigationView.background = ContextCompat.getDrawable(this, R.drawable.bottom_shape2)
                    true
                }
                else -> {
                    binding.bottomNavigationView.background = ContextCompat.getDrawable(this, R.drawable.bottom_shape3)
                    true
                }
            }
        }
    }
}
