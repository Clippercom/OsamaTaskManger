package com.example.osamataskmanger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.os.Bundle;
import android.widget.ListView;

public class HistoryActivity extends AppCompatActivity {
    private SearchView svhistory;
    private ListView lvhistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        svhistory=findViewById(R.id.svhistory);
        lvhistory=findViewById(R.id.lvhistory);
    }
}