package com.tashfia.hospitaldirectory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btn_max,btn_cmc,btn_royel,btn_ustc,btn_metropoliton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_max=(Button)findViewById(R.id.btn_max);
        btn_cmc=(Button)findViewById(R.id.btn_cmc);
        btn_royel=(Button)findViewById(R.id.btn_royel);
        btn_ustc=(Button)findViewById(R.id.btn_ustc);
        btn_metropoliton=(Button)findViewById(R.id.btn_metropoliton);

        btn_max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(HomeActivity.this,DetailActivity.class);
                intent.putExtra("hospital_no","max");

                startActivity(intent);
            }
        });

        btn_cmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(HomeActivity.this,DetailActivity.class);
                intent.putExtra("hospital_no","cmc");
                startActivity(intent);
            }
        });

        btn_royel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(HomeActivity.this,DetailActivity.class);
                intent.putExtra("hospital_no","royel");
                startActivity(intent);
            }
        });
        btn_ustc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(HomeActivity.this,DetailActivity.class);
                intent.putExtra("hospital_no","ustc");
                startActivity(intent);
            }
        });
        btn_metropoliton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(HomeActivity.this,DetailActivity.class);
                intent.putExtra("hospital_no","metropoliton");
                startActivity(intent);
            }
        });


    }
}
