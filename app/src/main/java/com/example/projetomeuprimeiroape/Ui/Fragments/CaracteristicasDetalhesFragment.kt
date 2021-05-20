package com.example.projetomeuprimeiroape.Ui.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.projetomeuprimeiroape.R

class CaracteristicasDetalhesFragment : Fragment() {

    companion object {
        fun newInstance() = CaracteristicasDetalhesFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.detalhes_fragment, container, false)

        val caracteristicas = arguments?.getSerializable("detalhes") as Caracteristicas

        view.findViewById<ImageView>(R.id.image).setImageResource(caracteristicas.imagemResId)
        view.findViewById<TextView>(R.id.titulo).text = caracteristicas.titulo
        view.findViewById<TextView>(R.id.description).text = caracteristicas.descricao


        return view

    }
}