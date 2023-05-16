package com.example.weswinng.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.weswinng.BigAct;
import com.example.weswinng.R;


public class fragment_filtres extends Fragment {

    View vista;
    Spinner spinnerPais, spinnerCiutat;
    Button aplicar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_filtres, container, false);
        init();


        return vista;
    }

    public void init (){
        spinnerCiutat = vista.findViewById(R.id.spinnerCiutatFiltres);
        spinnerPais = vista.findViewById(R.id.spinnerPaisFiltres);
        aplicar = vista.findViewById(R.id.buttonAplicarFiltres);

        aplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((BigAct) getActivity()).replaceFragmentMoguda(new calendari());

            }
        });


        ArrayAdapter<CharSequence> adapter4=ArrayAdapter.createFromResource(getContext(),
                R.array.ciutats2, android.R.layout.simple_spinner_item);

        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinnerCiutat.setAdapter(adapter4);



        ArrayAdapter<CharSequence> adapter5=ArrayAdapter.createFromResource(getContext(),
                R.array.paisos, android.R.layout.simple_spinner_item);

        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinnerPais.setAdapter(adapter5);


    }
}