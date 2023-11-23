package com.example.nicestartdefinitivo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class Nopeople extends AppCompatActivity {

    private WebView miVisorWeb;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nopeople);


        /* 1º Hacemos un casting */
        WebView mycontext = (WebView)findViewById(R.id.vistaweb);
        registerForContextMenu(mycontext);

        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.vistaweb);
        swipeRefreshLayout.setOnRefreshListener(mOnRefreshListener);

        WebSettings webSettings = miVisorWeb.getSettings();
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        miVisorWeb.loadUrl("https://thispersondoesnotexist.com");
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.myswipe);
        swipeRefreshLayout.setOnRefreshListener(mOnRefreshListener);



    }

    protected SwipeRefreshLayout.OnRefreshListener
            mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {
            Toast toast0 = Toast.makeText(Nopeople.this, "Hi there! I don't exist :)", Toast.LENGTH_LONG);
            toast0.show();
            miVisorWeb.reload();
            swipeRefreshLayout.setRefreshing(false);
        }
    };



}