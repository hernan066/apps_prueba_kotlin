package com.example.primeraapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.primeraapp.firstapp.FirstAppActivity
import com.example.primeraapp.imccalculator.ImcCalculatorActivity
import com.example.primeraapp.todoapp.TodoActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnFirstApp = findViewById<Button>(R.id.btn_firstApp)
        val btnImcApp = findViewById<Button>(R.id.btn_imcApp)
        val btnTODO = findViewById<Button>(R.id.btn_TODO)

        btnFirstApp.setOnClickListener { navigateToFirstApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener {  navigateToTODOApp() }
    }

    private fun navigateToFirstApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTODOApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }
}