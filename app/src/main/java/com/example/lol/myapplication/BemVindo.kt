package com.example.lol.myapplication


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BemVindo : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo)

       val txtBemVindo = findViewById<TextView>(R.id.BemVindo)
        val args:Bundle? = intent?.extras
        val nome:String? = args?.getString("user")
        txtBemVindo.setText(txtBemVindo.text.toString() + ". " + nome)
    }
}
