package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startapp.sdk.adsbase.StartAppSDK;


public class BanjonBorno extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banjon_borno);


       //ads
        StartAppSDK.init(this, "205543590", false);


//        getSupportActionBar().setTitle("ব্যঞ্জনবর্ণ");
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

        RecyclerView recyclerView = findViewById(R.id.recyclerViewBa);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        BanjonbornoData[] banjonbornoData = new BanjonbornoData[]{
                new BanjonbornoData("ক","কলা",R.drawable.banana),
                new BanjonbornoData("খ","খরগোশ",R.drawable.rabbitjpg),
                new BanjonbornoData("গ","গরু",R.drawable.cow),
                new BanjonbornoData("ঘ","ঘোড়া",R.drawable.horse),
                new BanjonbornoData("ব","ব্যাঙ",R.drawable.frog),
                new BanjonbornoData("চ","চড়ুই",R.drawable.sparrow),
                new BanjonbornoData("ছ","ছাতা",R.drawable.umrella),
                new BanjonbornoData("জ","জাহাজ",R.drawable.ship),
                new BanjonbornoData("ঝ","ঝুড়ি",R.drawable.basket),
                new BanjonbornoData("ঞ","মিঞ",R.drawable.cat),
                new BanjonbornoData("ট","টমেটো",R.drawable.tometo),
                new BanjonbornoData("ঠ","ঠোঁট",R.drawable.bird),
                new BanjonbornoData("ড","ডিম",R.drawable.basket),
                new BanjonbornoData("ঢ","ঢেঁড়স",R.drawable.ladyinger),
                new BanjonbornoData("ণ","হরিণ",R.drawable.deer),
                new BanjonbornoData("ত","তাল",R.drawable.sugarpalm),
                new BanjonbornoData("থ","থলে",R.drawable.bag),
                new BanjonbornoData("দ","দোয়েল",R.drawable.doel),
                new BanjonbornoData("ধ","ধান",R.drawable.daan),
                new BanjonbornoData("ন","নৌকা",R.drawable.nouka),
                new BanjonbornoData("প","পেঁপে",R.drawable.papy),
                new BanjonbornoData("ফ","ফুল",R.drawable.flowers),
                new BanjonbornoData("ব","বল",R.drawable.ball),
                new BanjonbornoData("ভ","ভাল্লুক",R.drawable.bear),
                new BanjonbornoData("ম","ময়ুর",R.drawable.peacok),
                new BanjonbornoData("য","যব",R.drawable.weat),
                new BanjonbornoData("র","রেলগাড়ি",R.drawable.rail),
                new BanjonbornoData("ল","লাটিম",R.drawable.top),
                new BanjonbornoData("শ","শকুন",R.drawable.shokun),
                new BanjonbornoData("ষ","ষাঁড়",R.drawable.bull),
                new BanjonbornoData("স","সিংহ",R.drawable.lion),
                new BanjonbornoData("হ","হরিণ",R.drawable.deer),
                new BanjonbornoData("ড়","ঘুড়ি",R.drawable.kite),
                new BanjonbornoData("ঢ়","আষাঢ়",R.drawable.asar),
                new BanjonbornoData("য়","গয়না",R.drawable.goyna),
                new BanjonbornoData("ৎ","কাৎলা",R.drawable.cattole),
                new BanjonbornoData("ং","ফড়িং",R.drawable.foring),
                new BanjonbornoData("ঃ","দুঃখ",R.drawable.sad),
                new BanjonbornoData("ঁ","পাঁচ",R.drawable.fivejpg),


        };

        BanjonbornoAdapter banjonbornoAdapter= new BanjonbornoAdapter(banjonbornoData,BanjonBorno.this);
      recyclerView.setAdapter(banjonbornoAdapter);


    }
}