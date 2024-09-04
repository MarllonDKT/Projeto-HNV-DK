package com.example.projetohnv.model

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.NamespaceList
import org.simpleframework.xml.Root

@Root(name = "ClasseRetornoOficina", strict = false)
@NamespaceList(
    Namespace(reference = "http://schemas.datacontract.org/2004/07/ProvaConhecimentoWebApi.Dominio.DTO", prefix = ""),
    Namespace(reference = "http://www.w3.org/2001/XMLSchema-instance", prefix = "i")
)
data class ClasseRetornoOficina(
    @field:Element(name = "ListaOficinas")
    var listaOficinas: ListaOficinas? = null,
    @field:Element(name = "RetornoErro")
    var retornoErro: RetornoErro? = null,
    @field:Attribute(name = "i:nil", required = false)
    var token: String? = null
)