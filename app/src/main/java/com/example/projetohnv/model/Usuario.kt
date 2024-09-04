package com.example.projetohnv.model

import java.io.Serializable

data class Usuario(
    val Codigo_mobile: String,
    val Cpf: String,
    val Email: String,
    val Id: String,
    val Nome: String,
    val Senha: String,
    val Situacao: String,
    val Telefone: String
): Serializable