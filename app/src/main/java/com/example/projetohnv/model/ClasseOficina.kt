package com.example.projetohnv.model
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "ClasseOficina")
data class ClasseOficina(
    @field:Element(name = "Ativo", required = false)
    var ativo: Boolean = false,
    @field:Element(name = "AvaliacaoUsuario", required = false)
    var avaliacaoUsuario: Int = 0,
    @field:Element(name = "CodigoAssociacao", required = false)
    var codigoAssociacao: Int = 0,
    @field:Element(name = "Descricao", required = false)
    var descricao: String? = null,
    @field:Element(name = "DescricaoCurta", required = false)
    var descricaoCurta: String? = null,
    @field:Element(name = "Email", required = false)
    var email: String? = null,
    @field:Element(name = "Endereco", required = false)
    var endereco: String? = null,
    @field:Element(name = "Foto", required = false)
    var foto: String? = null,
    @field:Element(name = "Id", required = false)
    var id: Int = 0,
    @field:Element(name = "Latitude", required = false)
    var latitude: Double = 0.0,
    @field:Element(name = "Longitude", required = false)
    var longitude: Double = 0.0,
    @field:Element(name = "Nome", required = false)
    var nome: String? = null,
    @field:Element(name = "Telefone1", required = false)
    var telefone1: String? = null,
    @field:Element(name = "Telefone2", required = false)
    var telefone2: String? = null
)

/*@Root(name = "Oficina")
class Oficina {
    @field:Element(name = "Id")
    var Id: Int = 0

    @field:Element(name = "Nome")
    var Nome: String? = null

    @field:Element(name = "Descricao")
    var Descricao: String? = null

    @field:Element(name = "DescricaoCurta")
    var DescricaoCurta: String? = null

    @field:Element(name = "Endereco")
    var Endereco: String? = null

    @field:Element(name = "Latitude")
    var Latitude: String? = null

    @field:Element(name = "Longitude")
    var Longitude: String? = null

    @field:Element(name = "Foto")
    var Foto: String? = null

    @field:Element(name = "AvaliacaoUsuario")
    var AvaliacaoUsuario: Int = 0

    @field:Element(name = "CodigoAssociacao")
    var CodigoAssociacao: Int = 0

    @field:Element(name = "Email")
    var Email: String? = null

    @field:Element(name = "Telefone1", required = false)
    var Telefone1: String? = null

    @field:Element(name = "Telefone2", required = false)
    var Telefone2: String? = null

    @field:Element(name = "Ativo")
    var Ativo: Boolean = false
}*/
