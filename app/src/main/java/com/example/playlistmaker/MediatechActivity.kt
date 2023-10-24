package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MediatechActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mediatech)

        val fromMediatechButton = findViewById<LinearLayout>(R.id.fromMediatech)

        fromMediatechButton.setOnClickListener {
            finish()
        }
    }
}