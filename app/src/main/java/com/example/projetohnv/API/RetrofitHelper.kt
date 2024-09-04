package com.example.projetohnv.API

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

class RetrofitHelper {
    companion object {

        val client = OkHttpClient.Builder()
            .addInterceptor(object : Interceptor {
                override fun intercept(chain: Interceptor.Chain): Response {
                    val request = chain.request().newBuilder()
                        .header("Accept", "application/xml")
                        .build()
                    return chain.proceed(request)
                }
            })
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("http://app.hinovamobile.com.br/ProvaConhecimentoWebApi/")
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .client(client)
            .build()
    }
}