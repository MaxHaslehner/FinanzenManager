package com.example.mhaslehner.finanzmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KategorieStatistik extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie_statistik);


    }

    public void wochenStatistik(View view)
    {
        Intent i = new Intent(getApplicationContext(),WochenStatistik.class);
        startActivity(i);
    }
}
