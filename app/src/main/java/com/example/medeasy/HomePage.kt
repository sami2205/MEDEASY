package com.example.medeasy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
        var button2=findViewById<Button>(R.id.category_1)
        var button3=findViewById<Button>(R.id.category_2)
        var button4=findViewById<Button>(R.id.category_3)
        button2.setOnClickListener{
            val intent2 = Intent(this,Lab_test::class.java)
            startActivity(intent2)

        }
        button3.setOnClickListener{
            val intent2 = Intent(this,products::class.java)
            startActivity(intent2)

        }
        button4.setOnClickListener{
            val intent2 = Intent(this,cart::class.java)
            startActivity(intent2)

        }


       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.category_1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.category_2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.category_3)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}