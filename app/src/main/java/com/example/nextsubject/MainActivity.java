package com.example.nextsubject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static int isNewUser; //1 = new, 0 = not
    public static ArrayList<String> subList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        int defaultValue = 1;
        isNewUser= sharedPref.getInt(getString(R.string.is_new_user_key), defaultValue);
        Log.d("TAG", String.valueOf(isNewUser));

        subList = new ArrayList<String>();
        subList.add("None");
        subList.add("1");
        subList.add("2");
        subList.add("3");
        subList.add("4");
        subList.add("5");
        subList.add("6");
        subList.add("7");
        subList.add("8");
        subList.add("9");
        subList.add("10");
        subList.add("11");
        subList.add("12");
        subList.add("13");
        subList.add("14");
        subList.add("15");
        subList.add("16");
        subList.add("1");
        subList.add("2");
        subList.add("3");
        subList.add("4");
        subList.add("5");
        subList.add("6");
        subList.add("7");
        subList.add("8");
        subList.add("9");
        subList.add("10");
        subList.add("11");
        subList.add("12");
        subList.add("13");
        subList.add("14");
        subList.add("15");
        subList.add("16");
    }
}