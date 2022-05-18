package com.example.uibestpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uibestpractice.adapter.MsgAdapter
import com.example.uibestpractice.databinding.ActivityMainBinding
import com.example.uibestpractice.entity.Msg

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val msgList = ArrayList<Msg>()
    private var adapter: MsgAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initMsg()
        val manager = LinearLayoutManager(this)
        binding.recycleView.layoutManager = manager

        adapter = MsgAdapter(msgList)
        binding.recycleView.adapter = adapter
        binding.sned.setOnClickListener {
            val text = binding.inputText.text.toString()
            if (text.isNotEmpty()) {
                with(binding) {
                    val msg = Msg(text, Msg.TYPE_SEND)
                    msgList.add(msg)
                    adapter?.notifyItemInserted(msgList.size - 1)
                    recycleView.scrollToPosition(msgList.size - 1)
                    inputText.setText("")
                }
            }
        }

    }

    private fun initMsg() {
        msgList.add(Msg("Hello Jungle", Msg.TYPE_RECEIVED))
        msgList.add(Msg("yeah man", Msg.TYPE_SEND))
        msgList.add(Msg("Whats up", Msg.TYPE_SEND))
        msgList.add(Msg("No thing specail", Msg.TYPE_RECEIVED))
    }
}