package com.example.playlistmaker

import android.content.Intent
import android.content.Intent.ACTION_SENDTO
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import com.example.playlistmaker.R.id.fromSettings

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val fromSettingsButton = findViewById<Button>(fromSettings)
        fromSettingsButton.setOnClickListener {
            finish()
        }

        val switchTheme = findViewById<SwitchCompat>(R.id.swithTheme)
        switchTheme.setOnCheckedChangeListener { buttonView, isChecked ->
            if (switchTheme.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
        }

        val shareApp = findViewById<Button>(R.id.shareApp)
        val linkAndroidDeveloper = getString(R.string.linkAndroidDeveloper)
        shareApp.setOnClickListener {
            val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,linkAndroidDeveloper)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share To:"))
        }

        val writeToSupport = findViewById<Button>(R.id.writeToSupport)
        val email = getString(R.string.emailOfDeveloper)
        val subject = getString(R.string.subject)
        val message = getString(R.string.message)
        writeToSupport.setOnClickListener {
            val writeIntent = Intent(Intent.ACTION_SENDTO)
            writeIntent.data = Uri.parse("mailto:")
            writeIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            writeIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
            writeIntent.putExtra(Intent.EXTRA_TEXT, message)
            if (intent.resolveActivity(packageManager)!=null) {
                startActivity(writeIntent)
            }
        }

        val agreementVeb = findViewById<Button>(R.id.agreementVeb)
        val link = getString(R.string.agreementVeb)
        val url = Uri.parse(link)
        agreementVeb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, url)
            startActivity(intent)
        }

    }


}