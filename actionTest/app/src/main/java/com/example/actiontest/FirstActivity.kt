package com.example.actiontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import com.example.actiontest.databinding.FirstLayoutBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: FirstLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button1.setOnClickListener {
            Toast.makeText(
                this,
                "You clicked Button1 New ",
                Toast.LENGTH_SHORT
            ).show()
            finish()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mian, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.add_item -> Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show()
        }

        return true
    }
}