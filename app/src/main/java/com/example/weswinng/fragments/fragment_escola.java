package com.example.weswinng.fragments;

import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.weswinng.BigAct;
import com.example.weswinng.R;


public class fragment_escola extends Fragment {
    View vista;
    Button socProfessor, profes;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista =  inflater.inflate(R.layout.fragment_escola, container, false);
        ((BigAct) getActivity()).changeTitle("Escola");
        socProfessor = vista.findViewById(R.id.escola_socprofessor);
        socProfessor.setOnClickListener(v -> {
            DialogFragment avis = new AvisFragment();
            avis.show(getChildFragmentManager(), "AVIS");
        });


        profes = vista.findViewById(R.id.escola_btn_profes);
        profes.setOnClickListener(v -> {
            ((BigAct) getActivity()).replaceFragmentMoguda(new asisfragment());
            ((BigAct) getActivity()).changeTitle("Profesors");
        });



        return vista;
    }
}