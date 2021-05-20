package com.example.projetomeuprimeiroape.Ui.Fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.projetomeuprimeiroape.R

class CaracteristicasListasFragment : Fragment(){

    private lateinit var titulo: Array<String>
    private lateinit var descricao: Array<String>
    private lateinit var imagemResId: IntArray

    companion object {
        fun newInstance() = CaracteristicasListasFragment()
    }


    // CRIAR UM ADAPTER

    internal inner class CaracteristicasListasFragment(context: Context) : RecyclerView.Adapter<ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder (
                LayoutInflater.from(context).inflate
                    (R.layout.itens_lista, parent, false)
        )


        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
            val caracteristicas = Caracteristicas(
                titulo[position],
                descricao[position],
                imagemResId[position]
            )
            viewHolder.bind(caracteristicas)
        }


        override fun getItemCount() = titulo.size
    }


    // CRIAR UMA VIEWHOLDER

    internal inner class ViewHolder constructor(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        fun bind(caracteristicas: Caracteristicas) {
            itemView.findViewById<ImageView>(R.id.list_image).setImageResource(caracteristicas.imagemResId)
            itemView.findViewById<TextView>(R.id.list_name).text = caracteristicas.titulo
        }

    }


}