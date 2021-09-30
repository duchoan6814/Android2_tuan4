package com.example.android2_tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class WellcomeActivity extends AppCompatActivity {

    private Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        btnGo = findViewById(R.id.btnGo);

        btnGo.setOnClickListener(view -> handleClickButtnGo());
    }

    private void handleClickButtnGo() {
        startActivity(new Intent(getApplicationContext(), ListItemActivity.class));
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
    }
}