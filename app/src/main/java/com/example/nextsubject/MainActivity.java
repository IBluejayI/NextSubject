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

/*        RecyclerView vsRecyclerView = (RecyclerView) findViewById(R.id.vsRView);
        RAdapter radapter = new RAdapter();
        vsRecyclerView.setAdapter(radapter);
        vsRecyclerView.setLayoutManager(new LinearLayoutManager(this));*/

    }
}