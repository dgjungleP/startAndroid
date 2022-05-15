package com.example.actiontest

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.actiontest.databinding.FirstLayoutBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: FirstLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstLayoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val registerForActivityResult =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                val returnData = it.data?.getStringExtra("data_return")
                Log.d("FirstActivity", "Return data is $returnData")
            }

        binding.button1.setOnClickListener {
            Toast.makeText(
                this,
                "You clicked Button1 New ",
                Toast.LENGTH_SHORT
            ).show()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("extra_data", "Hello im Jungle")
            registerForActivityResult.launch(intent)
        }
        binding.button2.setOnClickListener {
//            val intent = Intent(Intent.ACTION_VIEW)
            val intent = Intent("android.intent.action.VIEW")
            intent.data = Uri.parse("https://www.baidu.com")
            startActivity(intent)
        }


    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mian, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT)
                .show()
        }

        return true
    }
}