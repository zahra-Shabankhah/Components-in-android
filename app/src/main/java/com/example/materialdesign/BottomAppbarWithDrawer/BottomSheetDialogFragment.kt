package com.example.materialdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.navigation.NavigationView


class BottomNavigationDrawerFragment : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view: View= inflater.inflate(R.layout.fragment_bottomsheet, container, false)

        val navigationView:NavigationView = view.findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav1 -> {
                    Toast.makeText(context, "search is clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.nav2 -> {
                    Toast.makeText(context, "more is clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
        return view
    }

}