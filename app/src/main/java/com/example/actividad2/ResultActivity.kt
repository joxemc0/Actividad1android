package com.example.actividad2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val txtnombre = findViewById<TextView>(R.id.txtnombre)
        val tvname = intent.extras?.getString("txtnombre").orEmpty()
        txtnombre.text ="hola $tvname"

    }

}