package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView class_schedule;
    String[] classes;
    ArrayAdapter<String> class_adapter;
    Context context;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        class_schedule = findViewById(R.id.class_schedule);
        classes = getResources().getStringArray(R.array.classes);
        class_adapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, classes);
        class_schedule.setAdapter(class_adapter);

        Toast toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);

        class_schedule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                toast.setText(getResources().getString(R.string.toast_short));
                toast.show();
                Log.i(TAG, "onItemClick");
                Intent clickIntent = new Intent(context, ClassActivity.class);
                //clickIntent.putExtra("classID", position);
                clickIntent.putExtra("className", classes[position]);
                startActivity(clickIntent);
            }
        });
        class_schedule.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                toast.setText(getResources().getString(R.string.toast_long));
                toast.show();
                Log.i(TAG, "onItemLooooooooongClick");
                return true;
            }
        });

    }
}