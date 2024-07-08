package com.example.medeasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class products : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_products)
        var button4=findViewById<Button>(R.id.category_medicines)
        button4.setOnClickListener{
            val intent1 = Intent (this,MEDICINES::class.java)
            startActivity(intent1)

        }
        var button5=findViewById<Button>(R.id.category_supplements)
        button5.setOnClickListener{
            val intent1 = Intent (this,SUPLEMENTS::class.java)
            startActivity(intent1)

        }
        var button6=findViewById<Button>(R.id.category_health_food)
        button6.setOnClickListener{
            val intent1 = Intent (this,HEALTHYFOOD::class.java)
            startActivity(intent1)

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.category_medicines)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.category_supplements)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.category_health_food)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}