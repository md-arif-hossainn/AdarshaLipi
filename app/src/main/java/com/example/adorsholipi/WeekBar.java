package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startapp.sdk.adsbase.StartAppAd;


public class WeekBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_bar);



//        getSupportActionBar().setTitle("সপ্তাহের নাম");
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

    public void banglaWeek(View view) {

        Intent bL = new Intent(WeekBar.this,banglaWeek.class);
        startActivity(bL);
        StartAppAd.showAd(this);

    }

    public void EnglishWeek(View view) {
        Intent EL = new Intent(WeekBar.this,englishWeek.class);
        startActivity(EL);
        StartAppAd.showAd(this);

    }
}