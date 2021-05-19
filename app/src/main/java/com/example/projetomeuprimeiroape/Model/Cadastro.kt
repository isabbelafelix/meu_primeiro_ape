package com.example.projetomeuprimeiroape.Model

class Cadastro(
        var nome: String,
        var email: String,
        var senha: String

) {

    fun validarNome() : Boolean {
        return nome != ""
    }

    fun validarEmail() : Boolean {
        return email.contains("@") && email.contains(".com")
    }

    fun validarSenha() : Boolean {
        return senha.length >= 8
    }
}