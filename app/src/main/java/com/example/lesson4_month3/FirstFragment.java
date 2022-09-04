package com.example.lesson4_month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment implements OnItemClickListener{
    private RecyclerView recyclerView;
    private ArrayList<Continent> continents;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView_continent);
        loadData();
        ContinentAdapter adapter = new ContinentAdapter(continents, this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(int position) {
        SecondFragment secondFragment = new SecondFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("pos", position);
        secondFragment.setArguments(bundle);
    requireActivity().getSupportFragmentManager().beginTransaction().replace
            (R.id.container, secondFragment).addToBackStack(null).commit();
    }

    private void loadData() {
        continents = new ArrayList<>();
        continents.add(new Continent(R.drawable.ic_asia,"Азия"));
        continents.add(new Continent(R.drawable.ic_europe, "Европа"));
        continents.add(new Continent(R.drawable.ic_north_america, "Северная Америка"));
        continents.add(new Continent(R.drawable.ic_south_america, "Южная Америка"));
        continents.add(new Continent(R.drawable.ic_afrika, "Африка"));
        continents.add(new Continent(R.drawable.ic_australia, "Австралия"));

    }


}