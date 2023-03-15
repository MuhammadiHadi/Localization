package com.example.localization

import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val button=this.findViewById<Button>(R.id.urdu)
        val button2=this.findViewById<Button>(R.id.button)



        button2.setOnClickListener {

            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                button.visibility=View.VISIBLE
            },3000)
        }


        button.setOnClickListener {
            val locale = Locale("ur", "PK")
            val res: Resources = this.getResources()
            val config = Configuration(res.getConfiguration())
            config.setLocale(locale)
            res.updateConfiguration(config, res.getDisplayMetrics())
            val intent = intent
            finish()
            startActivity(intent)
        }
    }
}