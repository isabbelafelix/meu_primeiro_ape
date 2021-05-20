package com.example.projetomeuprimeiroape.Ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetomeuprimeiroape.R

class TelaDicasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_dicas)

        val email = intent.getStringExtra("intent_email")

        val sharedPrefs = getSharedPreferences("cadastro $email", Context.MODE_PRIVATE)

    }
}