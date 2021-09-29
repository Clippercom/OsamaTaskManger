package com.example.osamataskmanger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private SearchView svSearchTask;
    private ListView lstvAllTask;
    private FloatingActionButton faBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       svSearchTask=findViewById(R.id.svSearchTask);
       lstvAllTask=findViewById(R.id.lstvAllTask);
        faBtn=findViewById(R.id.faBtn);

    }
}