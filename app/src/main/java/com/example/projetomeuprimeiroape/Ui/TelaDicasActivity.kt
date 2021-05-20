package com.example.projetomeuprimeiroape.Ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projetomeuprimeiroape.R
import com.example.projetomeuprimeiroape.Ui.Fragments.FragmentsMainActivity

class TelaDicasActivity : AppCompatActivity() {

    lateinit var telaAluguel: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_dicas)

//        val email = intent.getStringExtra("intent_email")
//
//        val sharedPrefs = getSharedPreferences("cadastro $email", Context.MODE_PRIVATE)

        carregarElementos()
        carregarEventos()

    }

    fun carregarElementos(){
        telaAluguel = findViewById(R.id.buttonAluguel)

    }

    fun carregarEventos() {
        telaAluguel.setOnClickListener {
            val intent = Intent(this, FragmentsMainActivity::class.java)
            startActivity(intent)
        }

    }
}