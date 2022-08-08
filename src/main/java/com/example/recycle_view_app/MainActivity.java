package com.example.recycle_view_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    String arr[]={"Alok","Kumar","Maurya","Anil","Sunil","Devesh","Skdhnjk","sewffwer","aertgqrh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
recyclerView.setLayoutManager(new LinearLayoutManager(this));
        custom_adapter cc= new custom_adapter(arr);
        recyclerView.setAdapter(cc);
    }
}