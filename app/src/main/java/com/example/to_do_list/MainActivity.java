package com.example.to_do_list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void goDiary(View v){
        Intent go_next = new Intent(this, DiaryActivity.class);
        startActivity(go_next);
    }
    public void goArchive(View v){
        Intent go_next = new Intent(this, ArchiveActivity.class);
        startActivity(go_next);
    }
    public void goPlan(View v){
        Intent go_next = new Intent(this, PlanActivity.class);
        startActivity(go_next);
    }
    public void goTrashcan(View v){
        Intent go_next = new Intent(this, TrashcanActivity.class);
        startActivity(go_next);
    }


}