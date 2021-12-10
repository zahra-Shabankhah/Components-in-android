package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesign.databinding.ActivityComponentExampleBinding
import com.example.materialdesign.databinding.ActivityToggleBtnBinding

class ToggleBtnActivity : AppCompatActivity() {
    lateinit var binding : ActivityToggleBtnBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToggleBtnBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toggleButton.addOnButtonCheckedListener { toggleButton, checkedId, isChecked ->

            when(checkedId){
                R.id.button1 -> {
                    Toast.makeText(this, "button1", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.button2 -> {
                    Toast.makeText(this, "button2", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.button3 -> {
                    Toast.makeText(this, "button3", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}