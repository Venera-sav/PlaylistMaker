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

        val buttonSearch = findViewById<Button>(R.id.buttonSearch)
        val buttonMedia = findViewById<Button>(R.id.buttonMedia)
        val buttonSettings = findViewById<Button>(R.id.buttonSettings)

        buttonSearch.setOnClickListener {
            val searchIntent = Intent(this, SearchActivity::class.java)
            startActivity(searchIntent)
        }


        buttonMedia.setOnClickListener {
            val mediaIntent = Intent(this, MediatechActivity::class.java)
            startActivity(mediaIntent)
        }

            buttonSettings.setOnClickListener {
                val settingsIntent = Intent(this, SettingsActivity::class.java)
                startActivity(settingsIntent)
            }
        }
    }

