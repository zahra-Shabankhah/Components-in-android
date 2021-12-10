package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.example.materialdesign.databinding.ActivityCheckBoxBinding
import com.example.materialdesign.databinding.ActivityComponentExampleBinding

class CheckBoxActivity : AppCompatActivity() {
    lateinit var binding : ActivityCheckBoxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // To listen for a checkbox
        binding.checkBox2.setOnCheckedChangeListener { buttonView, isChecked->
            binding.checkBox5.isEnabled=true
            binding.checkBox1.isEnabled=false
            binding.checkBox1.isChecked = false
        }

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            // Responds to child RadioButton checked/unchecked
            when(checkedId){
                R.id.radio_button_1 -> {
                    Toast.makeText(this, "button1", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.radio_button_2 -> {
                    Toast.makeText(this, "button2", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.radio_button_3 -> {
                    Toast.makeText(this, "button3", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

    }
    fun onRadiobuttonClicked(v: View){
        if (v is RadioButton){
            val checked= v.isChecked
            when(v.getId()){
                R.id.radio_button_1  -> if(checked){}
            }
        }
    }
}