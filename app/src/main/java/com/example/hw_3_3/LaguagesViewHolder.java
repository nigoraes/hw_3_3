package com.example.hw_3_3;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class LaguagesViewHolder extends RecyclerView.ViewHolder {


    private TextView tv_Language;


    public LaguagesViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_Language = itemView.findViewById(androidx.core.R.id.text);

    }

    public void bind(String name ) {
        tv_Language.setText(name);
    }
}
