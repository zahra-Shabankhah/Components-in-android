package com.example.materialdesign.BottomAppbarWithDrawer
// totorial link: https://www.youtube.com/watch?v=xzqTOtTiyAc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.materialdesign.BottomNavigationDrawerFragment
import com.example.materialdesign.R
import com.example.materialdesign.databinding.ActivityBottomAppBarBinding
import com.google.android.material.bottomappbar.BottomAppBar

class BottomAppBarActivity : AppCompatActivity() {
    lateinit var binding : ActivityBottomAppBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBottomAppBarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.search -> {
                    Toast.makeText(this, "search is clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.more -> {
                    Toast.makeText(this, "more is clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        binding.bottomAppBar.setNavigationOnClickListener {

           val b= BottomNavigationDrawerFragment()
           b.show(supportFragmentManager,"TAG")

            Toast.makeText(this, "Navigation is clicked", Toast.LENGTH_SHORT).show()
        }

        binding.floatingActionBar.setOnClickListener {

            if (binding.bottomAppBar.fabAlignmentMode==BottomAppBar.FAB_ALIGNMENT_MODE_CENTER){
                binding.floatingActionBar.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_left_24))
                binding.bottomAppBar.fabAlignmentMode=BottomAppBar.FAB_ALIGNMENT_MODE_END}
            else{
                binding.floatingActionBar.setImageDrawable(getResources().getDrawable(R.drawable.ic_addd_24dp))
                binding.bottomAppBar.fabAlignmentMode=BottomAppBar.FAB_ALIGNMENT_MODE_CENTER

            }
        }
    }
}