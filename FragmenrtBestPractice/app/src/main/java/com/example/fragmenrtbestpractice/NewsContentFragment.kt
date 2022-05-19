package com.example.fragmenrtbestpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmenrtbestpractice.databinding.NewsContentFragBinding

class NewsContentFragment : Fragment() {

    private var _binding: NewsContentFragBinding? = null

    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = NewsContentFragBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null

    }

    fun refresh(title: String, content: String) {
        _binding?.let {
            it.contentLayout.visibility = View.VISIBLE
            it.newsTitle.text = title
            it.newsContent.text = content
        }

    }
}