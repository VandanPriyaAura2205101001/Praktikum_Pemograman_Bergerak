package com.example.fragmentandroidxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tampilkan FragmentPertama di container_main
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container_main, new FirstFragment())
                    .commit();
        }

        // Tombol untuk menambah fragment dinamis
        Button btnAdd = findViewById(R.id.btnAddFragment);
        btnAdd.setOnClickListener(v -> {
            Fragment newFrag = new ThirdFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.dynamicContainer, newFrag)
                    .addToBackStack(null)
                    .commit();
        });
    }
}
