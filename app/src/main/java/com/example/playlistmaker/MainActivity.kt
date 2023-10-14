package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_search = findViewById<Button>(R.id.button_search)
        val button_media = findViewById<Button>(R.id.button_media)
        val button_settings = findViewById<Button>(R.id.button_settings)

        button_search.setOnClickListener {
            val searchIntent = Intent(this, SearchActivity::class.java)
            startActivity(searchIntent)
        }


        button_media.setOnClickListener {
            val mediaIntent = Intent(this, MediatechActivity::class.java)
            startActivity(mediaIntent)
        }

            button_settings.setOnClickListener {
                val settingsIntent = Intent(this, SettingsActivity::class.java)
                startActivity(settingsIntent)
            }
        }
    }

