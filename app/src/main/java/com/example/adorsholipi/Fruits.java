package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startapp.sdk.adsbase.StartAppSDK;


public class Fruits extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);


       //ads
        StartAppSDK.init(this, "205543590", false);

//        getSupportActionBar().setTitle("ফল");
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

        RecyclerView recyclerView = findViewById(R.id.recyclerViewFoll);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        FruitsData[] fruitsData = new FruitsData[]{

                new FruitsData("Almond","বাদাম",R.drawable.almod),
                new FruitsData("pineapple","আনারস",R.drawable.pineapple),
                new FruitsData("Banana","কলা",R.drawable.banana),
                new FruitsData("Berry","জাম",R.drawable.beri),
                new FruitsData("Cashew Nut","কাজুবাদাম",R.drawable.chawnut),
                new FruitsData("Custard Apple","আতা",R.drawable.cusapp),
                new FruitsData("Grape"," আঙ্গুর",R.drawable.graap),
                new FruitsData("Dates","খেজুর",R.drawable.dates),
                new FruitsData(" Fig","ডুমুর",R.drawable.figg),
                new FruitsData("Ground Nut","চীনা বাদাম",R.drawable.groundnuts),
                new FruitsData("Guava","পেয়ারা",R.drawable.guava),
                new FruitsData("Jack Fruit","কাঁঠাল",R.drawable.jackk),
                new FruitsData("Lemon","লেবু",R.drawable.lemon),
                new FruitsData("Lychee","লিচু",R.drawable.lisu),
                new FruitsData("Green Coconut","ডাব",R.drawable.coco),

        };
        FruitsAdapter fruitsadapter = new FruitsAdapter(fruitsData,Fruits.this);
        recyclerView.setAdapter(fruitsadapter);
    }
}