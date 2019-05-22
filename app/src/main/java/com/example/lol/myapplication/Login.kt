package com.example.lol.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    val user : String = "aidetiquinho"
    val password : String = "remedinho"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //Texto username
        val usernameEdtTxt = findViewById<EditText>(R.id.txtUser)
        //Testo Senha
        val passwordEdtTxt = findViewById<EditText>(R.id.txtSenha)
        //Botão de login
        val loginBtn = findViewById<Button>(R.id.Loginbutton)
        //Botão de Cadastro
        val cadastroBtn = findViewById<Button>(R.id.CadastroButton)

        loginBtn.setOnClickListener()
        {
            LoginCheck(usernameEdtTxt , passwordEdtTxt)
        }

        cadastroBtn.setOnClickListener()
        {
            val intent = Intent(this , Cadastro::class.java)
            startActivityForResult(intent, 1)
        }
    }

    fun LoginFailed()
    {
        Toast.makeText(this,"Usuàrio ou senha incorretos! Tente Novamente",Toast.LENGTH_LONG).show()
    }

    fun LoginSucessful(user : String)
    {
        val intent = Intent(this, BemVindo::class.java)
        intent.putExtra("User", user)
        startActivity(intent)
    }

    fun LoginCheck(userInput : EditText , passwordInput : EditText)
    {
        if(userInput.text.toString() == user && passwordInput.text.toString() == password)
        {
            LoginSucessful(userInput.text.toString())
        }

        else
        {
            LoginFailed()
        }
    }

}
