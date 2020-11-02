package com.putya.e_commerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_text_sizing.*

class TextSizing : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_sizing)

        rb_large.setOnClickListener {
            tvName.textSize = 50f
        }
        radio_medium.setOnClickListener {
            tvName.textSize = 40f
        }
        radio_short.setOnClickListener {
            tvName.textSize = 30f
        }
    }
}