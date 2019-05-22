package com.example.lol.myapplication

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val usernameEdtTxt = findViewById<EditText>(R.id.txtUserCD)
        //Testo Senha
        val passwordEdtTxt = findViewById<EditText>(R.id.txtSenhaCD)
        //Botão de login
        val finishedBtn = findViewById<Button>(R.id.btnFinished)

        finishedBtn.setOnClickListener()
        {
            if(usernameEdtTxt.text.toString() != "" && passwordEdtTxt.text.toString() != ""){

                val intent = Intent()
                intent.putExtra("loginCadastro", usernameEdtTxt.text.toString())
                intent.putExtra("senhaCadastro", passwordEdtTxt.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            } else{

                Toast.makeText(this, "Login e senhs inválidos", Toast.LENGTH_LONG).show()
            }

        }
    }
}
