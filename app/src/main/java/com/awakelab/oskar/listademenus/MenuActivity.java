package com.awakelab.oskar.listademenus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.awakelab.oskar.listademenus.databinding.ActivityMainBinding;
import com.awakelab.oskar.listademenus.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initList();

    }
    private void initList() {
        ArrayList listadoMenu = new ArrayList();
        listadoMenu.add("Puré de calabacín");
        listadoMenu.add("Tortilla de patatas");
        listadoMenu.add("Albóndigas de pollo");
        listadoMenu.add("Ensalada de tomate");
        listadoMenu.add("Leche, pan con aceite y fruta");
        listadoMenu.add("Lentejas vegetales");
        listadoMenu.add("Croquetas de atún");
        listadoMenu.add("Menestra de verduras");
        listadoMenu.add("Sardinas al horno");
        listadoMenu.add("Leche, pan con aceite y fruta");
        listadoMenu.add("Macarrones con verduras");
        listadoMenu.add("Pollo a la cerveza");
        listadoMenu.add("Sopa juliana");
        listadoMenu.add("Corvina al ajillo");
        listadoMenu.add("Leche, pan con aceite y fruta");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listadoMenu);

        binding.listadoMenu.setAdapter(adapter);
        setSupportActionBar(binding.toolbar);
        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) { onBackPressed(); }
            });
    }
}