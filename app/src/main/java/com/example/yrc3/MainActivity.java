package com.example.yrc3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1;
        b1 = findViewById(R.id.need);
        b1.setOnClickListener(v -> openActivity2());



    }
    public void openActivity2()
    {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);

    }
}