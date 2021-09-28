package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MyListView extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView)findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("My Name is Pang");
        arrayList.add("Testing List View");
        arrayList.add("This is a List View");
        arrayList.add("Android Studio is fun!");
        arrayList.add("Hello");
        arrayList.add("My Name is Pang");
        arrayList.add("Testing List View");
        arrayList.add("This is a List View");
        arrayList.add("Android Studio is fun!");
        arrayList.add("Hello");
        arrayList.add("My Name is Pang");
        arrayList.add("Testing List View");
        arrayList.add("This is a List View");
        arrayList.add("Android Studio is fun!");
        arrayList.add("Hello");
        arrayList.add("My Name is Pang");
        arrayList.add("Testing List View");
        arrayList.add("This is a List View");
        arrayList.add("Android Studio is fun!");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
    }

}