package com.example.adorsholipi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import static com.example.adorsholipi.display.colorlist;
import static com.example.adorsholipi.display.current_brush;
import static com.example.adorsholipi.display.pathlist;

public class magicbord extends AppCompatActivity {



    public static Path path = new Path();
    public static Paint paint_brush = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magicbord);





//        getSupportActionBar().setTitle("ম্যাজিক বোর্ড");
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

    public void pencil(View view) {
        paint_brush.setColor(Color.BLACK);
        current_color(paint_brush.getColor());
    }

    public void eraser(View view) {
        pathlist.clear();
        colorlist.clear();
        path.reset();
    }

    public void redcolor(View view) {
        paint_brush.setColor(Color.RED);
        current_color(paint_brush.getColor());
    }

    public void bluecolor(View view) {
        paint_brush.setColor(Color.BLUE);
        current_color(paint_brush.getColor());
    }

    public void greencolor(View view) {
        paint_brush.setColor(Color.GREEN);
        current_color(paint_brush.getColor());
    }
    public void current_color(int c)
    {
        current_brush = c;
        path = new Path();
    }
}