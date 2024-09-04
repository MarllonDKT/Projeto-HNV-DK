package com.example.projetohnv.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.projetohnv.R
import com.example.projetohnv.model.ClasseOficina
import com.squareup.picasso.Picasso

//import com.example.projetohnv.databinding.ItemOficinasBinding

class OficinasAdapter(private val listaClasseOficinas: List<ClasseOficina> = listOf())
    : Adapter<OficinasAdapter.OficinasViewHolder>() {

    inner class OficinasViewHolder(itemView: View) : ViewHolder(itemView) {
        val txtTitulo: TextView = itemView.findViewById(R.id.txtTitulo)
        val txtEndereco: TextView = itemView.findViewById(R.id.txtEndereco)
        val image: ImageView = itemView.findViewById(R.id.imageView)

    }
    /* inner class OficinasViewHolder(itemBinding: ItemOficinasBinding)
         : ViewHolder(itemBinding.root)*/

    // Criou a visualização
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OficinasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        // Converteu XML num objeto tipo VIEW
        val itemView = layoutInflater.inflate(
            R.layout.item_oficinas,
            parent,
            false
        )
        return OficinasViewHolder(itemView)
    }

    // Recuperar a quantidade de itens
    override fun getItemCount(): Int {
        return listaClasseOficinas.size
    }

    // Ao vincular o view holder
    override fun onBindViewHolder(holder: OficinasViewHolder, position: Int) {
        val oficinas = listaClasseOficinas[position]

            holder.txtTitulo.text = oficinas.descricaoCurta
            holder.txtEndereco.text = oficinas.endereco
            Picasso.get().load(oficinas.foto).into(holder.image)


    }
}