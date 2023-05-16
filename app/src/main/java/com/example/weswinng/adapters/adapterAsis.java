package com.example.weswinng.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswinng.Objects.asistent;
import com.example.weswinng.R;
import com.example.weswinng.listener.selectListenerProf;

import java.util.List;

public class adapterAsis extends  RecyclerView.Adapter<adapterAsis.MyViewHolder> {


    private List<asistent> asistents;
    private selectListenerProf selectListenerProfessors;

    public adapterAsis(List<asistent> asistents, selectListenerProf selectListenerProfessors) {
        this.asistents = asistents;
        this.selectListenerProfessors = selectListenerProfessors;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_asis, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bindData(asistents.get(position));
        holder.cardView.setOnClickListener(v -> selectListenerProfessors.onItemClicked(asistents.get(position)));
    }

    @Override
    public int getItemCount() {
        return asistents.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nomProfessor;
        private ImageView pfpProfessor;
        private CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nomProfessor = itemView.findViewById(R.id.tvNomProfessor);
            pfpProfessor = itemView.findViewById(R.id.pfpProfessor);
            cardView = itemView.findViewById(R.id.cardviewProfessor);
        }

        void bindData(final asistent asistent) {
            nomProfessor.setText(asistent.getName());
            pfpProfessor.setImageResource(asistent.getIdProfilePic());
        }
    }
}
