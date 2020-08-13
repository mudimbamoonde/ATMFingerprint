package com.mudimbasoftware.atmfingerprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button deposit,checkBalance,withdrawal,statement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deposit = findViewById(R.id.deposit);
        checkBalance = findViewById(R.id.checkBalance);
        withdrawal = findViewById(R.id.withdrawal);
        statement = findViewById(R.id.statement);
        deposit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent deposit = new Intent(MainActivity.this,Deposit.class);
                startActivity(deposit);
            }
        });

        checkBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balance = new Intent(MainActivity.this,Balance.class);
                startActivity(balance);
            }
        });

        withdrawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent withdrawal = new Intent(MainActivity.this,withdrawal.class);
                startActivity(withdrawal);
            }
        });

        statement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent statement = new Intent(MainActivity.this,statments.class);
                startActivity(statement);
            }
        });




    }
}