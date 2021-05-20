package com.example.projetomeuprimeiroape.Ui.Fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetomeuprimeiroape.R

class CaracteristicasListasFragment : Fragment(){

    private lateinit var titulo: Array<String>
    private lateinit var descricao: Array<String>
    private lateinit var imagemResId: IntArray

    companion object {
        fun newInstance() = CaracteristicasListasFragment()
    }

    // INFLAR LAYOUT DA RECYCLERVIEW

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.lista_fragment, container, false)

        val activity = activity as Context
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = CaracteristicasListaAdapter()

        return view
    }


    // BUSCAR OS DADOS DA LISTA FALSA


    override fun onAttach(context: Context) {
        super.onAttach(context)

        val resources = context.resources
        titulo = resources.getStringArray(R.array.names)
        descricao = resources.getStringArray(R.array.descriptions)

        // PARA PEGAR AS FOTOS TEM QUE DÁ UM TYPEDARRAY

        val typedArray = resources.obtainTypedArray(R.array.images)
        val imageCount = titulo.size
        for (i in 0 until imageCount) {
            imagemResId[i] = typedArray.getResourceId(i, 0)
        }

    }


    // CRIAR UM ADAPTER

    internal inner class CaracteristicasListaAdapter : RecyclerView.Adapter<ViewHolder>() {

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