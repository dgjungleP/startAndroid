package com.example.actiontest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.actiontest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val stringExtra = intent.getStringExtra("extra_data")
        Log.d("SecondActivity", "Extra data is $stringExtra")
        binding.button2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("data_return", "Hello FirstActivity")
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return", "Hello im back")
        setResult(RESULT_OK, intent)
        finish()

    }
}