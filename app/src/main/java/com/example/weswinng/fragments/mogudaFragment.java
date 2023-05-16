package com.example.weswinng.fragments;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.weswinng.BigAct;
import com.example.weswinng.R;


public class mogudaFragment extends Fragment {

    View vista;
    Button assistencia;
    CardView cv ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista= inflater.inflate(R.layout.fragment_moguda, container, false);
        assistencia = vista.findViewById(R.id.asistentsButton);
        cv = vista.findViewById(R.id.oganitzadorcvvv);

        assistencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((BigAct) getActivity()).replaceFragmentMoguda(new asisfragment());

            }
        });

        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((BigAct) getActivity()).replaceFragmentMoguda(new fragment_escola());

            }
        });


        return vista;
    }
}