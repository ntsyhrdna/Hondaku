package com.SI5B.hondaku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHonda;
    private ArrayList<ModelHonda> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHonda = findViewById(R.id.rv_honda);
        rvHonda.setHasFixedSize(true);

        data.addAll(DataHonda.ambilDataHonda());
        tampilDataGrid();
    }

    private void tampilDataHonda(){
        AdapterHonda AP = new AdapterHonda(data, MainActivity.this);

        rvHonda.setLayoutManager(new LinearLayoutManager(this));
        rvHonda.setAdapter(AP);
    }

    private void tampilDataGrid(){
        AdapterGrid AG = new AdapterGrid(data, MainActivity.this);

        rvHonda.setLayoutManager(new GridLayoutManager(this, 2));
        rvHonda.setAdapter(AG);
    }


}
