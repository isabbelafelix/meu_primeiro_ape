package com.example.projetomeuprimeiroape.Model

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.projetomeuprimeiroape.R

class TelaLoginActivity : AppCompatActivity() {

    lateinit var telaCadastro: TextView
    lateinit var btnLogin: Button
    lateinit var textEmail: EditText
    lateinit var textSenha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)

        carregarElementos()
        carregarEventos()
    }

    fun carregarElementos(){
        telaCadastro = findViewById<TextView>(R.id.cadastre)
        btnLogin = findViewById(R.id.button)
        textEmail = findViewById(R.id.text_email)
        textSenha = findViewById(R.id.text_senha)

    }

    fun carregarEventos(){

        btnLogin.setOnClickListener {

            //CAPTURAR DADOS DIGITADOS
            val email = textEmail.text.toString().trim().toLowerCase()
            val senha = textSenha.text.toString().trim()

            //VALIDAR
            if (email.isEmpty()) {
                textEmail.error = "Dados Obrigtórios"
                textEmail.requestFocus()
        }else if (senha.isEmpty()) {
                textSenha.error = "Dados Obrigatórios"
                textSenha.requestFocus()
            }else {
                val sharedPrefs = getSharedPreferences("cadastro $email", Context.MODE_PRIVATE)

                val emailPrefs = sharedPrefs.getString("email", "")
                val senhaPrefs = sharedPrefs.getString("senha", "")


                // VERIFICAR EMAIL E SENHA
                if (email == emailPrefs && senha == senhaPrefs){
                    Toast.makeText(this, "Login Válido", Toast.LENGTH_SHORT).show()


                    // ABRIR A TELA DE DICAS


                    //PASSAR INFORMAÇÕES
                    intent.putExtra("intent_email", email)
                    startActivity(intent)
                    finish()
                }else {
                    // LOGIN INVÁLIDO
                    Toast.makeText(this, "E-mail ou Senha Inválidos", Toast.LENGTH_SHORT).show()
                }
            }
        }

        telaCadastro.setOnClickListener {
            val intent = Intent(this, TelaCadastroActivity::class.java)
            startActivity(intent)
        }

    }

}