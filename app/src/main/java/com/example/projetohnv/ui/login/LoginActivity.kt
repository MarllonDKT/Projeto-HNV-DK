package com.example.projetohnv.ui.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetohnv.MainActivity
import com.example.projetohnv.databinding.ActivityLoginBinding
import com.example.projetohnv.model.Usuario

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnLogin.setOnClickListener {
            val usuario = Usuario(
                //Cpf verdadeiro 78885983073
                //Senha veradadeira 37038958887
                "555",
                "123",
                "marcelo.teste@hinovamobile.com.br",
                "3555",
                "Marcelo Teste",
                "123",
                "ATIVO",
                "31-9999-5551"
            )
            val editCpf = binding.editCpf.text.toString()
            val editSenha = binding.editSenha.text.toString()
            if (editCpf == "123" && editSenha == "123") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {

                /*   when{
                            editCpf.isEmpty() ->{
                                binding.editCpf.error = "Preencha o Cpf!"
                            }
                            editSenha.isEmpty() ->{
                                binding.editSenha.error = "Preencha a Senha!"
                            }
                        }*//*
                        Toast.makeText(
                            this,
                            "Cpf ou Senha, Invalidos",
                            Toast.LENGTH_SHORT
                        ).show()

                 */
            }
        }
    }
}
