package com.mudimbasoftware.atmfingerprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Balance extends AppCompatActivity {
    TextView current,curBal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);
        current = findViewById(R.id.current);
        curBal = findViewById(R.id.currentBalance);
        current.setText("4674.00");
        curBal.setText("3974.00");
    }
}