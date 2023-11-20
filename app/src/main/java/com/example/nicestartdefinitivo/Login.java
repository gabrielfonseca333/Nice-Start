package com.example.nicestartdefinitivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //Método que se va a usar al pulsar en el Button LOGIN
    public void openMain(View v){
        Intent intent = new Intent(Login.this, Main.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    //Método que se va a usar al pulsar en el Button SINGUP
    public void openSignup(View v) {
        Intent intent = new Intent(Login.this, Signup.class);
        startActivity(intent);
    }

}