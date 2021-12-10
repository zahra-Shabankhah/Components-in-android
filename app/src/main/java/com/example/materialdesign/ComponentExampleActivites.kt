package com.example.materialdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.BottomAppbarWithDrawer.BottomAppBarActivity
import com.example.materialdesign.databinding.ActivityComponentExampleBinding

class ComponentExampleActivites : AppCompatActivity() {
    lateinit var binding : ActivityComponentExampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComponentExampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAppbarBottom.setOnClickListener{
            val intent=Intent(this,BottomAppBarActivity::class.java)
            startActivity(intent)
        }
        binding.btnAppbarTop.setOnClickListener{
            val intent=Intent(this,TopAppBarActivity::class.java)
            startActivity(intent)
        }
        binding.btnToggle.setOnClickListener{
            val intent=Intent(this,ToggleBtnActivity::class.java)
            startActivity(intent)
        }

        binding.btnCheckbox.setOnClickListener{
            val intent=Intent(this,CheckBoxActivity::class.java)
            startActivity(intent)
        }

        binding.btnSpinner.setOnClickListener{
            val intent=Intent(this,SpinnerActivity::class.java)
            startActivity(intent)
        }
        binding.btnDialog.setOnClickListener{
            val intent=Intent(this,DialogActivity::class.java)
            startActivity(intent)
        }

    }
}