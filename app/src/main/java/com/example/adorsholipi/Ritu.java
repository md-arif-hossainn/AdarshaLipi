package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;


public class Ritu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ritu);


      //ads
        StartAppSDK.init(this, "205543590", false);

//        getSupportActionBar().setTitle("ঋতু");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Toolbar toolbarTop = (Toolbar) findViewById(R.id.toolbar_top);
        TextView mTitle = (TextView) toolbarTop.findViewById(R.id.toolbar_title);

        toolbarTop.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        toolbarTop.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void banglaritu(View view) {
        Intent Rt = new Intent(Ritu.this,banglaRitu.class);
        startActivity(Rt);
        StartAppAd.showAd(this);
    }

    public void englishritu(View view) {
        Intent Et = new Intent(Ritu.this,englishRitu.class);
        startActivity(Et);
        StartAppAd.showAd(this);
    }
}