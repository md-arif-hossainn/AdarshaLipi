package com.example.adorsholipi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;
    private TextView name,email;

    CardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartAppAd.disableSplash();
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawer);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("আদর্শ লিপি");


        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (item.getItemId()){

                    /** case R.id.login:
                     Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                     break;
                     case R.id.my_order:
                     Toast.makeText(MainActivity.this, "My order", Toast.LENGTH_SHORT).show();
                     break;
                     case R.id.cart:
                     Toast.makeText(MainActivity.this, "Cart", Toast.LENGTH_SHORT).show();
                     break;
                     case R.id.wallet:
                     Toast.makeText(MainActivity.this, "Wallet", Toast.LENGTH_SHORT).show();
                     break;

                     **/
                    case R.id.moreapp:
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=8063233925785316524"));
                        startActivity(intent);
                        Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.Rating:
                        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                        Intent i = new Intent(Intent.ACTION_VIEW,uri);
                        try {
                            startActivity(i);
                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "Unable to open\n"+e.getMessage(), Toast.LENGTH_SHORT).show();
                        }

                        break;

                    case R.id.share:

                        try {
                            Intent in = new Intent(Intent.ACTION_SEND);
                            in.setType("text/plain");
                            String shareBody ="https://play.google.com/store/apps/details?id=com.firstapk.adorsholipi";
                            String shareSub = "সেরা আদর্শ লিপি অ্যাপস";
                            in.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                            in.putExtra(Intent.EXTRA_TEXT, shareBody);
                            startActivity(Intent.createChooser(in, "শেয়ার করুন"));

                        } catch (Exception e) {
                            Toast.makeText(MainActivity.this, "Unable to Share", Toast.LENGTH_SHORT).show();
                        }
                        break;
                }
                return true;
            }
        });

        View hView =  navigationView.getHeaderView(0);
        name = hView.findViewById(R.id.name);
        email = hView.findViewById(R.id.email);
        name.setText("আদর্শ লিপি");
        email.setText("আপনার শিশুকে \nনিয়মিত  স্কুলে পাঠান ।");


        StartAppSDK.init(this, "205543590", false);

        cardView = findViewById(R.id.card_ads);
        cardView.setVisibility(View.GONE);


       //ads


    }



    public void banglaBornomala(View view) {


        Intent bl = new Intent(MainActivity.this,BanglaBornomala.class);
        startActivity(bl);

    }

    public void week(View view) {


        Intent wk = new Intent(MainActivity.this, WeekBar.class);
            startActivity(wk);
    }

    public void ritu(View view) {

            Intent rt = new Intent(MainActivity.this,Ritu.class);
            startActivity(rt);

        }



    public void english(View view) {

        Intent EN = new Intent(MainActivity.this,EnglishBornomala.class);
        startActivity(EN);
        StartAppAd.showAd(this);
    }

    public void number(View view) {


            Intent nt = new Intent(MainActivity.this,Number.class);
            startActivity(nt);
        }



    public void Month(View view) {



        Intent Mt = new Intent(MainActivity.this,Month.class);
        startActivity(Mt);
    }

    public void flower(View view) {


        Intent FT = new Intent(MainActivity.this,Flower.class);
        startActivity(FT);
        StartAppAd.showAd(this);
    }

    public void fruits(View view) {


            Intent FR = new Intent(MainActivity.this,Fruits.class);
            startActivity(FR);
        StartAppAd.showAd(this);


        }



    public void colour(View view) {



        Intent cl = new Intent(MainActivity.this,Colour.class);
        startActivity(cl);
        StartAppAd.showAd(this);
    }

    public void magic(View view) {

        Intent mg = new Intent(MainActivity.this,magicbord.class);
        startActivity(mg);
    }

    @Override
    public void onBackPressed() {
        if(cardView.getVisibility() == View.GONE){
            cardView.setVisibility(View.VISIBLE);
        }else if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
            cardView.setVisibility(View.INVISIBLE);

        }
        else {
            cardView.setVisibility(View.GONE);
        }
        Button b_no = findViewById(R.id.b_no);
        b_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardView.setVisibility(View.GONE);
            }
        });

        Button b_yes = findViewById(R.id.b_yes);
        b_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}