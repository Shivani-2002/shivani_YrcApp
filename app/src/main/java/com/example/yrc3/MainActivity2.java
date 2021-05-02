package com.example.yrc3;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

import java.util.Objects;


public class MainActivity2 extends AppCompatActivity {
    private TextInputLayout name;
    private TextInputLayout reason;
    private TextInputLayout units;
    private TextInputLayout location;
    private TextInputLayout contact;
    private TextInputLayout bloodgrp;
    private final FirebaseFirestore firestore=FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.outlinedTextField1);
        bloodgrp=findViewById(R.id.outlinedTextField2);
        reason=findViewById(R.id.outlinedTextField3);
        units=findViewById(R.id.outlinedTextField4);
        location=findViewById(R.id.outlinedTextField5);
        contact=findViewById(R.id.outlinedTextField6);

        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(v -> {
            HashMap<String,Object> map= new HashMap<>();
            map.put("Name", Objects.requireNonNull(name.getEditText()).getText().toString());
            map.put("Blood Group", Objects.requireNonNull(bloodgrp.getEditText()).getText().toString());
            map.put("Reason", Objects.requireNonNull(reason.getEditText()).getText().toString());
            map.put("Units", Objects.requireNonNull(units.getEditText()).getText().toString());
            map.put("Hospital and Location", Objects.requireNonNull(location.getEditText()).getText().toString());
            map.put("Contact No", Objects.requireNonNull(contact.getEditText()).getText().toString());

            firestore.collection("User").document(name.getEditText().getText().toString()).set(map);

            Toast mytoast= Toast.makeText(getApplicationContext(), "Submitted",Toast.LENGTH_SHORT);
            mytoast.setGravity(Gravity.BOTTOM, 0, 0);
            mytoast.show();

        });


    }


    }


