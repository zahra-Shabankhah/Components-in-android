package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.materialdesign.databinding.ActivitySpinnerBinding

class SpinnerActivity : AppCompatActivity() {
    lateinit var binding:ActivitySpinnerBinding
    lateinit var planetArray:Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpinnerBinding.inflate(layoutInflater)
        setContentView(binding.root)
// Create an ArrayAdapter using the string array and a default spinner layout
/*        ArrayAdapter.createFromResource(
            this,
            R.array.planets_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            binding.spinner.adapter = adapter
        }*/

         planetArray= resources.getStringArray(R.array.planets_array)
        var selectedText = planetArray.first() // as default

        if (binding.spinner != null) {
            val adapter = ArrayAdapter( this, android.R.layout.simple_spinner_dropdown_item, planetArray )
            binding.spinner.adapter = adapter

            binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    selectedText = planetArray[position]
                    when(selectedText){
                        "planet" -> {
                            Toast.makeText(this@SpinnerActivity, "button1", Toast.LENGTH_SHORT).show()
                            true
                        }
                        "planet2"  -> {
                            Toast.makeText(this@SpinnerActivity, "button2", Toast.LENGTH_SHORT).show()
                            true
                        }
                        "planet3"  -> {
                            Toast.makeText(this@SpinnerActivity, "button3", Toast.LENGTH_SHORT).show()
                            true
                        }
                        else -> false
                    }
                    }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }


                }
            }
        }




/*
    override  fun onItemSelected(parent: AdapterView<*>?, p1: View?, pos: Int, p3: Long) {
        when(parent?.getItemAtPosition(pos).toString()){
            "planet" -> {
                Toast.makeText(this@SpinnerActivity, "button1", Toast.LENGTH_SHORT).show()
                true
            }
            "planet2"  -> {
                Toast.makeText(this@SpinnerActivity, "button2", Toast.LENGTH_SHORT).show()
                true
            }
            "planet1"  -> {
                Toast.makeText(this@SpinnerActivity, "button3", Toast.LENGTH_SHORT).show()
                true
            }
            else -> false
        }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
    }*/
