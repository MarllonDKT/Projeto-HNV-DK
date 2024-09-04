package com.example.projetohnv.API

import com.example.projetohnv.model.ClasseRetornoOficina
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OficinasAPI {
    //http://app.hinovamobile.com.br/ProvaConhecimentoWebApi/api/Oficina
// /api/Oficina
    @GET("api/Oficina")
    suspend fun recuperarOficina(
        @Query("codigoAssociacao") codigoAssociacao: Int,
        @Query("cpfAssociado") cpfAssociado: String
    ): Response<ClasseRetornoOficina>

}