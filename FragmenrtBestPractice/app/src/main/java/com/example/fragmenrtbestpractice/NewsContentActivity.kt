package com.example.fragmenrtbestpractice

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenrtbestpractice.databinding.ActivityNewsContentBinding
import com.example.fragmenrtbestpractice.databinding.NewsContentFragBinding

class NewsContentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsContentBinding
    private lateinit var fragBinding: NewsContentFragBinding

    companion object {
        fun actionStart(context: Context, title: String, content: String) {
            val intent = Intent(context, NewsContentActivity::class.java).apply {
                putExtra("name_title", title)
                putExtra("news_content", content)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsContentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val title = intent.getStringExtra("news_title")
        val content = intent.getStringExtra("content")
        if (title != null && content != null) {
            val fragment =
                supportFragmentManager.findFragmentById(R.id.newsContentFrag) as NewsContentFragment
            fragment.refresh(title, content)
        }
    }
}