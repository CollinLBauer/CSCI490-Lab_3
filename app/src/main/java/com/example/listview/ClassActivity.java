package com.example.listview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ClassActivity extends AppCompatActivity {

    TextView classView;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        context = getApplicationContext();
        classView = findViewById(R.id.class_text_view);
        Intent intentIn = getIntent();
        classView.setText(intentIn.getStringExtra("className"));


    }



}
