package com.example.projetomeuprimeiroape.Ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.projetomeuprimeiroape.Model.Cadastro
import com.example.projetomeuprimeiroape.R

class TelaCadastroActivity : AppCompatActivity() {

    lateinit var telalogin: TextView
    lateinit var cadastroNome: EditText
    lateinit var cadastroEmail: EditText
    lateinit var cadastroSenha: EditText
    lateinit var botaoCadastro: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cadastro)

        carregarElementos()
        carregarEventos()
    }

    fun carregarElementos(){
        telalogin = findViewById(R.id.text_entrar)
        cadastroNome = findViewById(R.id.text_name_cadastro)
        cadastroEmail = findViewById(R.id.text_email_cadastro)
        cadastroSenha = findViewById(R.id.text_password_cadastro)
        botaoCadastro = findViewById(R.id.button_cadastro)
    }

    fun carregarEventos(){
        telalogin.setOnClickListener {
            val intent = Intent(this, TelaLoginActivity::class.java)
            startActivity(intent)
        }

        botaoCadastro.setOnClickListener {


            val nomeCadastro = cadastroNome.text.toString()
            val emailCadastro = cadastroEmail.text.toString()
            val senhaCadastro = cadastroSenha.text.toString()

            if (nomeCadastro.isEmpty() && emailCadastro.isEmpty() && senhaCadastro.isEmpty()) {
                Toast.makeText(this, "Campos Obrigatórios!", Toast.LENGTH_SHORT).show()
            } else {

                // TODOS OS CAMPOS SENDO PREENCHIDOS CRIA-SE AS PREFERENCIAS COMPARTILHADAS PARA
                // EDITAR E SALVAR OS ARQUIVOS
                // SALVANDO OS DADOS NO SHARED EM SEGUIDA ABRE A TELA DE LOGIN

                val sharedPreferences = getSharedPreferences("cadastro $emailCadastro", Context.MODE_PRIVATE)

                val editarPrefs = sharedPreferences.edit()

                editarPrefs.putString("nome", nomeCadastro)
                editarPrefs.putString("email", emailCadastro)
                editarPrefs.putString("senha", senhaCadastro)

                editarPrefs.apply()

                val loginIntent = Intent(this, TelaLoginActivity::class.java)
                loginIntent.putExtra("intent_email", emailCadastro)
                startActivity(loginIntent)

                finishAffinity()

            }
        }

    }


}

