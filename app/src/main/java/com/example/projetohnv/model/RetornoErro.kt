package com.example.projetohnv.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "RetornoErro")
data class RetornoErro(
    @field:Element(name = "retornoErro", required = false)
    var retornoErro: String? = null
)