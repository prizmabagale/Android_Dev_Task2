package com.example.myapplication4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PhoneActivity extends AppCompatActivity {
    EditText e;
    Button b;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        e=findViewById(R.id.input);
        b=findViewById(R.id.send);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                String output = e.getText().toString();
                i.putExtra("output",output);
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }
}
