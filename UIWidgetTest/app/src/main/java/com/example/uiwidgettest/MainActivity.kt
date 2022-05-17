package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.uiwidgettest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        val view = binding.root

        setContentView(view)
        binding.button1.setOnClickListener {
            val inputText = binding.editText.text.toString()
            Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show()
            binding.imageView.setImageResource(R.drawable.ic_launcher_foreground)
            if (binding.progress.visibility == View.VISIBLE) {
                binding.progress.visibility = View.GONE
            } else {
                binding.progress.visibility = View.VISIBLE
            }
            binding.progress.progress = binding.progress.progress + 10
            AlertDialog.Builder(this).apply {
                setTitle("This is Dialog")
                setMessage("Something important")
                setCancelable(false)
                setPositiveButton("Ok") { dialog, which -> }
                setNegativeButton("Cancel") { dialog, wicth -> }
            }.show()
        }
        val data = mutableListOf("Hello", "World", "Jungle")
        repeat(20) {
            data.add("Hi")
        }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            data
        )
        binding.listView.adapter = adapter

    }


}