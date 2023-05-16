package com.example.weswinng.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weswinng.BigAct;
import com.example.weswinng.Objects.novetat;
import com.example.weswinng.R;
import com.example.weswinng.adapters.adapterNovetats;
import com.example.weswinng.listener.selectListenerNovetats;

import java.util.ArrayList;
import java.util.List;


public class novetatsFragment extends Fragment implements selectListenerNovetats {
    List<novetat> novetats;

    RecyclerView novetatsRecycler;


    adapterNovetats novetatsAdapter;


    novetat selectedNovetat;


    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista=  inflater.inflate(R.layout.fragment_novetats, container, false);
        novetatsRecycler = vista.findViewById(R.id.recyclerNovetats);
        StartRecycler();


        return vista;
    }

    public void StartRecycler(){
        novetats = new ArrayList<>();
        novetats.add(new novetat(R.drawable.hola,"Maria susana asistira a razzmataz al evento de kidd keo que ballara molt","Fa 10h"));
        novetats.add(new novetat(R.drawable.hola,"Maria susana asistira a razzmataz al evento de kidd keo que ballara molt","Fa 15h"));
        novetats.add(new novetat(R.drawable.hola,"Maria susana asistira a razzmataz al evento de kidd keo que ballara molt","Fa 19h"));
        novetats.add(new novetat(R.drawable.hola,"Maria susana asistira a razzmataz al evento de kidd keo que ballara molt","Fa 20h"));
        novetats.add(new novetat(R.drawable.hola,"Maria susana asistira a razzmataz al evento de kidd keo que ballara molt","Fa 21h"));
        novetats.add(new novetat(R.drawable.hola,"Maria susana asistira a razzmataz al evento de kidd keo que ballara molt","Fa 22h"));
        novetats.add(new novetat(R.drawable.hola,"Maria susana asistira a razzmataz al evento de kidd keo que ballara molt","Fa 23h"));
        novetats.add(new novetat(R.drawable.hola,"Maria susana asistira a razzmataz al evento de kidd keo que ballara molt","Fa 24h"));
        novetats.add(new novetat(R.drawable.hola,"Maria susana asistira a razzmataz al evento de kidd keo que ballara molt","Fa 25h"));

        novetatsAdapter = new adapterNovetats(novetats,this);
        novetatsRecycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        novetatsRecycler.setHasFixedSize(true);
        novetatsRecycler.setAdapter(novetatsAdapter);
    }

    @Override
    public void onItemClicked(novetat novetat) {
        ((BigAct)getActivity()).replaceFragmentMoguda(new mogudaFragment());

    }
}