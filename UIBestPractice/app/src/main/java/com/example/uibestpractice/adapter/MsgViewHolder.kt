package com.example.uibestpractice.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uibestpractice.R

sealed class MsgViewHolder(view: View) : RecyclerView.ViewHolder(view)


class LeftViewHolder(view: View) : MsgViewHolder(view) {
    val leftMsg = view.findViewById<TextView>(R.id.leftMsg)
}

class RightViewHolder(view: View) : MsgViewHolder(view) {
    val rightMsg = view.findViewById<TextView>(R.id.rightMsg)
}
