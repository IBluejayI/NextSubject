package com.example.nextsubject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView vsRecyclerView = (RecyclerView) findViewById(R.id.vsRView);
        RAdapter radapter = new RAdapter(this);
        vsRecyclerView.setAdapter(radapter);
        vsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView ssRecyclerView = (RecyclerView) findViewById(R.id.vsRView);
        //RAdapter radapter = new RAdapter(this);
        ssRecyclerView.setAdapter(radapter);
        ssRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView scRecyclerView = (RecyclerView) findViewById(R.id.vsRView);
       // RAdapter radapter = new RAdapter(this);
        scRecyclerView.setAdapter(radapter);
        scRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}