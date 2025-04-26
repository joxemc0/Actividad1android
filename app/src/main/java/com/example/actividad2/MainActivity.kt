package com.example.actividad2

import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        val btnenviar = findViewById<AppCompatButton>(R.id.btn)
        val etName = findViewById<AppCompatEditText>(R.id.edittextx)

        btnenviar.setOnClickListener{
            val tedit = etName.text.toString()
            if(tedit.isNotEmpty()){
                Log.i("nombre","este es el msj $tedit")
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("txtnombre",tedit)
                startActivity(intent)

            }

        }

    }


}