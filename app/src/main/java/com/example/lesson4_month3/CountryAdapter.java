package com.example.lesson4_month3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private ArrayList<Country> countries;


    public void setList(ArrayList<Country> list){
        this.countries = list;
        notifyDataSetChanged();
    }
    public CountryAdapter(ArrayList<Country> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.item_country, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCountry;
        private TextView tvCapital;
        private ImageView ivFlagCountry;
        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCountry = itemView.findViewById(R.id.tv_country);
            tvCapital = itemView.findViewById(R.id.tv_capital);
            ivFlagCountry =itemView.findViewById(R.id.iv_flagCountry);

        }

        public void bind(Country country){
            tvCountry.setText(country.getCountry());
            tvCapital.setText(country.getCapital());
            Glide.with(ivFlagCountry).load(country.getFlag()).into(ivFlagCountry);

        }

    }
}
