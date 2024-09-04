package com.example.projetohnv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetohnv.databinding.ActivityMainBinding
import com.example.projetohnv.fragment.IndicacoesFragment
import com.example.projetohnv.fragment.OficinasFragment


class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val oficinasFragment = OficinasFragment()
        val indicacoesFragment = IndicacoesFragment()

        binding.btnOficinas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcView, oficinasFragment)
                .commit()
        }
        binding.btnIndicacoes.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fcView, indicacoesFragment)
                .commit()
        }
    }
}
