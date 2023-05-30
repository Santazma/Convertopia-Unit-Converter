package com.example.unitconverterapp;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toCalculationClick(View v) {
        Intent i = new Intent(this,ConversionActivity.class);
        switch (v.getTag().toString()){
            case "L":
                i.putExtra("FUNCTION", UnitFunctions.LENGTH);
            break;
            case "M":
                i.putExtra("FUNCTION", UnitFunctions.MASS);
                break;
            case "T":
                i.putExtra("FUNCTION",UnitFunctions.TEMP);
                break;



        }
        startActivity(i);



    }

}
