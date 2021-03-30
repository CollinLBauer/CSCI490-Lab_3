package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView class_schedule;
    String[] classes;
    ArrayAdapter<String> class_adapter;
x
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        class_schedule = findViewById(R.id.class_schedule);
        classes = getResources().getStringArray(R.array.classes);

        class_adapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, classes);
        class_schedule.setAdapter(class_adapter);




    }
}