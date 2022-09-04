package com.example.lesson4_month3;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentAdapter.ContinentViewHolder> {

    private ArrayList<Continent> continents;
    private OnItemClickListener listener;


    public ContinentAdapter(ArrayList<Continent> continents, OnItemClickListener listener) {
        this.continents = continents;
        this.listener = listener;
    }

    public ContinentAdapter(ArrayList<Continent> continents) {

    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_continent, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(continents.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continents.size();
    }

    static class ContinentViewHolder extends RecyclerView.ViewHolder{

        private TextView tvContinent;
        private ImageView flagContinent;

        public ContinentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvContinent = itemView.findViewById(R.id.tv_continent);
            flagContinent = itemView.findViewById(R.id.iv_flagContinent);

        }

        public void bind(Continent continent){
            tvContinent.setText(continent.name);
            Glide.with(flagContinent).load(continent.getFlag()).into(flagContinent);

        }
    }
}
