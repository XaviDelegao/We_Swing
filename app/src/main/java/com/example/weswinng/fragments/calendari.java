package com.example.weswinng.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.weswinng.Objects.MogudaObject;
import com.example.weswinng.R;
import com.example.weswinng.adapters.adapterCalendari;

import java.util.ArrayList;
import java.util.List;


public class calendari extends Fragment {
    View vista;
    TextView amics, assistire, tot;
    TextView filtresTv;
    RecyclerView mogudes;

    List<TextView> tvs = new ArrayList<>();

    public static calendari newInstance(String param1, String param2) {
        calendari fragment = new calendari();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_calendari, container, false);

        init();
        initRecyclerTots();

        return vista;
    }

    public void init() {
        amics = vista.findViewById(R.id.amicsBTN);
        amics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickTV(amics);
                initRecyclerAmics();
            }
        });

        assistire = vista.findViewById(R.id.asistireBTN);
        assistire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickTV(assistire);
                initRecyclerAssistire();
            }
        });


        tot = vista.findViewById(R.id.totsBTN);
        tot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickTV(tot);
                initRecyclerTots();
            }
        });
        tvs.add(amics);
        tvs.add(assistire);
        tvs.add(tot);

        filtresTv = vista.findViewById(R.id.filtresTV);
        mogudes = vista.findViewById(R.id.recyclerMogudes);
    }

    public void initRecyclerTots() {
        List<MogudaObject> mos = new ArrayList<>();

        mos.add(new MogudaObject("17 de abril de 2017", "I'm beggining to see the light", R.drawable.hola, "Organitzat per big Mama", "Madrid, Spain", "17/04/2017-18/04/2017 | 2horas", "0 assistents | 0 amics"));
        mos.add(new MogudaObject("18 de abril de 2017", "I've seen the light", R.drawable.hola, "Organitzat per big Mama", "Madrid, Spain", "18/04/2017-18/04/2017 | 5horas", "0 assistents | 0 amics"));
        mos.add(new MogudaObject("19 de abril de 2017", "I wear sunglasses now", R.drawable.hola, "Organitzat per big Mama", "Madrid, Spain", "19/04/2017-18/04/2017 | 8horas", "0 assistents | 0 amics"));
        mos.add(new MogudaObject("1 de mayo de 2017", "The Light is brighter now", R.drawable.hola, "Organitzat per big Mama", "Madrid, Spain", "1/05/2017-2/04/2017 | 9horas", "0 assistents | 0 amics"));
        mos.add(new MogudaObject("5 de mayo de 2017", "I'm beggining to be blind", R.drawable.hola, "Organitzat per big Mama", "Madrid, Spain", "5/05/2017-16/04/2017 | 1horas", "0 assistents | 0 amics"));
        mos.add(new MogudaObject("7 de mayo de 2017", "I'm officialy blind", R.drawable.hola, "Organitzat per big Mama", "Madrid, Spain", "7/05/2017-8/04/2017 | 2horas", "0 assistents | 0 amics"));


        adapterCalendari adapter = new adapterCalendari(mos);
        mogudes.setLayoutManager(new LinearLayoutManager(vista.getContext(), LinearLayoutManager.VERTICAL, false));
        mogudes.setAdapter(adapter);


    }

    public void initRecyclerAmics() {
        List<MogudaObject> mos = new ArrayList<>();

        mos.add(new MogudaObject("18 de abril de 2017", "Swing jam de dimarts", R.drawable.hola, "Organitzat per Swing Maniacs", "Barcelona, Spain", "18/04/2017 | 1hora", "1 assistents | 1 amics"));
        mos.add(new MogudaObject("19 de abril de 2017", "Space swing jam", R.drawable.hola, "Organitzat per Labron James", "Madrid, Spain", "19/04/2017-18/04/2017 | 8horas", "8 assistents | 4 amics"));
        mos.add(new MogudaObject("1 de mayo de 2017", "Pokemon swingers", R.drawable.hola, "Organitzat per Ash ketchum", "Madrid, Spain", "1/05/2017-2/04/2017 | 9horas", "10 assistents | 9 amics"));


        adapterCalendari adapter = new adapterCalendari(mos);
        mogudes.setLayoutManager(new LinearLayoutManager(vista.getContext(), LinearLayoutManager.VERTICAL, false));
        mogudes.setAdapter(adapter);


    }

    public void initRecyclerAssistire() {
        List<MogudaObject> mos = new ArrayList<>();

        mos.add(new MogudaObject("19 de abril de 2017", "Bal bliss", R.drawable.hola, "Organitzat per big Mama", "Madrid, Spain", "19/04/2017-18/04/2017 | 8horas", "8 assistents | 4 amics"));


        adapterCalendari adapter = new adapterCalendari(mos);
        mogudes.setLayoutManager(new LinearLayoutManager(vista.getContext(), LinearLayoutManager.VERTICAL, false));
        mogudes.setAdapter(adapter);


    }

    public void clickTV(TextView clicked) {
        clicked.setTextColor(getResources().getColor(R.color.white));
        clicked.setBackgroundColor(getResources().getColor(R.color.tematicRed));

        for (TextView tv :
                tvs) {
            if (tv.equals(clicked)) {
                tv.setTextColor(getResources().getColor(R.color.white));
                tv.setBackgroundColor(getResources().getColor(R.color.tematicRed));
            } else {
                tv.setTextColor(getResources().getColor(R.color.textgrey));
                tv.setBackgroundColor(getResources().getColor(R.color.grey));

            }

        }
    }
}