package com.example.weswinng.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weswinng.BigAct;
import com.example.weswinng.Objects.asistent;
import com.example.weswinng.R;
import com.example.weswinng.adapters.adapterAsis;
import com.example.weswinng.listener.selectListenerProf;

import java.util.ArrayList;
import java.util.List;


public class asisfragment extends Fragment implements selectListenerProf {
    List<asistent> asistents;
    RecyclerView novetatsRecycler;
    com.example.weswinng.adapters.adapterAsis adapterAsis;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista= inflater.inflate(R.layout.fragment_asisfragment, container, false);
        novetatsRecycler = vista.findViewById(R.id.recyclerAsis);
        ((BigAct) getActivity()).changeTitle("Assistents");

        startRecycler();

        return vista;
    }

    public void startRecycler() {
        asistents = new ArrayList<>();
        asistents.add(new asistent("Alejandro López", R.drawable.hola));
        asistents.add(new asistent("María García", R.drawable.hola));
        asistents.add(new asistent("Roberto Martínez", R.drawable.hola));
        asistents.add(new asistent("Javier Hernández", R.drawable.hola));

        adapterAsis = new adapterAsis(asistents, this);
        novetatsRecycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        novetatsRecycler.setHasFixedSize(true);
        novetatsRecycler.setAdapter(adapterAsis);
    }

    @Override
    public void onItemClicked(asistent asistent) {

    }
}