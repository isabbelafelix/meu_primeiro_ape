package com.example.projetomeuprimeiroape.Ui.Fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetomeuprimeiroape.R

class FragmentsMainActivity : AppCompatActivity(), CaracteristicasListasFragment.OnListSelected {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container_root, CaracteristicasListasFragment.newInstance(),
                    "caracteristicasLista")
                .commit()

        }
    }

    override fun onSelected(caracteristicas: Caracteristicas) {

    }

    // COMO ESCUTAR OS EVENTOS?
    // COMO COMUNICAR O FRAGMENT COM A ATIVIDADE, ACTIVITY?
}