package com.example.a782763.day1exercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText name, code, date, days;
    ArrayList<String> friends;
    ListView listView;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        name = findViewById(R.id.name);
        code = findViewById(R.id.code);
        date = findViewById(R.id.date);
        days = findViewById(R.id.days);
        Button show = findViewById(R.id.button);


        friends = new ArrayList<String>();
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,friends);
        listView.setAdapter(arrayAdapter);



    }
    public void show(View view){
        friends.add(name.getText().toString());
        friends.add(code.getText().toString());
        friends.add(date.getText().toString());
        friends.add(days.getText().toString());

    }
}
