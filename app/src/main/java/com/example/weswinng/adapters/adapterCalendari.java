package com.example.weswinng.adapters;

import android.icu.text.CaseMap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswinng.Objects.MogudaObject;
import com.example.weswinng.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class adapterCalendari extends RecyclerView.Adapter<adapterCalendari.MyviewHolder> {

    List<MogudaObject> mos;

    public adapterCalendari(List<MogudaObject> mos) {
        this.mos = mos;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyviewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mogudes_calendar,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.bindData(mos.get(position));
    }

    @Override
    public int getItemCount() {
        return mos.size();
    }


    public class MyviewHolder extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView dataGran, title, assistents,duracio,lloc,organitzador;

        public MyviewHolder(@NonNull View itemView){
            super(itemView);
            iv = itemView.findViewById(R.id.IVperfil);
            dataGran = itemView.findViewById(R.id.TVData);
            title = itemView.findViewById(R.id.TitleTV);
            organitzador = itemView.findViewById(R.id.OrganitzaTV);
            duracio = itemView.findViewById(R.id.duracio);
            lloc = itemView.findViewById(R.id.lloc);
            assistents = itemView.findViewById(R.id.assistentsTV);

        }

        void bindData(final MogudaObject mo){
            iv.setImageResource(mo.getImageID());
            dataGran.setText(mo.getDataTop());
            title.setText(mo.getTitle());
            organitzador.setText(mo.getOrganitzat());
            duracio.setText(mo.getDuracio());
            lloc.setText(mo.getLloc());
            assistents.setText(mo.getAssistents());

        }

    }

}
