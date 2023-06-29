package com.awakelab.oskar.listademenus;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.awakelab.oskar.listademenus.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnListaMenu.setOnClickListener(v -> {
            Intent intentListadoMenu = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intentListadoMenu);
        });
    }


}

