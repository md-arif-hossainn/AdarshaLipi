package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Colour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour);
//
//        getSupportActionBar().setTitle("রঙ");
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
    public void red(View view) {
        CRed re = new CRed();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,re);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.red);
        ring.start();

    }

    public void yellow(View view) {
        CYellow yl = new CYellow();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,yl);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.yellow);
        ring.start();

    }

    public void blue(View view) {
        CBlue bl = new CBlue();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,bl);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.blue);
        ring.start();

    }

    public void green(View view) {
        CGreen gr = new CGreen();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,gr);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.green);
        ring.start();

    }

    public void orange(View view) {
        COrange or = new COrange();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,or);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.orange);
        ring.start();

    }

    public void black(View view) {
        CBlack bla = new CBlack();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,bla);

        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.black);
        ring.start();

    }


    public void purple(View view) {
        CPurple pu = new CPurple();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,pu);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.purple);
        ring.start();

    }

    public void pink(View view) {
        CPink pi = new CPink();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,pi);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.pink);
        ring.start();
    }

    public void white(View view) {

        CWhite wi = new CWhite();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,wi);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.white);
        ring.start();
    }

    public void megenta(View view) {

        CMagenta mi = new CMagenta();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,mi);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.magenta);
        ring.start();
    }

    public void gray(View view) {

        CGray cg = new CGray();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,cg);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.gray);
        ring.start();
    }

    public void brown(View view) {

        CBrown cb = new CBrown();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frame,cb);
        ft.commit();
        MediaPlayer ring= MediaPlayer.create(Colour.this,R.raw.brown);
        ring.start();
    }
}