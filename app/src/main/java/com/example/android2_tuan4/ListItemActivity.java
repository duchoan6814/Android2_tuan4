package com.example.android2_tuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListItemActivity extends AppCompatActivity {
    private RecyclerView rcvMain;
    private List<Plant> plants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);

        rcvMain = findViewById(R.id.rcvMain);

        generateListPlant();

        ItemAdapter itemAdapter = new ItemAdapter(plants, this);
        rcvMain.setAdapter(itemAdapter);
        rcvMain.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

    }

    private void generateListPlant() {
        plants = new ArrayList<Plant>() {
            {
                add(new Plant("Lavender", 20, ""));
                add(new Plant("Yellow", 40, ""));
                add(new Plant("Light Lavender", 74, ""));
                add(new Plant("Short Lavender", 345, ""));
                add(new Plant("Green Tree", 23, ""));
            }
        };
    }
}