package com.example.projetohnv.model

import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Namespace
import org.simpleframework.xml.Root

@Root(name = "ListaOficinas")
@Namespace(reference = "http://schemas.datacontract.org/2004/07/ProvaConhecimentoWebApi.Dominio.ObjetoDominio")
data class ListaOficinas(
    @field:ElementList(inline = true)
    var classeOficina: List<ClasseOficina>? = null
)