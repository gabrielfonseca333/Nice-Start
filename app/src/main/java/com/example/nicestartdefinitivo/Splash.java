package com.example.nicestartdefinitivo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Splash extends AppCompatActivity {

    ImageView imFoto;
    ImageView rayo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openAp();


      rayo = findViewById(R.id.logosplash);

        //esto es para la animacion del logo
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.blink);
        rayo.startAnimation(myanim);

//esto para imagenes
        imFoto = findViewById(R.id.backView);
        Glide.with(this)
                .load("https://cdn.leonardo.ai/users/9c914922-cc06-427c-9216-36db1279394a/generations/302e8c6a-3232-49db-b85a-ba98e034908a/variations/Default_magical_and_surreal_art_image_with_a_magnificent_summe_0_302e8c6a-3232-49db-b85a-ba98e034908a_1.jpg?w=512")
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                //.placeholder(new ColorDrawable(this.getResources().getColor(R.color.teal_200)))
                .into(imFoto);


    }

    private void openAp(){

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Login.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);

            }
        },5000);

    }

}