package com.example.lab_week_02_c

import android.app.ComponentCaller
import android.content.Intent
import android.os.Bundle
import android.os.Debug
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log
import android.widget.Button

class SingleTopActivity : AppCompatActivity() {
    companion object{
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_top)
        Log.d(DEBUG, "onCreate")

        findViewById<Button>(R.id.button_single_top).setOnClickListener {
            startActivity(
                Intent(this,
                SingleTopActivity::class.java)
            )
        }
    }

    override fun onNewIntent(intent: Intent, caller: ComponentCaller) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "onNewIntent")
    }
}