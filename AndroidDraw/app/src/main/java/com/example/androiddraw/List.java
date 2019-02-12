package com.example.androiddraw;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class List extends ListActivity {

    String[] names = {"Андрей", "Ваня", "Сергей", "Олег"};
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        setListAdapter(mAdapter);
    }

}
