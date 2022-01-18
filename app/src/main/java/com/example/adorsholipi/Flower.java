package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startapp.sdk.adsbase.StartAppSDK;


public class Flower extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        //ads
        StartAppSDK.init(this, "205543590", false);

//        getSupportActionBar().setTitle("ফুল");
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

        RecyclerView recyclerView = findViewById(R.id.recyclerViewFlower);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        flowerData[] flowerdata = new flowerData[]{

                new flowerData("দোপাটি","Balsam",R.drawable.balsamc),
                new flowerData("বকুল","Bokul",R.drawable.bokul),
                new flowerData("চাঁপা ফুল","Champak",R.drawable.champak),
                new flowerData("ডালিয়া","Dahlia",R.drawable.dahlia),
                new flowerData("গুলবাহার","Daisy",R.drawable.daisy),
                new flowerData("কাট গোলাপ","Dog rose",R.drawable.dogrose),
                new flowerData("গন্ধরাজ","Gardenia",R.drawable.gardenea),
                new flowerData("জবা","Hibiscus",R.drawable.hibiscus),
                new flowerData("জুঁই","Jasmine",R.drawable.jasmine),
                new flowerData("লিলি","Lily",R.drawable.lily),
                new flowerData("পদ্মফুল","Lotus",R.drawable.lotus),
                new flowerData("মালতি","Malti",R.drawable.malti),
                new flowerData("গোলাপ","Rose",R.drawable.rose),
                new flowerData("গাদাফুল","Marigold",R.drawable.marigold),
                new flowerData("টিউলিপ","Tulip",R.drawable.tulips),
                new flowerData("শাপলা","Water lily",R.drawable.waterlily),

        };

        flowerAdepter floweradepter = new flowerAdepter(flowerdata,Flower.this);
        recyclerView.setAdapter(floweradepter);


    }
}