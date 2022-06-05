package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button imageButton = (Button) findViewById(R.id.button11);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Group.class);
                startActivity(intent);
            }
        });

        Button imageButton2 = (Button) findViewById(R.id.button9);
        imageButton2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ranking.class);
                startActivity(intent);
            }
        });


        Button imageButton3 = (Button) findViewById(R.id.button10);
        imageButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), planner.class);
                startActivity(intent);
            }
        });


        Button imageButton4 = (Button) findViewById(R.id.button8);
        imageButton4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mypage.class);
                startActivity(intent);
            }
        });

        Button imageButton5 = (Button) findViewById(R.id.button12);
        imageButton5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), free.class);
                startActivity(intent);
            }
        });

        Button imageButton6 = (Button) findViewById(R.id.button18);
        imageButton6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Basic.class);
                startActivity(intent);
            }
        });
    }

}