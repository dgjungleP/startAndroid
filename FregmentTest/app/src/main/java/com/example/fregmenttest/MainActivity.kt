package com.example.fregmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fregmenttest.databinding.ActivityMainBinding
import com.example.fregmenttest.databinding.FragmentLeftBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var leftBinding: FragmentLeftBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//        leftBinding = FragmentLeftBinding.bind(binding.rightLayout.rootView)
//        leftBinding.button.setOnClickListener {
//            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
//            replaceFragment(AnotherRightFragment())
//        }
//        replaceFragment(RightFragment())

    }
//
//    private fun replaceFragment(fragment: Fragment) {
//        val manager = supportFragmentManager
//        val transaction = manager.beginTransaction()
//        transaction.replace(R.id.rightLayout, fragment)
//        transaction.addToBackStack(null)
//        transaction.commit()
//    }
}