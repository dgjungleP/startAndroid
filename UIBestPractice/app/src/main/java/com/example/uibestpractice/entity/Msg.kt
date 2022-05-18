package com.example.uibestpractice.entity

class Msg(val content: String, val type: Int) {

    //看起来像枚举
    companion object {
        const val TYPE_RECEIVED = 0
        const val TYPE_SEND = 1
    }
}