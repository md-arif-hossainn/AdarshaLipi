package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;


public class BanglaBornomala extends AppCompatActivity {

//ads



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla_bornomala);

        StartAppSDK.init(this, "205543590", false);

//        getSupportActionBar().setTitle("বাংলা বর্নমাল");
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

    public void banjon(View view) {

        Intent Bt = new Intent(BanglaBornomala.this,BanjonBorno.class);
        startActivity(Bt);
        StartAppAd.showAd(this);

    }

    public void soroborno(View view) {
        Intent st = new Intent(BanglaBornomala.this,shorborno.class);
        startActivity(st);
        StartAppAd.showAd(this);
    }
}