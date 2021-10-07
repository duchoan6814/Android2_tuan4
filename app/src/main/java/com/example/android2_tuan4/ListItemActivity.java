package com.example.android2_tuan4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

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

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        getWindow().setEnterTransition(fade);

        getWindow().setExitTransition(fade);

        generateListPlant();

        ItemAdapter itemAdapter = new ItemAdapter(plants, this);
        rcvMain.setAdapter(itemAdapter);
        rcvMain.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
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