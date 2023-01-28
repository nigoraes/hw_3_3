package com.example.hw_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.hw_3_3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private java.util.ArrayList<String> LanguageList;
    private ArrayList<String> languageList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        LanguageAdapter adapter = new LanguageAdapter(languageList);
        binding.recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        languageList.add("Chinese");
        languageList.add("Arabic");
        languageList.add("Hindi");
        languageList.add("English");
        languageList.add("Tamil");
        languageList.add("Telugu ");
        languageList.add("French ");
        languageList.add("Vietnamese");
        languageList.add("Marathi");
        languageList.add("Javanese");
        languageList.add("German");
        languageList.add("Russian");
    }

}