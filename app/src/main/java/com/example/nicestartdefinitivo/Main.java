package com.example.nicestartdefinitivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Main extends AppCompatActivity {

    private ImageView chicogafas;
    private Button b_nopeople;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chicogafas = findViewById(R.id.chicogafas);
        Glide.with(this)
                .load("https://cdn.leonardo.ai/users/8a7cd15d-afce-464f-88e8-cfff739aeab1/generations/233f004b-dd3a-46d3-a7a0-efa13c9d9008/PhotoReal_A_young_man_with_brown_short_wavy_hair_pale_skin_gla_0.jpg?w=512")
                .centerCrop()
                .into(chicogafas);

        b_nopeople = findViewById(R.id.nopeople);

        b_nopeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irNoPeople();
            }
        });


    }

    public void irLogin(View v){

        Intent intent = new Intent(Main.this, Login.class);
        startActivity(intent);

    }

    public void irNoPeople(){

        Intent intent = new Intent(Main.this, Nopeople.class);
        startActivity(intent);

    }

}