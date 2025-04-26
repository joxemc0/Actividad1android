package com.example.actividad2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)


        }
        val Buton1 = findViewById<Button>(R.id.buton1)
        val Buton2 = findViewById<Button>(R.id.buton2)

        Buton1
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)





            }
        }
    }

}