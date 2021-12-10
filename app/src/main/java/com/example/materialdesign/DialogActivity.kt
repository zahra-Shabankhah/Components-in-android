package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesign.databinding.ActivityDialogBinding
import com.google.android.material.chip.Chip
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class DialogActivity : AppCompatActivity() {
    lateinit var binding:ActivityDialogBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Dialog
        MaterialAlertDialogBuilder(this)
            .setCancelable(false)
            .setTitle(resources.getString(R.string.title))
            .setMessage(resources.getString(R.string.supporting_text))
            .setNeutralButton(resources.getString(R.string.cancel)) { dialog, which ->
                // Respond to neutral button press
            }
            .setNegativeButton(resources.getString(R.string.decline)) { dialog, which ->
                // Respond to negative button press
            }
            .setPositiveButton(resources.getString(R.string.accept)) { dialog, which ->
                // Respond to positive button press
            }
            .show()

        Toast.makeText(this, "yes", Toast.LENGTH_SHORT).show()


        binding.chipGroup.setOnCheckedChangeListener { group, checkedId ->
           val chip: Chip =group.findViewById(checkedId)

               when(checkedId){
                   R.id.chip1 -> {
                    Toast.makeText(this, "button1", Toast.LENGTH_SHORT).show()
                    true
                }
                   R.id.chip2 -> {
                    Toast.makeText(this, "button2", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.chip3 -> {
                    Toast.makeText(this, "button3", Toast.LENGTH_SHORT).show()
                    true
                }
               else -> false
            }
            }
        }
    }
