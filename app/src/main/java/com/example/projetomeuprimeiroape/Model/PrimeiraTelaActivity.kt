package com.example.projetomeuprimeiroape.Model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.projetomeuprimeiroape.R

class PrimeiraTelaActivity : AppCompatActivity() {

        lateinit var telaPrincipal: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primeira_tela)

        carregarElementos()
        carregarEventos()
    }


        fun carregarElementos() {
            telaPrincipal = findViewById<ImageView>(R.id.tela_principal)
        }

        fun carregarEventos() {
            telaPrincipal.setOnClickListener {
                val intent = Intent(this, TelaLoginActivity::class.java)
                startActivity(intent)
            }
        }



}