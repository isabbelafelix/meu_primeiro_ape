package com.example.projetomeuprimeiroape.Model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.projetomeuprimeiroape.R

class TelaCadastroActivity : AppCompatActivity() {

    lateinit var telalogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cadastro)

        carregarElementos()
        carregarEventos()
    }

    fun carregarElementos(){
        telalogin = findViewById<TextView>(R.id.text_entrar)
    }

    fun carregarEventos(){
        telalogin.setOnClickListener {
            val intent = Intent(this, TelaLoginActivity::class.java)
            startActivity(intent)
        }

    }


}

