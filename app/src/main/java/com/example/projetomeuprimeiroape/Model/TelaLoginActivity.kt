package com.example.projetomeuprimeiroape.Model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.projetomeuprimeiroape.R

class TelaLoginActivity : AppCompatActivity() {

    lateinit var telaCadastro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        carregarElementos()
        carregarEventos()
    }

    fun carregarElementos(){
        telaCadastro = findViewById<TextView>(R.id.cadastre)

    }

    fun carregarEventos(){
        telaCadastro.setOnClickListener {
            val intent = Intent(this, TelaCadastroActivity::class.java)
            startActivity(intent)
        }

    }

}