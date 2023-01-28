package com.example.hw_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LanguageAdapter extends RecyclerView.Adapter<LaguagesViewHolder> {

    private ArrayList<String> languageList;

    public LanguageAdapter(ArrayList<String> languageList) {
        this.languageList = languageList;
    }

    @NonNull
    @Override
    public LaguagesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LaguagesViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_language,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LaguagesViewHolder holder, int position) {
        holder.bind(languageList.get(position));
    }

    @Override
    public int getItemCount() {
        return languageList.size();
    }
}
