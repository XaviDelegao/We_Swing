package com.example.weswinng.adapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswinng.Objects.novetat;
import com.example.weswinng.R;
import com.example.weswinng.listener.selectListenerNovetats;

import java.util.List;

public class adapterNovetats extends RecyclerView.Adapter<adapterNovetats.MyViewHolder> {

    private List<novetat> novetatsList;
    private selectListenerNovetats listenerMoguda;

    public adapterNovetats(List<novetat> novetatsList, selectListenerNovetats listenerMoguda) {
        this.novetatsList = novetatsList;
        this.listenerMoguda = listenerMoguda;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_moguda_feed,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bindData(novetatsList.get(position));

        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listenerMoguda.onItemClicked(novetatsList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return novetatsList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView pfp;
        TextView desc;
        TextView hores;
        CardView cv;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            pfp = itemView.findViewById(R.id.pfpMoguda);
            desc = itemView.findViewById(R.id.mogudaTxt);
            hores = itemView.findViewById(R.id.horesTxt);
            cv = itemView.findViewById(R.id.cardView);

        }

        void bindData(final novetat novetat){
            pfp.setImageResource(novetat.getFoto());
            desc.setText(novetat.getDescripcio());
            hores.setText(novetat.getHores());
        }
    }
}
