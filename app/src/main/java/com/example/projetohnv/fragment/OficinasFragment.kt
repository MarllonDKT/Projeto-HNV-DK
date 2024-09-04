package com.example.projetohnv.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetohnv.API.OficinasAPI
import com.example.projetohnv.API.RetrofitHelper
import com.example.projetohnv.R
import com.example.projetohnv.adapter.OficinasAdapter
import com.example.projetohnv.model.ClasseRetornoOficina
import com.example.projetohnv.model.ListaOficinas
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class OficinasFragment : Fragment() {
    val retrofit by lazy {
        RetrofitHelper.retrofit
    }
    private lateinit var rvOficina: RecyclerView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvOficina = view.findViewById(R.id.rvOficinas)

        CoroutineScope(Dispatchers.IO).launch {
            recuperarOficina()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_oficinas,
            container,
            false
        )
        return view
    }

    private suspend fun recuperarOficina() {
        var retorno: Response<ClasseRetornoOficina>? = null
        val codigoAssociado = 601
        val cpfAssociado = ""
        try {
            val oficinasAPI = retrofit.create(OficinasAPI::class.java)
            retorno = oficinasAPI.recuperarOficina(codigoAssociado, cpfAssociado)
            if (retorno != null) {
                if (retorno.isSuccessful) {
                    val oficinas = retorno.body()
                    val listaOficina = oficinas?.listaOficinas?.classeOficina
                    listaOficina?.forEach {
                        val OficinasAtivas = listaOficina.filter { it.ativo}
                        withContext(Dispatchers.Main) {
                            listaOficina.let {
                                    rvOficina.adapter = OficinasAdapter(OficinasAtivas)
                                rvOficina.layoutManager = LinearLayoutManager(context)
                            }
                        }
                    }
                    Log.i("teste", "TESTE: $listaOficina" )
                    Log.i("info_oficinas", "Sucesso ao Recuperar oficinas \ncode:${retorno.code()}")
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            Log.e(
                "info_oficinas", "Erro ao Recuperar oficinas \n${e.message}"
            )

        }
    }
}


