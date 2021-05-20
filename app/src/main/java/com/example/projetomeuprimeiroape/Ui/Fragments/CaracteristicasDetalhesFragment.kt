package com.example.projetomeuprimeiroape.Ui.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        return inflater.inflate(R.layout.detalhes_fragment, container, false)
    }
}