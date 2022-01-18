package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.startapp.sdk.adsbase.StartAppSDK;


public class shorborno extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shorborno);


//ads
        StartAppSDK.init(this, "205543590", false);

//        getSupportActionBar().setTitle("স্বরবর্ণ");
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

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        shorbornoData[] shorbornodata = new shorbornoData[]{
                new shorbornoData("অলি","অ",R.drawable.oli),
        new shorbornoData("আম","আ",R.drawable.mango),
        new shorbornoData("ইদুর","ই",R.drawable.rat),
        new shorbornoData("ঈগল","ঈ",R.drawable.eagle),
        new shorbornoData("উঠ","উ",R.drawable.camelll),
        new shorbornoData("ঊষা","ঊ",R.drawable.mornin),
                new shorbornoData("ঋণ","ঋ",R.drawable.tk),
                new shorbornoData("একতারা","এ",R.drawable.ektara),
                new shorbornoData(" ঐরাবত"," ঐ",R.drawable.elepant),
                new shorbornoData("ওলকপি","ও",R.drawable.olkopi),
                new shorbornoData("ঔষধ","ঔ",R.drawable.oosud),


        };



        shorbornoAdapter shorbornoadapter = new shorbornoAdapter(shorbornodata,shorborno.this);
        recyclerView.setAdapter(shorbornoadapter);
    }
}