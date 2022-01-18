package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startapp.sdk.adsbase.StartAppSDK;


public class EnglishBornomala extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_bornomala);

        //ads
        StartAppSDK.init(this, "205543590", false);

//        getSupportActionBar().setTitle("ইংরেজি বর্নমালা");
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


        RecyclerView recyclerView = findViewById(R.id.recyclerViewENG);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        EnglishData[] englishData = new EnglishData[]  {

                new EnglishData("A","Apple",R.drawable.apple),
                new EnglishData("B","Ball",R.drawable.ball),
                new EnglishData("C","Cat",R.drawable.cat),
                new EnglishData("D","Doll",R.drawable.dolls),
                new EnglishData("E","Elephant",R.drawable.elepant),
                new EnglishData("F","Frog",R.drawable.frog),
                new EnglishData("G","Guitar",R.drawable.guitar),
                new EnglishData("H","Horse",R.drawable.horse),
                new EnglishData("I","Ink",R.drawable.ink),
                new EnglishData("J","Jet",R.drawable.jet),
                new EnglishData("K","Kite",R.drawable.kite),
                new EnglishData("L","Lobster",R.drawable.lobester),
                new EnglishData("M","Mango",R.drawable.mango),
                new EnglishData("N","Nest",R.drawable.nest),
                new EnglishData("O","Orange",R.drawable.orange),
                new EnglishData("P","Pencil",R.drawable.pencil),
                new EnglishData("Q","Quail",R.drawable.qual),
                new EnglishData("R","Rabbit",R.drawable.rabbitjpg),
                new EnglishData("S","Spider",R.drawable.spider),
                new EnglishData("T","Tomato",R.drawable.tometo),
                new EnglishData("U","Uniform",R.drawable.uniform),
                new EnglishData("V","Vulture",R.drawable.shokun),
                new EnglishData("W","Wagon",R.drawable.wagon),
                new EnglishData("X","Fox",R.drawable.fox),
                new EnglishData("Y","Yak",R.drawable.yak),
                new EnglishData("Z","Zebra",R.drawable.zabra),





        };


    EnglishAdapter englishAdapter = new EnglishAdapter(englishData,EnglishBornomala.this);
    recyclerView.setAdapter(englishAdapter);


    }
}